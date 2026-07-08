package com.ss.android.ugc.aweme.upvote.detail.input;

import X.C01GW;
import X.C089E;
import X.C0B0S;
import X.C0HU6;
import X.C0HV5;
import X.C0WZX;
import X.C1342130l1v;
import X.C1355330lND;
import X.C1356650lPL;
import X.C1358550lSP;
import X.C1359030lTB;
import X.C1402120mag;
import X.C1402210map;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1559260qg8;
import X.C19746312Np;
import X.C19746412Nq;
import X.C20612915lH;
import X.C20684815ws;
import X.C21647019ng;
import X.C2188811AlT;
import X.C2204961BRm;
import X.C339190DRl;
import X.C418440Gaw;
import X.C429430Gsf;
import X.C452501pT;
import X.C723590SZx;
import X.C724240Sb0;
import X.EnumC19746112Nn;
import X.InterfaceC1355370lNH;
import X.InterfaceC1356670lPN;
import X.InterfaceC20613315lL;
import Y.AAListenerS332S0100000_21;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.ss.android.ugc.aweme.comment.widgets.MentionSpan;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.upvote.detail.input.RepostMentionAssem;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AwS565S0100000_21;
import kotlin.jvm.internal.AwS591S0100000_12;
import ttpobfuscated.e3;

/* JADX INFO: loaded from: classes22.dex */
public final class RepostMentionAssem extends UIContentAssem implements IRepostMentionAbility {
    public FrameLayout LLIZLLLIL;
    public FrameLayout LLJ;
    public C1355330lND LLJI;
    public InterfaceC1356670lPN LLJIJIL;
    public boolean LLJILJIL;
    public int LLJILLL;
    public int LLJILJILJ = -1;
    public String LLJJ = "";
    public final C1559260qg8 LLJJI = new C1559260qg8(new C723590SZx(this, C1356650lPL.class, null), checkSupervisorPrepared());
    public final List<String> LLJJIII = new ArrayList();
    public final C01GW LLJJIJI = C452501pT.LIZIZ(new AwS565S0100000_21(this, 849));
    public final C01GW LLJJIJIIJIL = C452501pT.LIZIZ(new AwS565S0100000_21(this, 848));

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.upvote.detail.input.IRepostMentionAbility
    public final void En2() throws Throwable {
        C1355330lND c1355330lND = this.LLJI;
        if (c1355330lND == null || C20612915lH.LIZIZ.LJIIIIZZ().LJFF(new AwS591S0100000_12(this, 649))) {
            return;
        }
        int selectionStart = c1355330lND.getSelectionStart();
        if (selectionStart < 0) {
            selectionStart = 0;
        }
        Editable editableJ = C2204961BRm.J(c1355330lND, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP+4dZDa2XyTB6kx8g4Culcfls9+1w99l4fC3Gwm3zhiR1JwcxL/", null));
        if (editableJ != null) {
            editableJ.insert(selectionStart, e3.g);
        }
    }

    public final C1356650lPL Go() {
        return (C1356650lPL) this.LLJJI.getValue();
    }

    public final boolean Ho() {
        return ((Boolean) this.LLJJIJI.getValue()).booleanValue();
    }

    @Override // com.ss.android.ugc.aweme.upvote.detail.input.IRepostMentionAbility
    public final List<TextExtraStruct> Px() {
        C1355330lND c1355330lND = this.LLJI;
        if (c1355330lND != null) {
            return c1355330lND.getMentionExtraStructList();
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.upvote.detail.input.IRepostMentionAbility
    public final boolean S02() {
        InterfaceC1356670lPN interfaceC1356670lPN = this.LLJIJIL;
        return interfaceC1356670lPN != null && interfaceC1356670lPN.Be();
    }

    @Override // com.ss.android.ugc.aweme.upvote.detail.input.IRepostMentionAbility
    public final boolean d90() {
        InterfaceC1356670lPN interfaceC1356670lPN = this.LLJIJIL;
        if (interfaceC1356670lPN == null || !interfaceC1356670lPN.Be()) {
            return false;
        }
        Ym(true);
        return true;
    }

    public final int Jo() {
        return Go().LLIZ != 0 ? Go().LLIZ : Ho() ? R.id.tas : R.id.t_j;
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentSet() {
        super.onParentSet();
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            C1558520qew.LJII(C1558360qeg.LJFF(fragmentLJI, null), this, IRepostMentionAbility.class, null, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v1, types: [X.0lPJ] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void Lo(int i) {
        ObjectAnimator objectAnimator;
        int i2;
        int i3;
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        MentionSpan[] mentionSpan;
        InterfaceC1356670lPN interfaceC1356670lPN;
        ObjectAnimator objectAnimatorOfFloat = null;
        IRepostStickerAbility iRepostStickerAbility = (IRepostStickerAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), IRepostStickerAbility.class, null);
        if (iRepostStickerAbility != null) {
            iRepostStickerAbility.Om1();
        }
        if (this.LLJIJIL == null) {
            ?? r12 = new InterfaceC20613315lL() { // from class: X.0lPJ
                @Override // X.InterfaceC20613315lL
                public final void Af() {
                }

                @Override // X.InterfaceC20613315lL
                public final void LLJI() {
                }

                @Override // X.InterfaceC20613315lL
                public final void M8(String str, String str2, C316530Cax c316530Cax, String str3) {
                }

                @Override // X.InterfaceC20613315lL
                public final void Wj(String str, C316530Cax c316530Cax, String str2) {
                }

                @Override // X.InterfaceC20613315lL
                public final void g1(String str, boolean z) {
                }

                @Override // X.InterfaceC20613315lL
                public final String getCreationId() {
                    return null;
                }

                @Override // X.InterfaceC20613315lL
                public final int lk() {
                    return 0;
                }

                @Override // X.InterfaceC20613315lL
                public final void r6(int i4) {
                }

                @Override // X.InterfaceC20613315lL
                public final void ld(int i4) {
                    if (i4 != 0) {
                        this.LL.Ym(false);
                    }
                }

                @Override // X.InterfaceC20613315lL
                public final void qj(User user) {
                    Pair pair;
                    RepostMentionAssem repostMentionAssem = this.LL;
                    repostMentionAssem.LLJILJIL = true;
                    C1355330lND c1355330lND = repostMentionAssem.LLJI;
                    if (c1355330lND != null) {
                        String uid = user.getUid();
                        ArrayList<TextExtraStruct> mentionExtraStructList = c1355330lND.getMentionExtraStructList();
                        if (mentionExtraStructList != null && uid != null && uid.length() != 0) {
                            Iterator<TextExtraStruct> it2 = mentionExtraStructList.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    TextExtraStruct next = it2.next();
                                    if (TextUtils.equals(uid, next.getUserId())) {
                                        int end = next.getEnd();
                                        int i4 = end + 1;
                                        if (i4 <= C2204961BRm.I(c1355330lND, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP+4dZDa2XyTB6kx8g4Culcfls9+1w99l4fC1G0h3wVoUWc=", null)).length() && ' ' == C2204961BRm.I(c1355330lND, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP+4dZDa2XyTB6kx8g4Culcfls9+1w99l4fC1G0h3wVoUWc=", null)).charAt(end)) {
                                            end = i4;
                                        }
                                        C2204961BRm.I(c1355330lND, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP+4dZDa2XyTB6kx8g4Culcfls9+1w99l4fC1G0h3wVoUWc=", null)).delete(next.getStart(), end);
                                        pair = new Pair(Boolean.TRUE, Integer.valueOf(mentionExtraStructList.size() - 1));
                                    }
                                } else {
                                    pair = new Pair(Boolean.FALSE, 0);
                                    break;
                                }
                            }
                        } else {
                            pair = new Pair(Boolean.FALSE, 0);
                        }
                        if (((Boolean) pair.getFirst()).booleanValue()) {
                            InterfaceC1356670lPN interfaceC1356670lPN2 = this.LL.LLJIJIL;
                            if (interfaceC1356670lPN2 != null) {
                                String uid2 = user.getUid();
                                if (uid2 == null) {
                                    uid2 = "";
                                }
                                interfaceC1356670lPN2.Rd(uid2);
                            }
                            if (((Number) pair.getSecond()).intValue() == 0) {
                                this.LL.Ym(true);
                            }
                        }
                    }
                    this.LL.LLJILJIL = false;
                }

                /* JADX WARN: Removed duplicated region for block: B:58:0x0123  */
                @Override // X.InterfaceC20613315lL
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void Mi(com.ss.android.ugc.aweme.profile.model.User r20, boolean r21, java.lang.String r22, java.lang.String r23, int r24) throws java.lang.Throwable {
                    /*
                        Method dump skipped, instruction units count: 516
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C1356630lPJ.Mi(com.ss.android.ugc.aweme.profile.model.User, boolean, java.lang.String, java.lang.String, int):void");
                }
            };
            C20612915lH c20612915lH = C20612915lH.LIZIZ;
            String str = Go().LL;
            String str2 = "";
            if (str == null) {
                str = "";
            }
            int iJo = Jo();
            boolean zHo = Ho();
            String str3 = Go().LLIZLLLIL;
            if (str3 != null) {
                str2 = str3;
            }
            this.LLJIJIL = c20612915lH.LIZLLL(str, r12, this, iJo, zHo ? 1 : 0, str2);
            C1355330lND c1355330lND = this.LLJI;
            if (c1355330lND != null && (mentionSpan = c1355330lND.getMentionSpan()) != null && mentionSpan.length != 0) {
                C089E c089e = new C089E(mentionSpan);
                while (c089e.hasNext()) {
                    String strLIZJ = ((MentionSpan) c089e.next()).LIZJ();
                    if (strLIZJ != null && (interfaceC1356670lPN = this.LLJIJIL) != null) {
                        interfaceC1356670lPN.he(strLIZJ);
                    }
                }
            }
            InterfaceC1356670lPN interfaceC1356670lPN2 = this.LLJIJIL;
            if (interfaceC1356670lPN2 != null) {
                interfaceC1356670lPN2.Hi(8, true);
            }
            if (Ho()) {
                FrameLayout frameLayout = this.LLJ;
                if (frameLayout != null) {
                    layoutParams = frameLayout.getLayoutParams();
                } else {
                    layoutParams = null;
                }
                if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                    marginLayoutParams.bottomMargin = -((int) C339190DRl.LIZ(224));
                }
            }
        }
        this.LLJILJILJ = i;
        InterfaceC1356670lPN interfaceC1356670lPN3 = this.LLJIJIL;
        if (interfaceC1356670lPN3 != null && !interfaceC1356670lPN3.Be()) {
            C1358550lSP c1358550lSP = C1358550lSP.LIZ;
            String str4 = Go().LL;
            String str5 = Go().LLILLJJLI;
            String str6 = Go().LLILLL;
            Integer num = Go().LLILZ;
            c1358550lSP.getClass();
            C20684815ws.LJIJI("open_repost_mention_panel", new Pair(str4, "enter_from"), new Pair(str6, "author_id"), new Pair(str5, "group_id"), new Pair(num, "follow_status"));
            if (Ho()) {
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.LLJJIJIIJIL.getValue();
                if (marginLayoutParams2 != null) {
                    i3 = marginLayoutParams2.bottomMargin;
                } else {
                    i3 = -((int) C339190DRl.LIZ(224));
                }
                C21647019ng c21647019ng = new C21647019ng(LJJIJL().getContext(), new View(LJJIJL().getContext()), new C19746312Np(EnumC19746112Nn.SPRING, new C0HU6(new C1342130l1v(322.27f), new C1342130l1v(32.31f)), Collections.singletonList(new C19746412Nq("repost_mention_panel_show_anim", new C0HV5(i3, 0.0f)))), false);
                c21647019ng.LIZJ("repost_mention_panel_show_anim", new C1402210map(this, 2));
                InterfaceC1356670lPN interfaceC1356670lPN4 = this.LLJIJIL;
                if (interfaceC1356670lPN4 != null) {
                    interfaceC1356670lPN4.Hi(0, true);
                }
                c21647019ng.LJI(true);
                return;
            }
            FrameLayout frameLayout2 = this.LLJ;
            if (frameLayout2 != null) {
                ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(frameLayout2, "alpha", 0.0f, 1.0f);
                objectAnimatorOfFloat2.setDuration(200L);
                objectAnimatorOfFloat2.addListener(new AAListenerS332S0100000_21(this, 0));
                objectAnimator = objectAnimatorOfFloat2;
            } else {
                objectAnimator = null;
            }
            if (((Boolean) C0B0S.LIZ.getValue()).booleanValue()) {
                i2 = 92;
            } else {
                i2 = 40;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("horizontal mention appear, input-spacing=");
            sbLIZ.append(i2);
            sbLIZ.append("dp");
            C429430Gsf.LIZ("RepostMentionAssem", C2188811AlT.LIZIZ(sbLIZ));
            FrameLayout frameLayout3 = this.LLIZLLLIL;
            if (frameLayout3 != null) {
                objectAnimatorOfFloat = ObjectAnimator.ofFloat(frameLayout3, "translationY", 0.0f, C339190DRl.LIZ(-i2));
                objectAnimatorOfFloat.setDuration(200L);
            }
            Animator animator = objectAnimator;
            if (C1359030lTB.LIZIZ()) {
                if (objectAnimator == null) {
                    return;
                }
            } else {
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(objectAnimator, objectAnimatorOfFloat);
                animator = animatorSet;
            }
            animator.start();
        }
    }

    public final void Ym(boolean z) {
        boolean z2;
        ObjectAnimator objectAnimator;
        ObjectAnimator objectAnimatorOfFloat;
        int i;
        int i2;
        if (z) {
            this.LLJILJILJ = -1;
        }
        InterfaceC1356670lPN interfaceC1356670lPN = this.LLJIJIL;
        if (interfaceC1356670lPN != null && interfaceC1356670lPN.Be()) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            if (Ho()) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.LLJJIJIIJIL.getValue();
                if (marginLayoutParams != null) {
                    i2 = marginLayoutParams.bottomMargin;
                } else {
                    i2 = 0;
                }
                C21647019ng c21647019ng = new C21647019ng(LJJIJL().getContext(), new View(LJJIJL().getContext()), new C19746312Np(EnumC19746112Nn.SPRING, new C0HU6(new C1342130l1v(322.27f), new C1342130l1v(32.31f)), Collections.singletonList(new C19746412Nq("repost_mention_panel_show_anim", new C0HV5(i2, C418440Gaw.LIZIZ(-224))))), false);
                c21647019ng.LIZJ("repost_mention_panel_show_anim", new C1402210map(this, 3));
                c21647019ng.LJI(true);
            } else {
                FrameLayout frameLayout = this.LLJ;
                if (frameLayout != null) {
                    ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(frameLayout, "alpha", 1.0f, 0.0f);
                    objectAnimatorOfFloat2.setDuration(200L);
                    objectAnimatorOfFloat2.addListener(new AAListenerS332S0100000_21(this, 1));
                    objectAnimator = objectAnimatorOfFloat2;
                } else {
                    objectAnimator = null;
                }
                Animator animator = objectAnimator;
                if (C1359030lTB.LIZIZ()) {
                    if (objectAnimator != null) {
                    }
                } else {
                    FrameLayout frameLayout2 = this.LLIZLLLIL;
                    if (frameLayout2 != null) {
                        float[] fArr = new float[2];
                        if (((Boolean) C0B0S.LIZ.getValue()).booleanValue()) {
                            i = 92;
                        } else {
                            i = 40;
                        }
                        fArr[0] = C339190DRl.LIZ(-i);
                        fArr[1] = 0.0f;
                        objectAnimatorOfFloat = ObjectAnimator.ofFloat(frameLayout2, "translationY", fArr);
                        objectAnimatorOfFloat.setDuration(200L);
                    } else {
                        objectAnimatorOfFloat = null;
                    }
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.playTogether(objectAnimator, objectAnimatorOfFloat);
                    animator = animatorSet;
                }
                animator.start();
            }
        }
        IRepostStickerAbility iRepostStickerAbility = (IRepostStickerAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), IRepostStickerAbility.class, null);
        if (iRepostStickerAbility != null) {
            iRepostStickerAbility.r01();
        }
    }

    @Override // com.ss.android.ugc.aweme.upvote.detail.input.IRepostMentionAbility
    public final void dh(Editable editable) {
        if (editable != null) {
            this.LLJILJIL = true;
            C1355330lND c1355330lND = this.LLJI;
            if (c1355330lND != null) {
                c1355330lND.setText(editable);
            }
            C1355330lND c1355330lND2 = this.LLJI;
            if (c1355330lND2 != null) {
                c1355330lND2.setSelection(editable.length());
            }
            this.LLJILJIL = false;
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        super.onViewCreated(view);
        this.LLJI = (C1355330lND) view.findViewById(Go().LLILZLL);
        this.LLIZLLLIL = (FrameLayout) view.findViewById(R.id.tar);
        this.LLJ = (FrameLayout) view.findViewById(Jo());
        if (Ho()) {
            FrameLayout frameLayout = this.LLJ;
            ViewGroup.LayoutParams layoutParams = null;
            if (frameLayout != null) {
                layoutParams = frameLayout.getLayoutParams();
            }
            if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                marginLayoutParams.bottomMargin = -((int) C339190DRl.LIZ(224));
            }
        }
        C1355330lND c1355330lND = this.LLJI;
        if (c1355330lND != null) {
            c1355330lND.setMentionListener(new InterfaceC1355370lNH() { // from class: X.0lPK
                @Override // X.InterfaceC1355370lNH
                public final void LIZ(String str) {
                    ((ArrayList) this.LIZ.LLJJIII).add(str);
                }
            });
            c1355330lND.addTextChangedListener(new C1402120mag(this, 9));
        }
    }
}
