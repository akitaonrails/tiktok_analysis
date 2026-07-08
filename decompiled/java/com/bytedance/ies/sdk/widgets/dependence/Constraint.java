package com.bytedance.ies.sdk.widgets.dependence;

import X.C08FF;
import X.C2188811AlT;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import ttpobfuscated.e3;

/* JADX INFO: loaded from: classes18.dex */
public class Constraint {
    public static final Constraint PARENT_CONSTRAINT = new Constraint(0, "parent");
    public int baselineToBaseline;
    public int bottomToBottom;
    public int bottomToTop;
    public int endToEnd;
    public int endToStart;
    public int leftToLeft;
    public int leftToRight;
    public Constraint mBaseline;
    public Constraint mBottom;
    public Constraint mEnd;
    public HashSet<Constraint> mHorizontalDependents;
    public Constraint mLeft;
    public boolean mResolved;
    public Constraint mRight;
    public Constraint mStart;
    public Constraint mTop;
    public final Type mType;
    public HashSet<Constraint> mVerticalDependents;
    public final int ownerId;
    public String ownerName;
    public int rightToLeft;
    public int rightToRight;
    public int startToEnd;
    public int startToStart;
    public int topToBottom;
    public int topToTop;

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.ownerId), this.mType);
    }

    public boolean isBarrier() {
        return false;
    }

    public boolean isGuideline() {
        return false;
    }

    public boolean isPlaceHolder() {
        return false;
    }

    public void displayReadableConstraint() {
        System.out.println("----------------------------------------------");
        PrintStream printStream = System.out;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("-- show constraint for ");
        sbLIZ.append(this.ownerName);
        printStream.println(C2188811AlT.LIZIZ(sbLIZ));
        System.out.println("----------------------------------------------");
        StringBuilder sb = new StringBuilder();
        if (this.mLeft != null) {
            sb.append("  #  left = ");
            sb.append(this.mLeft.ownerName);
            sb.append(e3.h);
            sb.append(this.mLeft.ownerId);
            sb.append(")\n");
        }
        if (this.mRight != null) {
            sb.append("  #  right = ");
            sb.append(this.mRight.ownerName);
            sb.append(e3.h);
            sb.append(this.mRight.ownerId);
            sb.append(")\n");
        }
        if (this.mStart != null) {
            sb.append("  #  start = ");
            sb.append(this.mStart.ownerName);
            sb.append(e3.h);
            sb.append(this.mStart.ownerId);
            sb.append(")\n");
        }
        if (this.mEnd != null) {
            sb.append("  #  end = ");
            sb.append(this.mEnd.ownerName);
            sb.append(e3.h);
            sb.append(this.mEnd.ownerId);
            sb.append(")\n");
        }
        if (this.mTop != null) {
            sb.append("  #  top = ");
            sb.append(this.mTop.ownerName);
            sb.append(e3.h);
            sb.append(this.mTop.ownerId);
            sb.append(")\n");
        }
        if (this.mBottom != null) {
            sb.append("  #  bottom = ");
            sb.append(this.mBottom.ownerName);
            sb.append(e3.h);
            sb.append(this.mBottom.ownerId);
            sb.append(")\n");
        }
        if (this.mBaseline != null) {
            sb.append("  #  top = ");
            sb.append(this.mBaseline.ownerName);
            sb.append(e3.h);
            sb.append(this.mBaseline.ownerId);
            sb.append(")\n");
        }
        if (hasHorizontalDependents()) {
            sb.append("  #  Horizontal Dependents: [");
            Iterator<Constraint> it2 = this.mHorizontalDependents.iterator();
            sb.append(it2.next().ownerName);
            while (it2.hasNext()) {
                sb.append(", ");
                sb.append(it2.next().ownerName);
            }
            sb.append("]\n");
        }
        if (hasVerticalDependents()) {
            sb.append("  #  Vertical Dependents: [");
            Iterator<Constraint> it3 = this.mVerticalDependents.iterator();
            sb.append(it3.next().ownerName);
            while (it3.hasNext()) {
                sb.append(", ");
                sb.append(it3.next().ownerName);
            }
            sb.append("]\n");
        }
        System.out.println(sb);
    }

    public boolean hasHorizontalDependents() {
        HashSet<Constraint> hashSet = this.mHorizontalDependents;
        return hashSet != null && hashSet.size() > 0;
    }

    public boolean hasVerticalDependents() {
        HashSet<Constraint> hashSet = this.mVerticalDependents;
        return hashSet != null && hashSet.size() > 0;
    }

    public boolean isParent() {
        return equals(PARENT_CONSTRAINT);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Constraint{");
        sbLIZ.append(this.mType);
        sbLIZ.append("#");
        sbLIZ.append(this.ownerName);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public Constraint getBaseline() {
        return this.mBaseline;
    }

    public Constraint getBottom() {
        return this.mBottom;
    }

    public Constraint getEnd() {
        return this.mEnd;
    }

    public Set<Constraint> getHorizontalDependents() {
        return this.mHorizontalDependents;
    }

    public Constraint getLeft() {
        return this.mLeft;
    }

    public String getOwnerName() {
        return this.ownerName;
    }

    public Constraint getRight() {
        return this.mRight;
    }

    public Constraint getStart() {
        return this.mStart;
    }

    public Constraint getTop() {
        return this.mTop;
    }

    public Set<Constraint> getVerticalDependents() {
        return this.mVerticalDependents;
    }

    public boolean isResolved() {
        return this.mResolved;
    }

    public enum Type {
        SCENE,
        DEFAULT;

        public static Type valueOf(String str) {
            return (Type) C08FF.LIZ(Type.class, str);
        }
    }

    public Constraint(int i) {
        this(i, "", Type.DEFAULT);
    }

    private void addHorizontalDependent(Constraint constraint) {
        if (this.mHorizontalDependents == null) {
            this.mHorizontalDependents = new HashSet<>();
        }
        this.mHorizontalDependents.add(constraint);
    }

    private void addVerticalDependent(Constraint constraint) {
        if (this.mVerticalDependents == null) {
            this.mVerticalDependents = new HashSet<>();
        }
        this.mVerticalDependents.add(constraint);
    }

    public void copyDependents(Constraint constraint) {
        if (constraint == null) {
            return;
        }
        if (constraint.hasVerticalDependents()) {
            this.mHorizontalDependents.addAll(constraint.mHorizontalDependents);
        }
        if (constraint.hasVerticalDependents()) {
            this.mVerticalDependents.addAll(constraint.mVerticalDependents);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Constraint constraint = (Constraint) obj;
        if (this.ownerId == constraint.ownerId && this.mType == constraint.mType) {
            return true;
        }
        return false;
    }

    public void resolve(ConstraintSolver constraintSolver) {
        ArrayList<Constraint> arrayList = new ArrayList();
        resolveHorizontal(constraintSolver, arrayList);
        resolveVertical(constraintSolver, arrayList);
        this.mResolved = true;
        for (Constraint constraint : arrayList) {
            if (!constraint.isParent() && !constraint.isResolved()) {
                constraint.resolve(constraintSolver);
            }
        }
    }

    public Constraint(int i, String str) {
        this(i, str, Type.DEFAULT);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001d  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void resolveHorizontal(com.bytedance.ies.sdk.widgets.dependence.ConstraintSolver r3, java.util.List<com.bytedance.ies.sdk.widgets.dependence.Constraint> r4) {
        /*
            r2 = this;
            int r0 = r2.leftToLeft
            r1 = -1
            if (r0 == r1) goto L65
            com.bytedance.ies.sdk.widgets.dependence.Constraint r0 = r3.getOrCreate(r0)
        L9:
            if (r0 == 0) goto L13
            r0.addHorizontalDependent(r2)
            r4.add(r0)
            r2.mLeft = r0
        L13:
            int r0 = r2.rightToLeft
            if (r0 == r1) goto L5c
            com.bytedance.ies.sdk.widgets.dependence.Constraint r0 = r3.getOrCreate(r0)
        L1b:
            if (r0 == 0) goto L25
            r0.addHorizontalDependent(r2)
            r4.add(r0)
            r2.mRight = r0
        L25:
            int r0 = r2.startToStart
            if (r0 == r1) goto L53
            com.bytedance.ies.sdk.widgets.dependence.Constraint r0 = r3.getOrCreate(r0)
        L2d:
            if (r0 == 0) goto L37
            r0.addHorizontalDependent(r2)
            r4.add(r0)
            r2.mStart = r0
        L37:
            int r0 = r2.endToStart
            if (r0 == r1) goto L4a
            com.bytedance.ies.sdk.widgets.dependence.Constraint r0 = r3.getOrCreate(r0)
        L3f:
            if (r0 == 0) goto L49
            r0.addHorizontalDependent(r2)
            r4.add(r0)
            r2.mEnd = r0
        L49:
            return
        L4a:
            int r0 = r2.endToEnd
            if (r0 == r1) goto L49
            com.bytedance.ies.sdk.widgets.dependence.Constraint r0 = r3.getOrCreate(r0)
            goto L3f
        L53:
            int r0 = r2.startToEnd
            if (r0 == r1) goto L37
            com.bytedance.ies.sdk.widgets.dependence.Constraint r0 = r3.getOrCreate(r0)
            goto L2d
        L5c:
            int r0 = r2.rightToRight
            if (r0 == r1) goto L25
            com.bytedance.ies.sdk.widgets.dependence.Constraint r0 = r3.getOrCreate(r0)
            goto L1b
        L65:
            int r0 = r2.leftToRight
            if (r0 == r1) goto L13
            com.bytedance.ies.sdk.widgets.dependence.Constraint r0 = r3.getOrCreate(r0)
            goto L9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.sdk.widgets.dependence.Constraint.resolveHorizontal(com.bytedance.ies.sdk.widgets.dependence.ConstraintSolver, java.util.List):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001d  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void resolveVertical(com.bytedance.ies.sdk.widgets.dependence.ConstraintSolver r3, java.util.List<com.bytedance.ies.sdk.widgets.dependence.Constraint> r4) {
        /*
            r2 = this;
            int r0 = r2.topToTop
            r1 = -1
            if (r0 == r1) goto L41
            com.bytedance.ies.sdk.widgets.dependence.Constraint r0 = r3.getOrCreate(r0)
        L9:
            if (r0 == 0) goto L13
            r0.addVerticalDependent(r2)
            r4.add(r0)
            r2.mTop = r0
        L13:
            int r0 = r2.bottomToTop
            if (r0 == r1) goto L38
            com.bytedance.ies.sdk.widgets.dependence.Constraint r0 = r3.getOrCreate(r0)
        L1b:
            if (r0 == 0) goto L25
            r0.addVerticalDependent(r2)
            r4.add(r0)
            r2.mBottom = r0
        L25:
            int r0 = r2.baselineToBaseline
            if (r0 == r1) goto L37
            com.bytedance.ies.sdk.widgets.dependence.Constraint r0 = r3.getOrCreate(r0)
            if (r0 == 0) goto L37
            r0.addVerticalDependent(r2)
            r4.add(r0)
            r2.mBaseline = r0
        L37:
            return
        L38:
            int r0 = r2.bottomToBottom
            if (r0 == r1) goto L25
            com.bytedance.ies.sdk.widgets.dependence.Constraint r0 = r3.getOrCreate(r0)
            goto L1b
        L41:
            int r0 = r2.topToBottom
            if (r0 == r1) goto L13
            com.bytedance.ies.sdk.widgets.dependence.Constraint r0 = r3.getOrCreate(r0)
            goto L9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.sdk.widgets.dependence.Constraint.resolveVertical(com.bytedance.ies.sdk.widgets.dependence.ConstraintSolver, java.util.List):void");
    }

    public Constraint(int i, String str, Type type) {
        this.leftToLeft = -1;
        this.leftToRight = -1;
        this.rightToLeft = -1;
        this.rightToRight = -1;
        this.topToTop = -1;
        this.topToBottom = -1;
        this.bottomToTop = -1;
        this.bottomToBottom = -1;
        this.baselineToBaseline = -1;
        this.startToEnd = -1;
        this.startToStart = -1;
        this.endToStart = -1;
        this.endToEnd = -1;
        this.ownerId = i;
        this.ownerName = str;
        this.mType = type;
    }
}
