package com.ss.android.ugc.aweme.pcs.course.videopublishpage.ui;

import X.AbstractC738140SxQ;
import X.C013C;
import X.C0DL6;
import X.C0I7D;
import X.C0JHC;
import X.C0JHZ;
import X.C1220000hqw;
import X.C13LE;
import X.C1554960qZC;
import X.C1624306Xp;
import X.C1954807lC;
import X.C19719912Dl;
import X.C2217371BqR;
import X.C2217381BqS;
import X.C451610HnL;
import X.C452070Ho5;
import X.C489320JGw;
import X.C489400JHe;
import X.C723700Sa8;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736950SvV;
import X.C786410Ut5;
import X.EnumC489360JHa;
import X.InterfaceC1555100qZQ;
import Y.ACListenerS142S0100000_7;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.text.Editable;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.provider.impl.GScope;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.PcsCourseVideoModel;
import com.ss.android.ugc.aweme.creative.model.publish.PostPageModel;
import com.ss.android.ugc.aweme.pcs.course.videoeditpage.vm.PcsVideoEditVM;
import com.ss.android.ugc.aweme.pcs.course.videopublishpage.vm.PcsVideoPublishVM;
import com.ss.android.ugc.aweme.pcs.course.videopublishpage.vm.PcsVideoReEditVm;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS237S0000000_7;
import kotlin.jvm.internal.AwS22S0010000_7;
import kotlin.jvm.internal.AwS551S0100000_7;
import kotlin.jvm.internal.AwS58S1000000_7;
import kotlin.jvm.internal.AwS621S0100000_7;

/* JADX INFO: loaded from: classes8.dex */
public final class PcsCoursePublishContentAssem extends UISlotAssem {
    public ViewGroup LLJJI;
    public final C736950SvV LLJJIII;
    public final C736950SvV LLJJIJI;
    public final C736950SvV LLJJIJIIJIL;
    public C489400JHe LLJJIJIL;
    public C0JHC LLJJJ;
    public RemoteImageView LLJJJIL;
    public TuxTextView LLJJJJ;
    public C0I7D LLJJJJJIL;
    public C1624306Xp LLJJJJLIIL;
    public boolean LLJJL;

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.dhd;
    }

    public final C0JHC hp() {
        if (this.LLJJJ == null) {
            InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(GScope.LL, "source_default_key", C0JHC.class, null);
            this.LLJJJ = interfaceC1555100qZQLIZIZ != null ? (C0JHC) interfaceC1555100qZQLIZIZ.getSource() : null;
        }
        return this.LLJJJ;
    }

    public final PcsVideoReEditVm ip() {
        return (PcsVideoReEditVm) this.LLJJIJIIJIL.getValue();
    }

    public final PcsVideoEditVM kp() {
        return (PcsVideoEditVM) this.LLJJIII.getValue();
    }

    public final C489400JHe lp() {
        if (this.LLJJIJIL == null) {
            InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(GScope.LL, "source_default_key", C489400JHe.class, null);
            this.LLJJIJIL = interfaceC1555100qZQLIZIZ != null ? (C489400JHe) interfaceC1555100qZQLIZIZ.getSource() : null;
        }
        return this.LLJJIJIL;
    }

    public PcsCoursePublishContentAssem() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PcsVideoEditVM.class);
        AFwS237S0000000_7 aFwS237S0000000_7 = AFwS237S0000000_7.get$arr$(178);
        AwS551S0100000_7 awS551S0100000_7 = new AwS551S0100000_7((AbstractC738140SxQ) this, 409);
        C451610HnL c451610HnL = new C451610HnL(this, true, true);
        C723700Sa8 c723700Sa8 = new C723700Sa8(this);
        C452070Ho5 c452070Ho5 = new C452070Ho5();
        this.LLJJIII = new C736950SvV(c19719912DlLIZ, null, c452070Ho5, C724750Sbp.LJII(this), C1220000hqw.LIZ(this), aFwS237S0000000_7, awS551S0100000_7, c451610HnL, c723700Sa8);
        this.LLJJIJI = new C736950SvV(C13LE.LIZ(PcsVideoPublishVM.class), null, c452070Ho5, C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS237S0000000_7.get$arr$(179), new AwS551S0100000_7((AbstractC738140SxQ) this, 410), new C451610HnL(this, true, true), new C723700Sa8(this));
        this.LLJJIJIIJIL = new C736950SvV(C13LE.LIZ(PcsVideoReEditVm.class), null, c452070Ho5, C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS237S0000000_7.get$arr$(180), new AwS551S0100000_7((AbstractC738140SxQ) this, 411), new C451610HnL(this, true, true), new C723700Sa8(this));
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        C1624306Xp c1624306Xp = this.LLJJJJLIIL;
        if (c1624306Xp != null) {
            TuxIconView tuxIconView = c1624306Xp.LL;
            if (tuxIconView != null) {
                C786410Ut5.Fb(tuxIconView, 0.0f);
            }
            ObjectAnimator objectAnimator = c1624306Xp.LLILZ;
            if (objectAnimator != null) {
                objectAnimator.cancel();
            }
            c1624306Xp.LLILZ = null;
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        EnumC489360JHa enumC489360JHa;
        EnumC489360JHa enumC489360JHa2;
        super.onViewCreated(view);
        this.LLJJI = (ViewGroup) view.findViewById(R.id.y12);
        this.LLJJJIL = (RemoteImageView) view.findViewById(R.id.video_cover);
        this.LLJJJJ = (TuxTextView) view.findViewById(R.id.gpb);
        this.LLJJJJJIL = (C0I7D) view.findViewById(R.id.y1b);
        this.LLJJJJLIIL = (C1624306Xp) view.findViewById(R.id.sgv);
        TuxTextView tuxTextView = this.LLJJJJ;
        if (tuxTextView != null) {
            C786410Ut5.h9(tuxTextView, new ACListenerS142S0100000_7(this, 140));
        }
        final C0I7D c0i7d = this.LLJJJJJIL;
        if (c0i7d != null) {
            final C013C c013c = new C013C();
            c0i7d.addTextChangedListener(new C0DL6() { // from class: X.0JHg
                @Override // X.C0DL6, android.text.TextWatcher
                public final void afterTextChanged(Editable editable) {
                    EnumC489360JHa enumC489360JHa3;
                    EnumC489360JHa enumC489360JHa4;
                    VideoPublishEditModel videoPublishEditModelLIZ;
                    VideoPublishEditModel videoPublishEditModelLIZ2;
                    CreativeModel creativeModel;
                    PostPageModel postPageModel;
                    VideoPublishEditModel videoPublishEditModelLIZ3;
                    CreativeModel creativeModel2;
                    PcsCourseVideoModel pcsCourseVideoModel;
                    C489400JHe c489400JHeLp = this.LL.lp();
                    if (c489400JHeLp != null) {
                        enumC489360JHa3 = c489400JHeLp.LL;
                    } else {
                        enumC489360JHa3 = null;
                    }
                    if (enumC489360JHa3 == EnumC489360JHa.CHOOSE_FROM_ALBUM) {
                        AssemViewModel assemViewModel = (AssemViewModel) this.LL.LLJJIJI.getValue();
                        String string = editable.toString();
                        PublishModel publishModel = ((C0JHK) assemViewModel.getState()).LLILLJJLI;
                        if (publishModel != null && (videoPublishEditModelLIZ3 = C489560JHu.LIZ(publishModel)) != null && (creativeModel2 = videoPublishEditModelLIZ3.creativeModel) != null && (pcsCourseVideoModel = creativeModel2.pcsPaidVideoMediaModel) != null) {
                            pcsCourseVideoModel.videoTitle = string;
                        }
                        assemViewModel.setState(new AwS58S1000000_7(string, 8));
                        return;
                    }
                    C489400JHe c489400JHeLp2 = this.LL.lp();
                    if (c489400JHeLp2 != null) {
                        enumC489360JHa4 = c489400JHeLp2.LL;
                    } else {
                        enumC489360JHa4 = null;
                    }
                    if (enumC489360JHa4 != EnumC489360JHa.RE_EDIT_SCENE) {
                        return;
                    }
                    PcsVideoReEditVm pcsVideoReEditVmIp = this.LL.ip();
                    String string2 = editable.toString();
                    PublishModel publishModel2 = pcsVideoReEditVmIp.getState().LLILZIL;
                    if (publishModel2 != null && (videoPublishEditModelLIZ2 = C489560JHu.LIZ(publishModel2)) != null && (creativeModel = videoPublishEditModelLIZ2.creativeModel) != null && (postPageModel = creativeModel.postPageModel) != null) {
                        postPageModel.markupCaption = string2;
                    }
                    pcsVideoReEditVmIp.setState(new AwS58S1000000_7(string2, 9));
                    C1443310nf7 c1443310nf7 = C1443310nf7.LIZIZ;
                    PublishModel publishModel3 = this.LL.ip().getState().LLILZIL;
                    if (publishModel3 == null || (videoPublishEditModelLIZ = C489560JHu.LIZ(publishModel3)) == null) {
                        return;
                    }
                    C1443310nf7.LJIIJ(c1443310nf7, videoPublishEditModelLIZ, Boolean.TRUE, null, 4);
                    if (!c013c.element) {
                        return;
                    }
                    PcsVideoReEditVm pcsVideoReEditVmIp2 = this.LL.ip();
                    if (pcsVideoReEditVmIp2.getState().LLILZ) {
                        return;
                    }
                    pcsVideoReEditVmIp2.setState(new AwS22S0010000_7(3));
                }
            });
            final CharSequence hint = c0i7d.getHint();
            c0i7d.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: X.0JHf
                @Override // android.view.View.OnFocusChangeListener
                public final void onFocusChange(View view2, boolean z) throws Throwable {
                    EnumC489360JHa enumC489360JHa3;
                    InputMethodManager inputMethodManager;
                    c013c.element = z;
                    if (z) {
                        c0i7d.setHint("");
                        C489400JHe c489400JHeLp = this.lp();
                        if (c489400JHeLp != null) {
                            enumC489360JHa3 = c489400JHeLp.LL;
                        } else {
                            enumC489360JHa3 = null;
                        }
                        C489320JGw.LIZIZ(enumC489360JHa3, this.hp(), this.kp(), false, "title", null, 32);
                        Context context = c0i7d.getContext();
                        if (context != null && view2 != null) {
                            Object objH2 = C786410Ut5.H2(context, "input_method");
                            if ((objH2 instanceof InputMethodManager) && (inputMethodManager = (InputMethodManager) objH2) != null) {
                                inputMethodManager.showSoftInput(view2, 1);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    Editable editableLLLLJI = C2204961BRm.LLLLJI(c0i7d, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPqrcNHN0ye78R3qOURvevv8aVVjboogexbm8jKL2lEz9RoxCdP1RoZUaCbsmWrmO1q+dU0O3xHpTEwk", null));
                    if (editableLLLLJI != null && editableLLLLJI.length() != 0) {
                        return;
                    }
                    c0i7d.setHint(hint);
                }
            });
        }
        C489400JHe c489400JHeLp = lp();
        if (c489400JHeLp != null) {
            enumC489360JHa = c489400JHeLp.LL;
        } else {
            enumC489360JHa = null;
        }
        C489320JGw.LIZIZ(enumC489360JHa, hp(), kp(), true, null, ip(), 16);
        C489400JHe c489400JHeLp2 = lp();
        if (c489400JHeLp2 != null && (enumC489360JHa2 = c489400JHeLp2.LL) != null) {
            int i = C0JHZ.LIZ[enumC489360JHa2.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw new C1954807lC();
                    }
                    return;
                } else {
                    C736680Sv4.LJIIIIZZ(this, ip(), new C2217371BqR() { // from class: X.0JHq
                        @Override // X.C2217371BqR, X.AbstractC2217331BqN, X.InterfaceC2217241BqE
                        public final Object get(Object obj) {
                            return ((C0JHL) obj).LLILZIL;
                        }

                        @Override // X.C2217371BqR, X.AbstractC2217331BqN
                        public final void set(Object obj, Object obj2) {
                            ((C0JHL) obj).LLILZIL = (PublishModel) obj2;
                        }
                    }, null, new AwS621S0100000_7(this, 108), 6);
                    C736680Sv4.LJIIIIZZ(this, ip(), new C2217381BqS() { // from class: X.0JHl
                        @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                        public final Object get(Object obj) {
                            return ((C0JHL) obj).LLILLL;
                        }
                    }, null, new AwS621S0100000_7(this, 109), 6);
                    return;
                }
            }
            C736680Sv4.LJIIIIZZ(this, kp(), new C2217381BqS() { // from class: X.0JHo
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C489550JHt) obj).LLILLJJLI;
                }
            }, null, new AwS621S0100000_7(this, 107), 6);
            C736680Sv4.LJIIIIZZ(this, kp(), new C2217381BqS() { // from class: X.0JHp
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C489550JHt) obj).LLILZIL;
                }
            }, null, new AwS621S0100000_7(this, 35), 6);
        }
    }
}
