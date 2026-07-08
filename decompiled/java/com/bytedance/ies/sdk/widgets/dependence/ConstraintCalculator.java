package com.bytedance.ies.sdk.widgets.dependence;

import X.C19ME;
import X.C2188811AlT;
import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.sdk.widgets.LayeredConstraintLayout$LayoutParams;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class ConstraintCalculator {
    public final SparseArray<View> childrenViews = new SparseArray<>(150);
    public Set<Constraint> modifyViewConstraints = new LinkedHashSet();

    private final Pair<Constraint, Side> findBaselineStableConstraintAndSide(Constraint constraint) {
        Constraint baseline = constraint.getBaseline();
        if (baseline == null) {
            return null;
        }
        if (!baseline.isParent() && !baseline.isGuideline() && !baseline.isBarrier()) {
            if (this.childrenViews.indexOfKey(baseline.ownerId) >= 0) {
                return new Pair<>(baseline, Side.BASELINE);
            }
            return findBaselineStableConstraintAndSide(baseline);
        }
        return new Pair<>(baseline, Side.BASELINE);
    }

    private final Pair<Constraint, Side> findBottomStableConstraintAndSide(Constraint constraint) {
        Constraint bottom = constraint.getBottom();
        if (bottom == null) {
            return null;
        }
        if (!bottom.isParent() && !bottom.isGuideline() && !bottom.isBarrier()) {
            if (this.childrenViews.indexOfKey(bottom.ownerId) >= 0) {
                if (constraint.bottomToTop != -1) {
                    return new Pair<>(bottom, Side.TOP);
                }
                return new Pair<>(bottom, Side.BOTTOM);
            }
            return findBottomStableConstraintAndSide(bottom);
        }
        return new Pair<>(bottom, Side.BOTTOM);
    }

    private final Pair<Constraint, Side> findEndStableConstraintAndSide(Constraint constraint) {
        Constraint end = constraint.getEnd();
        if (end == null) {
            return null;
        }
        if (!end.isParent() && !end.isGuideline() && !end.isBarrier()) {
            if (this.childrenViews.indexOfKey(end.ownerId) >= 0) {
                if (constraint.endToStart != -1) {
                    return new Pair<>(end, Side.START);
                }
                return new Pair<>(end, Side.END);
            }
            return findEndStableConstraintAndSide(end);
        }
        return new Pair<>(end, Side.END);
    }

    private final Pair<Constraint, Side> findLeftStableConstraintAndSide(Constraint constraint) {
        Constraint left = constraint.getLeft();
        if (left == null) {
            return null;
        }
        if (!left.isParent() && !left.isGuideline() && !left.isBarrier()) {
            if (this.childrenViews.indexOfKey(left.ownerId) >= 0) {
                if (constraint.leftToLeft != -1) {
                    return new Pair<>(left, Side.LEFT);
                }
                return new Pair<>(left, Side.RIGHT);
            }
            return findLeftStableConstraintAndSide(left);
        }
        return new Pair<>(left, Side.LEFT);
    }

    private final Pair<Constraint, Side> findRightStableConstraintAndSide(Constraint constraint) {
        Constraint right = constraint.getRight();
        if (right == null) {
            return null;
        }
        if (!right.isParent() && !right.isGuideline() && !right.isBarrier()) {
            if (this.childrenViews.indexOfKey(right.ownerId) >= 0) {
                if (constraint.rightToLeft != -1) {
                    return new Pair<>(right, Side.LEFT);
                }
                return new Pair<>(right, Side.RIGHT);
            }
            return findRightStableConstraintAndSide(right);
        }
        return new Pair<>(right, Side.RIGHT);
    }

    private final Pair<Constraint, Side> findStartStableConstraintAndSide(Constraint constraint) {
        Constraint start = constraint.getStart();
        if (start == null) {
            return null;
        }
        if (!start.isParent() && !start.isGuideline() && !start.isBarrier()) {
            if (this.childrenViews.indexOfKey(start.ownerId) >= 0) {
                if (constraint.startToStart != -1) {
                    return new Pair<>(start, Side.START);
                }
                return new Pair<>(start, Side.END);
            }
            return findStartStableConstraintAndSide(start);
        }
        return new Pair<>(start, Side.START);
    }

    private final Pair<Constraint, Side> findTopStableConstraintAndSide(Constraint constraint) {
        Constraint top = constraint.getTop();
        if (top == null) {
            return null;
        }
        if (!top.isParent() && !top.isGuideline() && !top.isBarrier()) {
            if (this.childrenViews.indexOfKey(top.ownerId) >= 0) {
                if (constraint.topToTop != -1) {
                    return new Pair<>(top, Side.TOP);
                }
                return new Pair<>(top, Side.BOTTOM);
            }
            return findTopStableConstraintAndSide(top);
        }
        return new Pair<>(top, Side.TOP);
    }

    public final void onViewAdded(ConstraintSolver constraintSolver, View view) {
        Constraint orCreate;
        int id = view.getId();
        if (id == -1) {
            return;
        }
        this.childrenViews.put(id, view);
        if (constraintSolver == null || (orCreate = constraintSolver.getOrCreate(id)) == null || orCreate.isGuideline() || orCreate.isBarrier()) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(orCreate.ownerName);
        sbLIZ.append('(');
        sbLIZ.append(id);
        sbLIZ.append(") added.");
        updateDependentViews(constraintSolver, orCreate, C2188811AlT.LIZIZ(sbLIZ));
    }

    public final void onViewRemoved(ConstraintSolver constraintSolver, View view) {
        Constraint orCreate;
        int id = view.getId();
        if (id == -1) {
            return;
        }
        this.childrenViews.remove(id);
        if (constraintSolver == null || (orCreate = constraintSolver.getOrCreate(id)) == null) {
            return;
        }
        this.modifyViewConstraints.remove(orCreate);
        if (orCreate.isGuideline() || orCreate.isBarrier()) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(orCreate.ownerName);
        sbLIZ.append('(');
        sbLIZ.append(id);
        sbLIZ.append(") removed.");
        updateDependentViews(constraintSolver, orCreate, C2188811AlT.LIZIZ(sbLIZ));
    }

    public final void onViewUpdated(ConstraintSolver constraintSolver, View view) {
        Constraint orCreate;
        int id = view.getId();
        if (id == -1 || constraintSolver == null || (orCreate = constraintSolver.getOrCreate(id)) == null || orCreate.isGuideline() || orCreate.isBarrier()) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(orCreate.ownerName);
        sbLIZ.append('(');
        sbLIZ.append(id);
        sbLIZ.append(") LayoutParams updated.");
        updateDependentViews(constraintSolver, orCreate, C2188811AlT.LIZIZ(sbLIZ));
    }

    private final void findAllDependents(Constraint constraint, Constraint constraint2, Set<Constraint> set) {
        if (constraint2.hasHorizontalDependents()) {
            for (Constraint constraint3 : constraint2.getHorizontalDependents()) {
                if (!constraint3.equals(constraint) && !set.contains(constraint3)) {
                    set.add(constraint3);
                    findAllDependents(constraint, constraint3, set);
                }
            }
        }
        if (constraint2.hasVerticalDependents()) {
            for (Constraint constraint4 : constraint2.getVerticalDependents()) {
                if (!constraint4.equals(constraint) && !set.contains(constraint4)) {
                    set.add(constraint4);
                    findAllDependents(constraint, constraint4, set);
                }
            }
        }
    }

    private final void updateDependentViews(ConstraintSolver constraintSolver, Constraint constraint, String str) {
        View view;
        if (this.modifyViewConstraints.isEmpty()) {
            return;
        }
        LinkedHashSet<Constraint> linkedHashSet = new LinkedHashSet();
        findAllDependents(constraint, constraint, linkedHashSet);
        for (Constraint constraint2 : linkedHashSet) {
            if (this.modifyViewConstraints.contains(constraint2) && (view = this.childrenViews.get(constraint2.ownerId)) != null) {
                updateViewLayoutParams(constraintSolver, view, constraint2, str);
            }
        }
    }

    public final LayeredConstraintLayout$LayoutParams calculateLayoutParams(Context context, ConstraintSolver constraintSolver, int i) {
        Constraint first;
        Constraint first2;
        Constraint first3;
        Constraint first4;
        Constraint first5;
        Constraint first6;
        Constraint first7;
        Constraint first8;
        Constraint first9;
        Constraint first10;
        Constraint first11;
        Constraint first12;
        Constraint first13;
        Constraint first14;
        LayeredConstraintLayout$LayoutParams orCreateLayoutParams = constraintSolver.getOrCreateLayoutParams(context, i);
        if (orCreateLayoutParams == null) {
            orCreateLayoutParams = new LayeredConstraintLayout$LayoutParams(-2, -2);
        }
        Constraint orCreate = constraintSolver.getOrCreate(i);
        if (orCreate == null) {
            return orCreateLayoutParams;
        }
        constraintSolver.resolveDependence(orCreate);
        Pair<Constraint, Side> pairFindLeftStableConstraintAndSide = findLeftStableConstraintAndSide(orCreate);
        if (pairFindLeftStableConstraintAndSide != null) {
            Constraint first15 = pairFindLeftStableConstraintAndSide.getFirst();
            Side second = pairFindLeftStableConstraintAndSide.getSecond();
            if (second == Side.LEFT) {
                orCreateLayoutParams.leftToLeft = first15.ownerId;
            } else if (second == Side.RIGHT) {
                if (!first15.isGuideline() && !first15.isBarrier()) {
                    orCreateLayoutParams.leftToRight = first15.ownerId;
                } else {
                    orCreateLayoutParams.leftToLeft = first15.ownerId;
                }
            }
            first = pairFindLeftStableConstraintAndSide.getFirst();
        } else {
            first = null;
        }
        boolean z = !Intrinsics.LJFF(first, orCreate.getLeft());
        int i2 = orCreateLayoutParams.goneLeftMargin;
        if (i2 != -1 && z) {
            ((ViewGroup.MarginLayoutParams) orCreateLayoutParams).leftMargin = i2;
            orCreateLayoutParams.goneLeftMargin = -1;
        }
        Pair<Constraint, Side> pairFindRightStableConstraintAndSide = findRightStableConstraintAndSide(orCreate);
        if (pairFindRightStableConstraintAndSide != null) {
            Constraint first16 = pairFindRightStableConstraintAndSide.getFirst();
            Side second2 = pairFindRightStableConstraintAndSide.getSecond();
            if (second2 == Side.RIGHT) {
                orCreateLayoutParams.rightToRight = first16.ownerId;
            } else if (second2 == Side.LEFT) {
                if (!first16.isGuideline() && !first16.isBarrier()) {
                    orCreateLayoutParams.rightToLeft = first16.ownerId;
                } else {
                    orCreateLayoutParams.rightToRight = first16.ownerId;
                }
            }
            first2 = pairFindRightStableConstraintAndSide.getFirst();
        } else {
            first2 = null;
        }
        boolean z2 = !Intrinsics.LJFF(first2, orCreate.getRight());
        int i3 = orCreateLayoutParams.goneRightMargin;
        if (i3 != -1 && z2) {
            ((ViewGroup.MarginLayoutParams) orCreateLayoutParams).rightMargin = i3;
            orCreateLayoutParams.goneRightMargin = -1;
        }
        Pair<Constraint, Side> pairFindStartStableConstraintAndSide = findStartStableConstraintAndSide(orCreate);
        if (pairFindStartStableConstraintAndSide != null) {
            Constraint first17 = pairFindStartStableConstraintAndSide.getFirst();
            Side second3 = pairFindStartStableConstraintAndSide.getSecond();
            if (second3 == Side.START) {
                orCreateLayoutParams.startToStart = first17.ownerId;
            } else if (second3 == Side.END) {
                if (!first17.isGuideline() && !first17.isBarrier()) {
                    orCreateLayoutParams.startToEnd = first17.ownerId;
                } else {
                    orCreateLayoutParams.startToStart = first17.ownerId;
                }
            }
            first3 = pairFindStartStableConstraintAndSide.getFirst();
        } else {
            first3 = null;
        }
        boolean z3 = !Intrinsics.LJFF(first3, orCreate.getStart());
        int i4 = orCreateLayoutParams.goneStartMargin;
        if (i4 != -1 && z3) {
            orCreateLayoutParams.setMarginStart(i4);
            orCreateLayoutParams.goneStartMargin = -1;
        }
        Pair<Constraint, Side> pairFindEndStableConstraintAndSide = findEndStableConstraintAndSide(orCreate);
        if (pairFindEndStableConstraintAndSide != null) {
            Constraint first18 = pairFindEndStableConstraintAndSide.getFirst();
            Side second4 = pairFindEndStableConstraintAndSide.getSecond();
            if (second4 == Side.END) {
                orCreateLayoutParams.endToEnd = first18.ownerId;
            } else if (second4 == Side.START) {
                if (!first18.isGuideline() && !first18.isBarrier()) {
                    orCreateLayoutParams.endToStart = first18.ownerId;
                } else {
                    orCreateLayoutParams.endToEnd = first18.ownerId;
                }
            }
            first4 = pairFindEndStableConstraintAndSide.getFirst();
        } else {
            first4 = null;
        }
        boolean z4 = !Intrinsics.LJFF(first4, orCreate.getEnd());
        int i5 = orCreateLayoutParams.goneEndMargin;
        if (i5 != -1 && z4) {
            orCreateLayoutParams.setMarginEnd(i5);
            orCreateLayoutParams.goneEndMargin = -1;
        }
        Pair<Constraint, Side> pairFindTopStableConstraintAndSide = findTopStableConstraintAndSide(orCreate);
        if (pairFindTopStableConstraintAndSide != null) {
            Constraint first19 = pairFindTopStableConstraintAndSide.getFirst();
            Side second5 = pairFindTopStableConstraintAndSide.getSecond();
            if (second5 == Side.TOP) {
                orCreateLayoutParams.topToTop = first19.ownerId;
            } else if (second5 == Side.BOTTOM) {
                if (!first19.isGuideline() && !first19.isBarrier()) {
                    orCreateLayoutParams.topToBottom = first19.ownerId;
                } else {
                    orCreateLayoutParams.topToTop = first19.ownerId;
                }
            }
            first5 = pairFindTopStableConstraintAndSide.getFirst();
        } else {
            first5 = null;
        }
        boolean z5 = !Intrinsics.LJFF(first5, orCreate.getTop());
        int i6 = orCreateLayoutParams.goneTopMargin;
        if (i6 != -1 && z5) {
            ((ViewGroup.MarginLayoutParams) orCreateLayoutParams).topMargin = i6;
            orCreateLayoutParams.goneTopMargin = -1;
        }
        Pair<Constraint, Side> pairFindBottomStableConstraintAndSide = findBottomStableConstraintAndSide(orCreate);
        if (pairFindBottomStableConstraintAndSide != null) {
            Constraint first20 = pairFindBottomStableConstraintAndSide.getFirst();
            Side second6 = pairFindBottomStableConstraintAndSide.getSecond();
            if (second6 == Side.BOTTOM) {
                orCreateLayoutParams.bottomToBottom = first20.ownerId;
            } else if (second6 == Side.TOP) {
                if (!first20.isGuideline() && !first20.isBarrier()) {
                    orCreateLayoutParams.bottomToTop = first20.ownerId;
                } else {
                    orCreateLayoutParams.bottomToBottom = first20.ownerId;
                }
            }
            first6 = pairFindBottomStableConstraintAndSide.getFirst();
        } else {
            first6 = null;
        }
        boolean z6 = !Intrinsics.LJFF(first6, orCreate.getBottom());
        int i7 = orCreateLayoutParams.goneBottomMargin;
        if (i7 != -1 && z6) {
            ((ViewGroup.MarginLayoutParams) orCreateLayoutParams).bottomMargin = i7;
            orCreateLayoutParams.goneBottomMargin = -1;
        }
        Pair<Constraint, Side> pairFindBaselineStableConstraintAndSide = findBaselineStableConstraintAndSide(orCreate);
        if (pairFindBaselineStableConstraintAndSide != null) {
            Constraint first21 = pairFindBaselineStableConstraintAndSide.getFirst();
            if (pairFindBaselineStableConstraintAndSide.getSecond() == Side.BASELINE) {
                orCreateLayoutParams.baselineToBaseline = first21.ownerId;
            }
            first7 = pairFindBaselineStableConstraintAndSide.getFirst();
        } else {
            first7 = null;
        }
        boolean z7 = !Intrinsics.LJFF(first7, orCreate.getBaseline());
        if (!z && !z2 && !z3 && !z4 && !z5 && !z6 && !z7) {
            this.modifyViewConstraints.remove(orCreate);
        } else {
            this.modifyViewConstraints.add(orCreate);
        }
        if (pairFindLeftStableConstraintAndSide != null) {
            first8 = pairFindLeftStableConstraintAndSide.getFirst();
        } else {
            first8 = null;
        }
        if (pairFindRightStableConstraintAndSide != null) {
            first9 = pairFindRightStableConstraintAndSide.getFirst();
        } else {
            first9 = null;
        }
        if (pairFindStartStableConstraintAndSide != null) {
            first10 = pairFindStartStableConstraintAndSide.getFirst();
        } else {
            first10 = null;
        }
        if (pairFindEndStableConstraintAndSide != null) {
            first11 = pairFindEndStableConstraintAndSide.getFirst();
        } else {
            first11 = null;
        }
        if (pairFindTopStableConstraintAndSide != null) {
            first12 = pairFindTopStableConstraintAndSide.getFirst();
        } else {
            first12 = null;
        }
        if (pairFindBottomStableConstraintAndSide != null) {
            first13 = pairFindBottomStableConstraintAndSide.getFirst();
        } else {
            first13 = null;
        }
        if (pairFindBaselineStableConstraintAndSide != null) {
            first14 = pairFindBaselineStableConstraintAndSide.getFirst();
        } else {
            first14 = null;
        }
        printLayoutParams(orCreateLayoutParams, orCreate, first8, first9, first10, first11, first12, first13, first14);
        return orCreateLayoutParams;
    }

    private final void updateViewLayoutParams(ConstraintSolver constraintSolver, View view, Constraint constraint, String str) {
        C19ME c19me = (C19ME) view.getLayoutParams();
        LayeredConstraintLayout$LayoutParams layeredConstraintLayout$LayoutParamsCalculateLayoutParams = calculateLayoutParams(view.getContext(), constraintSolver, view.getId());
        c19me.leftToLeft = layeredConstraintLayout$LayoutParamsCalculateLayoutParams.leftToLeft;
        c19me.leftToRight = layeredConstraintLayout$LayoutParamsCalculateLayoutParams.leftToRight;
        ((ViewGroup.MarginLayoutParams) c19me).leftMargin = ((ViewGroup.MarginLayoutParams) layeredConstraintLayout$LayoutParamsCalculateLayoutParams).leftMargin;
        c19me.goneLeftMargin = layeredConstraintLayout$LayoutParamsCalculateLayoutParams.goneLeftMargin;
        c19me.rightToLeft = layeredConstraintLayout$LayoutParamsCalculateLayoutParams.rightToLeft;
        c19me.rightToRight = layeredConstraintLayout$LayoutParamsCalculateLayoutParams.rightToRight;
        ((ViewGroup.MarginLayoutParams) c19me).rightMargin = ((ViewGroup.MarginLayoutParams) layeredConstraintLayout$LayoutParamsCalculateLayoutParams).rightMargin;
        c19me.goneRightMargin = layeredConstraintLayout$LayoutParamsCalculateLayoutParams.goneRightMargin;
        c19me.startToStart = layeredConstraintLayout$LayoutParamsCalculateLayoutParams.startToStart;
        c19me.startToEnd = layeredConstraintLayout$LayoutParamsCalculateLayoutParams.startToEnd;
        c19me.setMarginStart(layeredConstraintLayout$LayoutParamsCalculateLayoutParams.getMarginStart());
        c19me.goneStartMargin = layeredConstraintLayout$LayoutParamsCalculateLayoutParams.goneStartMargin;
        c19me.endToStart = layeredConstraintLayout$LayoutParamsCalculateLayoutParams.endToStart;
        c19me.endToEnd = layeredConstraintLayout$LayoutParamsCalculateLayoutParams.endToEnd;
        c19me.setMarginEnd(layeredConstraintLayout$LayoutParamsCalculateLayoutParams.getMarginEnd());
        c19me.goneEndMargin = layeredConstraintLayout$LayoutParamsCalculateLayoutParams.goneEndMargin;
        c19me.topToTop = layeredConstraintLayout$LayoutParamsCalculateLayoutParams.topToTop;
        c19me.topToBottom = layeredConstraintLayout$LayoutParamsCalculateLayoutParams.topToBottom;
        ((ViewGroup.MarginLayoutParams) c19me).topMargin = ((ViewGroup.MarginLayoutParams) layeredConstraintLayout$LayoutParamsCalculateLayoutParams).topMargin;
        c19me.goneTopMargin = layeredConstraintLayout$LayoutParamsCalculateLayoutParams.goneTopMargin;
        int i = layeredConstraintLayout$LayoutParamsCalculateLayoutParams.bottomToBottom;
        c19me.bottomToTop = i;
        c19me.bottomToBottom = i;
        ((ViewGroup.MarginLayoutParams) c19me).bottomMargin = ((ViewGroup.MarginLayoutParams) layeredConstraintLayout$LayoutParamsCalculateLayoutParams).bottomMargin;
        c19me.goneBottomMargin = layeredConstraintLayout$LayoutParamsCalculateLayoutParams.goneBottomMargin;
        c19me.baselineToBaseline = layeredConstraintLayout$LayoutParamsCalculateLayoutParams.baselineToBaseline;
        c19me.resolveLayoutDirection(view.getLayoutDirection());
    }

    private final void printLayoutParams(C19ME c19me, Constraint constraint, Constraint constraint2, Constraint constraint3, Constraint constraint4, Constraint constraint5, Constraint constraint6, Constraint constraint7, Constraint constraint8) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        String str14;
        String str15;
        String str16;
        String str17;
        String str18;
        String str19;
        String str20;
        String str21;
        String str22;
        String str23;
        String str24;
        String str25;
        String str26;
        String str27;
        String str28;
        String str29;
        String str30;
        String str31;
        String str32;
        String str33;
        String str34;
        String str35;
        String str36;
        String str37;
        String str38;
        String str39;
        String str40;
        String str41;
        String str42;
        String str43;
        String str44;
        String str45;
        String str46;
        String str47;
        String str48;
        String str49;
        String str50;
        String str51;
        String str52;
        String str53;
        String str54;
        String str55;
        String str56;
        String str57;
        String str58;
        String str59;
        String str60;
        String str61;
        String str62;
        String str63;
        StringBuilder sb = new StringBuilder();
        sb.append("----------------------------------------------\n");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("  view: ");
        sbLIZ.append(constraint.ownerName);
        sbLIZ.append('\n');
        sb.append(C2188811AlT.LIZIZ(sbLIZ));
        if (constraint.leftToLeft != -1) {
            if (c19me.leftToLeft != -1) {
                if (Intrinsics.LJFF(constraint.getLeft(), constraint2)) {
                    sb.append("    # leftToLeft: ");
                    Constraint left = constraint.getLeft();
                    if (left != null) {
                        str63 = left.ownerName;
                    } else {
                        str63 = null;
                    }
                    sb.append(str63);
                    sb.append("\n");
                } else {
                    sb.append("    # leftToLeft: ");
                    Constraint left2 = constraint.getLeft();
                    if (left2 != null) {
                        str61 = left2.ownerName;
                    } else {
                        str61 = null;
                    }
                    sb.append(str61);
                    sb.append(" => leftToLeft: ");
                    if (constraint2 != null) {
                        str62 = constraint2.ownerName;
                    } else {
                        str62 = null;
                    }
                    sb.append(str62);
                    sb.append("\n");
                }
            } else {
                sb.append("    # leftToLeft: ");
                Constraint left3 = constraint.getLeft();
                if (left3 != null) {
                    str59 = left3.ownerName;
                } else {
                    str59 = null;
                }
                sb.append(str59);
                sb.append(" => leftToRight: ");
                if (constraint2 != null) {
                    str60 = constraint2.ownerName;
                } else {
                    str60 = null;
                }
                sb.append(str60);
                sb.append("\n");
            }
        } else if (constraint.leftToRight != -1) {
            if (c19me.leftToLeft != -1) {
                sb.append("    # leftToRight: ");
                Constraint left4 = constraint.getLeft();
                if (left4 != null) {
                    str4 = left4.ownerName;
                } else {
                    str4 = null;
                }
                sb.append(str4);
                sb.append(" => leftToLeft: ");
                if (constraint2 != null) {
                    str5 = constraint2.ownerName;
                } else {
                    str5 = null;
                }
                sb.append(str5);
                sb.append("\n");
            } else if (Intrinsics.LJFF(constraint.getLeft(), constraint2)) {
                sb.append("    # leftToRight: ");
                if (constraint2 != null) {
                    str3 = constraint2.ownerName;
                } else {
                    str3 = null;
                }
                sb.append(str3);
                sb.append("\n");
            } else {
                sb.append("    # leftToRight: ");
                Constraint left5 = constraint.getLeft();
                if (left5 != null) {
                    str = left5.ownerName;
                } else {
                    str = null;
                }
                sb.append(str);
                sb.append(" => leftToRight: ");
                if (constraint2 != null) {
                    str2 = constraint2.ownerName;
                } else {
                    str2 = null;
                }
                sb.append(str2);
                sb.append("\n");
            }
        }
        if (constraint.rightToRight != -1) {
            if (c19me.rightToLeft != -1) {
                sb.append("    # rightToRight: ");
                Constraint right = constraint.getRight();
                if (right != null) {
                    str57 = right.ownerName;
                } else {
                    str57 = null;
                }
                sb.append(str57);
                sb.append(" => rightToLeft: ");
                if (constraint3 != null) {
                    str58 = constraint3.ownerName;
                } else {
                    str58 = null;
                }
                sb.append(str58);
                sb.append("\n");
            } else if (Intrinsics.LJFF(constraint.getRight(), constraint3)) {
                sb.append("    # rightToRight: ");
                if (constraint3 != null) {
                    str56 = constraint3.ownerName;
                } else {
                    str56 = null;
                }
                sb.append(str56);
                sb.append("\n");
            } else {
                sb.append("    # rightToRight: ");
                Constraint right2 = constraint.getRight();
                if (right2 != null) {
                    str54 = right2.ownerName;
                } else {
                    str54 = null;
                }
                sb.append(str54);
                sb.append(" => rightToRight: ");
                if (constraint3 != null) {
                    str55 = constraint3.ownerName;
                } else {
                    str55 = null;
                }
                sb.append(str55);
                sb.append("\n");
            }
        } else if (constraint.rightToLeft != -1) {
            if (c19me.rightToRight != -1) {
                sb.append("    # rightToLeft: ");
                Constraint right3 = constraint.getRight();
                if (right3 != null) {
                    str9 = right3.ownerName;
                } else {
                    str9 = null;
                }
                sb.append(str9);
                sb.append(" => rightToRight: ");
                if (constraint3 != null) {
                    str10 = constraint3.ownerName;
                } else {
                    str10 = null;
                }
                sb.append(str10);
                sb.append("\n");
            } else if (Intrinsics.LJFF(constraint.getRight(), constraint3)) {
                sb.append("    # rightToLeft: ");
                if (constraint3 != null) {
                    str8 = constraint3.ownerName;
                } else {
                    str8 = null;
                }
                sb.append(str8);
                sb.append("\n");
            } else {
                sb.append("    # rightToLeft: ");
                Constraint right4 = constraint.getRight();
                if (right4 != null) {
                    str6 = right4.ownerName;
                } else {
                    str6 = null;
                }
                sb.append(str6);
                sb.append(" => rightToLeft: ");
                if (constraint3 != null) {
                    str7 = constraint3.ownerName;
                } else {
                    str7 = null;
                }
                sb.append(str7);
                sb.append("\n");
            }
        }
        if (constraint.startToStart != -1) {
            if (c19me.startToEnd != -1) {
                sb.append("    # startToStart: ");
                Constraint start = constraint.getStart();
                if (start != null) {
                    str52 = start.ownerName;
                } else {
                    str52 = null;
                }
                sb.append(str52);
                sb.append(" => startToEnd: ");
                if (constraint4 != null) {
                    str53 = constraint4.ownerName;
                } else {
                    str53 = null;
                }
                sb.append(str53);
                sb.append("\n");
            } else if (Intrinsics.LJFF(constraint.getStart(), constraint4)) {
                sb.append("    # startToStart: ");
                if (constraint4 != null) {
                    str51 = constraint4.ownerName;
                } else {
                    str51 = null;
                }
                sb.append(str51);
                sb.append("\n");
            } else {
                sb.append("    # startToStart: ");
                Constraint start2 = constraint.getStart();
                if (start2 != null) {
                    str49 = start2.ownerName;
                } else {
                    str49 = null;
                }
                sb.append(str49);
                sb.append(" => startToStart: ");
                if (constraint4 != null) {
                    str50 = constraint4.ownerName;
                } else {
                    str50 = null;
                }
                sb.append(str50);
                sb.append("\n");
            }
        } else if (constraint.startToEnd != -1) {
            if (c19me.startToStart != -1) {
                sb.append("    # startToEnd: ");
                Constraint start3 = constraint.getStart();
                if (start3 != null) {
                    str14 = start3.ownerName;
                } else {
                    str14 = null;
                }
                sb.append(str14);
                sb.append(" => startToStart: ");
                if (constraint4 != null) {
                    str15 = constraint4.ownerName;
                } else {
                    str15 = null;
                }
                sb.append(str15);
                sb.append("\n");
            } else if (Intrinsics.LJFF(constraint.getStart(), constraint4)) {
                sb.append("    # startToEnd: ");
                if (constraint4 != null) {
                    str13 = constraint4.ownerName;
                } else {
                    str13 = null;
                }
                sb.append(str13);
                sb.append("\n");
            } else {
                sb.append("    # startToEnd: ");
                Constraint start4 = constraint.getStart();
                if (start4 != null) {
                    str11 = start4.ownerName;
                } else {
                    str11 = null;
                }
                sb.append(str11);
                sb.append(" => startToEnd: ");
                if (constraint4 != null) {
                    str12 = constraint4.ownerName;
                } else {
                    str12 = null;
                }
                sb.append(str12);
                sb.append("\n");
            }
        }
        if (constraint.endToEnd != -1) {
            if (c19me.endToStart != -1) {
                sb.append("    # endToEnd: ");
                Constraint end = constraint.getEnd();
                if (end != null) {
                    str47 = end.ownerName;
                } else {
                    str47 = null;
                }
                sb.append(str47);
                sb.append(" => endToStart: ");
                if (constraint5 != null) {
                    str48 = constraint5.ownerName;
                } else {
                    str48 = null;
                }
                sb.append(str48);
                sb.append("\n");
            } else if (Intrinsics.LJFF(constraint.getEnd(), constraint5)) {
                sb.append("    # endToEnd: ");
                if (constraint5 != null) {
                    str46 = constraint5.ownerName;
                } else {
                    str46 = null;
                }
                sb.append(str46);
                sb.append("\n");
            } else {
                sb.append("    # endToEnd: ");
                Constraint end2 = constraint.getEnd();
                if (end2 != null) {
                    str44 = end2.ownerName;
                } else {
                    str44 = null;
                }
                sb.append(str44);
                sb.append(" => endToEnd: ");
                if (constraint5 != null) {
                    str45 = constraint5.ownerName;
                } else {
                    str45 = null;
                }
                sb.append(str45);
                sb.append("\n");
            }
        } else if (constraint.endToStart != -1) {
            if (c19me.endToEnd != -1) {
                sb.append("    # endToStart: ");
                Constraint end3 = constraint.getEnd();
                if (end3 != null) {
                    str19 = end3.ownerName;
                } else {
                    str19 = null;
                }
                sb.append(str19);
                sb.append(" => endToEnd: ");
                if (constraint5 != null) {
                    str20 = constraint5.ownerName;
                } else {
                    str20 = null;
                }
                sb.append(str20);
                sb.append("\n");
            } else if (Intrinsics.LJFF(constraint.getEnd(), constraint5)) {
                sb.append("    # endToStart: ");
                if (constraint5 != null) {
                    str18 = constraint5.ownerName;
                } else {
                    str18 = null;
                }
                sb.append(str18);
                sb.append("\n");
            } else {
                sb.append("    # endToStart: ");
                Constraint end4 = constraint.getEnd();
                if (end4 != null) {
                    str16 = end4.ownerName;
                } else {
                    str16 = null;
                }
                sb.append(str16);
                sb.append(" => endToStart: ");
                if (constraint5 != null) {
                    str17 = constraint5.ownerName;
                } else {
                    str17 = null;
                }
                sb.append(str17);
                sb.append("\n");
            }
        }
        if (constraint.topToTop != -1) {
            if (c19me.topToBottom != -1) {
                sb.append("    # topToTop: ");
                Constraint top = constraint.getTop();
                if (top != null) {
                    str42 = top.ownerName;
                } else {
                    str42 = null;
                }
                sb.append(str42);
                sb.append(" => topToBottom: ");
                if (constraint6 != null) {
                    str43 = constraint6.ownerName;
                } else {
                    str43 = null;
                }
                sb.append(str43);
                sb.append("\n");
            } else if (Intrinsics.LJFF(constraint.getTop(), constraint6)) {
                sb.append("    # topToTop: ");
                if (constraint6 != null) {
                    str41 = constraint6.ownerName;
                } else {
                    str41 = null;
                }
                sb.append(str41);
                sb.append("\n");
            } else {
                sb.append("    # topToTop: ");
                Constraint top2 = constraint.getTop();
                if (top2 != null) {
                    str39 = top2.ownerName;
                } else {
                    str39 = null;
                }
                sb.append(str39);
                sb.append(" => topToTop: ");
                if (constraint6 != null) {
                    str40 = constraint6.ownerName;
                } else {
                    str40 = null;
                }
                sb.append(str40);
                sb.append("\n");
            }
        } else if (constraint.topToBottom != -1) {
            if (c19me.topToTop != -1) {
                sb.append("    # topToBottom: ");
                Constraint top3 = constraint.getTop();
                if (top3 != null) {
                    str24 = top3.ownerName;
                } else {
                    str24 = null;
                }
                sb.append(str24);
                sb.append(" => topToTop: ");
                if (constraint6 != null) {
                    str25 = constraint6.ownerName;
                } else {
                    str25 = null;
                }
                sb.append(str25);
                sb.append("\n");
            } else if (Intrinsics.LJFF(constraint.getTop(), constraint6)) {
                sb.append("    # topToBottom: ");
                if (constraint6 != null) {
                    str23 = constraint6.ownerName;
                } else {
                    str23 = null;
                }
                sb.append(str23);
                sb.append("\n");
            } else {
                sb.append("    # topToBottom: ");
                Constraint top4 = constraint.getTop();
                if (top4 != null) {
                    str21 = top4.ownerName;
                } else {
                    str21 = null;
                }
                sb.append(str21);
                sb.append(" => topToBottom: ");
                if (constraint6 != null) {
                    str22 = constraint6.ownerName;
                } else {
                    str22 = null;
                }
                sb.append(str22);
                sb.append("\n");
            }
        }
        if (constraint.bottomToBottom != -1) {
            if (c19me.bottomToTop != -1) {
                sb.append("    # bottomToBottom: ");
                Constraint bottom = constraint.getBottom();
                if (bottom != null) {
                    str37 = bottom.ownerName;
                } else {
                    str37 = null;
                }
                sb.append(str37);
                sb.append(" => bottomToTop: ");
                if (constraint7 != null) {
                    str38 = constraint7.ownerName;
                } else {
                    str38 = null;
                }
                sb.append(str38);
                sb.append("\n");
            } else if (Intrinsics.LJFF(constraint.getBottom(), constraint7)) {
                sb.append("    # bottomToBottom: ");
                if (constraint7 != null) {
                    str36 = constraint7.ownerName;
                } else {
                    str36 = null;
                }
                sb.append(str36);
                sb.append("\n");
            } else {
                sb.append("    # bottomToBottom: ");
                Constraint bottom2 = constraint.getBottom();
                if (bottom2 != null) {
                    str34 = bottom2.ownerName;
                } else {
                    str34 = null;
                }
                sb.append(str34);
                sb.append(" => bottomToBottom: ");
                if (constraint7 != null) {
                    str35 = constraint7.ownerName;
                } else {
                    str35 = null;
                }
                sb.append(str35);
                sb.append("\n");
            }
        } else if (constraint.bottomToTop != -1) {
            if (c19me.bottomToBottom != -1) {
                sb.append("    # bottomToTop: ");
                Constraint bottom3 = constraint.getBottom();
                if (bottom3 != null) {
                    str29 = bottom3.ownerName;
                } else {
                    str29 = null;
                }
                sb.append(str29);
                sb.append(" => bottomToBottom: ");
                if (constraint7 != null) {
                    str30 = constraint7.ownerName;
                } else {
                    str30 = null;
                }
                sb.append(str30);
                sb.append("\n");
            } else if (Intrinsics.LJFF(constraint.getBottom(), constraint7)) {
                sb.append("    # bottomToTop: ");
                if (constraint7 != null) {
                    str28 = constraint7.ownerName;
                } else {
                    str28 = null;
                }
                sb.append(str28);
                sb.append("\n");
            } else {
                sb.append("    # bottomToTop: ");
                Constraint bottom4 = constraint.getBottom();
                if (bottom4 != null) {
                    str26 = bottom4.ownerName;
                } else {
                    str26 = null;
                }
                sb.append(str26);
                sb.append(" => bottomToTop: ");
                if (constraint7 != null) {
                    str27 = constraint7.ownerName;
                } else {
                    str27 = null;
                }
                sb.append(str27);
                sb.append("\n");
            }
        }
        if (constraint.baselineToBaseline != -1) {
            if (Intrinsics.LJFF(constraint.getBaseline(), constraint8)) {
                sb.append("    # baselineToBaseline: ");
                if (constraint8 != null) {
                    str33 = constraint8.ownerName;
                } else {
                    str33 = null;
                }
                sb.append(str33);
                sb.append("\n");
            } else {
                sb.append("    # baselineToBaseline: ");
                Constraint baseline = constraint.getBaseline();
                if (baseline != null) {
                    str31 = baseline.ownerName;
                } else {
                    str31 = null;
                }
                sb.append(str31);
                sb.append(" => baselineToBaseline: ");
                if (constraint8 != null) {
                    str32 = constraint8.ownerName;
                } else {
                    str32 = null;
                }
                sb.append(str32);
                sb.append("\n");
            }
        }
        sb.append("----------------------------------------------");
        System.out.println(sb);
    }
}
