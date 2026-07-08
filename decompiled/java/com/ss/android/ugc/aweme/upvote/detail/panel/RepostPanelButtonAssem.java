package com.ss.android.ugc.aweme.upvote.detail.panel;

import X.C019F;
import X.C09R3;
import X.C1358380lS8;
import X.C1358510lSL;
import X.C1358550lSP;
import X.C1358760lSk;
import X.C1359110lTJ;
import X.C1359350lTh;
import X.C1359850lUV;
import X.C13LE;
import X.C1558520qew;
import X.C1559260qg8;
import X.C1637806bA;
import X.C1637906bB;
import X.C197039127h;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C298430Bmr;
import X.C339190DRl;
import X.C723580SZw;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.InterfaceC2217461Bqa;
import Y.AAListenerS332S0100000_21;
import Y.AAListenerS91S0101000_21;
import Y.ACListenerS155S0100000_21;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.upvote.detail.input.RepostInputFragment;
import com.ss.android.ugc.aweme.upvote.detail.replypanel.vm.RepostInteractListViewModel;
import com.zhiliaoapp.musically.R;
import defpackage.IButtonEntranceView;
import kotlin.jvm.internal.AFwS259S0000000_21;
import kotlin.jvm.internal.AwS565S0100000_21;
import kotlin.jvm.internal.AwS635S0100000_21;

/* JADX INFO: loaded from: classes22.dex */
public final class RepostPanelButtonAssem extends UIContentAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILLL;
    public final C1559260qg8 LLIZLLLIL = new C1559260qg8(new C723580SZw(this, C1359850lUV.class, null), checkSupervisorPrepared());
    public final AssemVMLazy LLJ;
    public final AssemVMLazy LLJI;
    public C197039127h LLJIJIL;
    public View LLJILJIL;
    public int LLJILJILJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(RepostPanelButtonAssem.class, "panelVm", "getPanelVm()Lcom/ss/android/ugc/aweme/upvote/detail/panel/RepostPanelViewModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(RepostPanelButtonAssem.class, "interactVM", "getInteractVM()Lcom/ss/android/ugc/aweme/upvote/detail/replypanel/vm/RepostInteractListViewModel;", 0);
        c09r3.getClass();
        LLJILLL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    public RepostPanelButtonAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(RepostPanelViewModel.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLJ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, c1637906bB, new AwS565S0100000_21(c19719912DlLIZ, 882), AFwS259S0000000_21.get$arr$(234), null, true);
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(RepostInteractListViewModel.class);
        this.LLJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c019f, c1637906bB, new AwS565S0100000_21(c19719912DlLIZ2, 883), AFwS259S0000000_21.get$arr$(235), null, true);
    }

    public final RepostInteractListViewModel Ho() {
        AssemVMLazy assemVMLazy = this.LLJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILLL;
        return (RepostInteractListViewModel) assemVMLazy.getValue();
    }

    public final void Go(int i) {
        String string;
        String string2;
        int i2;
        if (i != 1) {
            if (i == 2) {
                View view = this.LLJILJIL;
                if (view != null) {
                    C786410Ut5.LJLLLLLL(0, view);
                }
                C197039127h c197039127h = this.LLJIJIL;
                if (c197039127h != null) {
                    Context context = getContext();
                    if (context != null) {
                        if (C298430Bmr.LIZ()) {
                            i2 = 2131824963;
                        } else {
                            i2 = 2131850100;
                        }
                        string2 = context.getString(i2);
                    } else {
                        string2 = null;
                    }
                    c197039127h.setText(string2);
                }
                C197039127h c197039127h2 = this.LLJIJIL;
                if (c197039127h2 != null) {
                    c197039127h2.setTextColorRes(R.attr.a1h);
                }
                C197039127h c197039127h3 = this.LLJIJIL;
                if (c197039127h3 != null) {
                    c197039127h3.setButtonVariant(1);
                }
                C197039127h c197039127h4 = this.LLJIJIL;
                if (c197039127h4 != null) {
                    c197039127h4.setButtonStartIcon(Integer.valueOf(R.raw.icon_pen_fill));
                }
                C197039127h c197039127h5 = this.LLJIJIL;
                if (c197039127h5 != null) {
                    C786410Ut5.U8(c197039127h5, new ACListenerS155S0100000_21(this, 96));
                }
                C197039127h c197039127h6 = this.LLJIJIL;
                if (c197039127h6 != null) {
                    c197039127h6.setOnTouchListener(new View.OnTouchListener() { // from class: X.0lUO
                        @Override // android.view.View.OnTouchListener
                        public final boolean onTouch(View view2, MotionEvent motionEvent) {
                            if (motionEvent.getActionMasked() == 0) {
                                String str = RepostInputFragment._pnsPageId;
                                Context context2 = view2.getContext();
                                if (C1358180lRo.LIZ() && context2 != null) {
                                    C21146717pB.LIZJ(context2, R.layout.i6j);
                                    return false;
                                }
                                return false;
                            }
                            return false;
                        }
                    });
                }
                IButtonEntranceView iButtonEntranceView = (IButtonEntranceView) C1558520qew.LIZ(C1558520qew.LJIIL(this), IButtonEntranceView.class, null);
                if (iButtonEntranceView != null) {
                    iButtonEntranceView.br2(true);
                    return;
                }
                return;
            }
            return;
        }
        View view2 = this.LLJILJIL;
        if (view2 != null) {
            C786410Ut5.LJLLLLLL(0, view2);
        }
        C197039127h c197039127h7 = this.LLJIJIL;
        if (c197039127h7 != null) {
            Context context2 = getContext();
            if (context2 != null) {
                string = context2.getString(2131846358);
            } else {
                string = null;
            }
            c197039127h7.setText(string);
        }
        C197039127h c197039127h8 = this.LLJIJIL;
        if (c197039127h8 != null) {
            c197039127h8.setTextColorRes(R.attr.a0p);
        }
        C197039127h c197039127h9 = this.LLJIJIL;
        if (c197039127h9 != null) {
            c197039127h9.setButtonVariant(0);
        }
        C197039127h c197039127h10 = this.LLJIJIL;
        if (c197039127h10 != null) {
            c197039127h10.setButtonStartIcon(Integer.valueOf(R.raw.icon_repost_fill));
        }
        C197039127h c197039127h11 = this.LLJIJIL;
        if (c197039127h11 != null) {
            C786410Ut5.U8(c197039127h11, new ACListenerS155S0100000_21(this, 95));
        }
        C197039127h c197039127h12 = this.LLJIJIL;
        if (c197039127h12 != null) {
            c197039127h12.setOnTouchListener(null);
        }
        IButtonEntranceView iButtonEntranceView2 = (IButtonEntranceView) C1558520qew.LIZ(C1558520qew.LJIIL(this), IButtonEntranceView.class, null);
        if (iButtonEntranceView2 == null) {
            return;
        }
        iButtonEntranceView2.br2(true);
    }

    public final void Jo(C1358760lSk c1358760lSk) {
        String str;
        int i = c1358760lSk.LIZ;
        if (this.LLJILJILJ == i) {
            return;
        }
        if (i != 0) {
            if (c1358760lSk.LIZIZ) {
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.LLJILJIL, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f);
                objectAnimatorOfFloat.setDuration(150L);
                objectAnimatorOfFloat.setStartDelay(250L);
                objectAnimatorOfFloat.addListener(new AAListenerS91S0101000_21(this, i, 2));
                objectAnimatorOfFloat.addListener(new AAListenerS332S0100000_21(this, 27));
                objectAnimatorOfFloat.addListener(new AAListenerS332S0100000_21(this, 28));
                C786410Ut5.Pd(objectAnimatorOfFloat);
            } else {
                Go(i);
                View view = this.LLJILJIL;
                if (view != null) {
                    C339190DRl.LIZLLL(view);
                }
                View view2 = this.LLJILJIL;
                if (view2 != null) {
                    C786410Ut5.T4(view2, 1.0f);
                }
            }
            String str2 = null;
            if (i != 1) {
                if (i == 2) {
                    C1358550lSP c1358550lSP = C1358550lSP.LIZ;
                    VideoItemParams videoItemParams = Ho().LLILLJJLI;
                    if (videoItemParams != null) {
                        str2 = videoItemParams.mEventType;
                    }
                    C1358550lSP.LJIJJLI(c1358550lSP, str2, "recommend_panel", Ho().LL, "show", "list", 0, null, null, null, null, 992);
                }
            } else {
                C1359350lTh c1359350lTh = C1359350lTh.LIZ;
                VideoItemParams videoItemParams2 = Ho().LLILLJJLI;
                if (videoItemParams2 != null) {
                    str = videoItemParams2.mEventType;
                } else {
                    str = null;
                }
                Aweme aweme = Ho().LL;
                C1359850lUV c1359850lUV = (C1359850lUV) this.LLIZLLLIL.getValue();
                if (c1359850lUV != null) {
                    str2 = c1359850lUV.LLILLJJLI;
                }
                C1359350lTh.LIZIZ(c1359350lTh, str, "click_recommend_avatar", aweme, "recommend_panel", null, false, 0.0d, "list", "recommend_panel", str2, null, null, 3184);
            }
        } else {
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.LLJILJIL, (Property<View, Float>) View.ALPHA, 1.0f, 0.0f);
            objectAnimatorOfFloat2.setDuration(150L);
            objectAnimatorOfFloat2.addListener(new AAListenerS332S0100000_21(this, 25));
            objectAnimatorOfFloat2.addListener(new AAListenerS332S0100000_21(this, 26));
            C786410Ut5.Pd(objectAnimatorOfFloat2);
        }
        this.LLJILJILJ = i;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        String aid;
        super.onViewCreated(view);
        this.LLJILJIL = view.findViewById(R.id.i3u);
        this.LLJIJIL = (C197039127h) view.findViewById(R.id.cwf);
        if (C1359110lTJ.LIZ()) {
            Aweme aweme = Ho().LL;
            if (aweme != null && (aid = aweme.getAid()) != null) {
                C1358380lS8.LIZ.getClass();
                C1358510lSL c1358510lSLLJ = C1358380lS8.LJ(aid);
                if (c1358510lSLLJ == null) {
                    Jo(new C1358760lSk(0, false));
                } else {
                    Ho().BQ2(c1358510lSLLJ);
                }
            }
            C736680Sv4.LJIIIIZZ(this, Ho(), new C2217381BqS() { // from class: X.0lUY
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C1358490lSJ) obj).LLILLL;
                }
            }, null, new AwS635S0100000_21(this, 92), 6);
            return;
        }
        AssemVMLazy assemVMLazy = this.LLJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILLL;
        C736680Sv4.LJIIIIZZ(this, assemVMLazy.getValue(), new C2217381BqS() { // from class: X.0lUZ
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1358750lSj) obj).LLILZIL;
            }
        }, null, new AwS635S0100000_21(this, 93), 6);
    }
}
