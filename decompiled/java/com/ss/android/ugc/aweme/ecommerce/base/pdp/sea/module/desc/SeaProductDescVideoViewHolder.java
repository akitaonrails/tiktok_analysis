package com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.module.desc;

import X.C01GW;
import X.C03DZ;
import X.C0H9I;
import X.C0J0T;
import X.C0JSE;
import X.C10515049h;
import X.C1054104Ah;
import X.C1326790kdB;
import X.C1331670kl3;
import X.C13LE;
import X.C1406540mho;
import X.C1508360pM2;
import X.C1743750vTh;
import X.C1748720vbi;
import X.C1750080vdu;
import X.C1750120vdy;
import X.C1752010vh1;
import X.C1752030vh3;
import X.C1752370vhb;
import X.C1755600vmo;
import X.C1775630wJ7;
import X.C19719912Dl;
import X.C19EG;
import X.C19GS;
import X.C2217381BqS;
import X.C418440Gaw;
import X.C426750GoL;
import X.C438710HIf;
import X.C452501pT;
import X.C786410Ut5;
import X.C814420VxA;
import X.C948503nH;
import X.C958103op;
import X.EnumC1308950kAP;
import X.EnumC1486810onH;
import X.InterfaceC1508310pLx;
import X.InterfaceC1748810vbr;
import X.InterfaceC1752380vhc;
import Y.ARunnableS92S0200000_23;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.widget.RadiusLayout;
import com.ss.android.ugc.aweme.base.ImageUrlModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsBrickFullSpanVH;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.player.ISeaPdpMediaControlService;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.ui.SeaPdpActivity;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.SeaPdpMainState;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.SeaPdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS215S0000000_26;
import kotlin.jvm.internal.AFwS268S0000000_26;
import kotlin.jvm.internal.AwS140S1100000_26;
import kotlin.jvm.internal.AwS270S0300000_26;
import kotlin.jvm.internal.AwS570S0100000_26;
import kotlin.jvm.internal.AwS602S0100000_23;
import kotlin.jvm.internal.AwS605S0100000_26;
import wh6.AbS705S0100000_26;

/* JADX INFO: loaded from: classes27.dex */
public final class SeaProductDescVideoViewHolder extends AbsBrickFullSpanVH<C1406540mho> implements InterfaceC1508310pLx {
    public final Fragment LLJJIJIL;
    public final Function1<Integer, Object> LLJJJ;
    public final C01GW LLJJJIL;
    public final C1508360pM2 LLJJJJ;
    public final C01GW LLJJJJJIL;
    public Aweme LLJJJJLIIL;
    public final C1752370vhb LLJJL;
    public boolean LLJJLIIIJLLLLLLLZ;
    public final SeaProductDescVideoViewHolder$observer$1 LLJL;
    public final C1752010vh1 LLJLIL;

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsBrickFullSpanVH, com.ss.android.ugc.aweme.ecommerce.base.pdp.basicui.listitem.common.AbsFullSpanVH, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // X.InterfaceC1508310pLx
    public final boolean LLLLZLLIL() {
        return this.LLJJJJ.isMute();
    }

    public final ISeaPdpMediaControlService d6() {
        return (ISeaPdpMediaControlService) this.LLJJJIL.getValue();
    }

    public final SeaPdpViewModel e6() {
        return (SeaPdpViewModel) this.LLJJJJJIL.getValue();
    }

    @Override // com.bytedance.jedi.ext.adapter.JediViewHolder, X.C11EV
    public final void I5() {
        super.I5();
        e6().LR2().LIZ(getAbsoluteAdapterPosition(), this.LLJJJ, e6().LLLLZLL, e6().RR2(e6().Tg2()));
    }

    @Override // com.bytedance.jedi.ext.adapter.JediViewHolder, X.C11EV
    public final void P5() {
        super.P5();
        e6().LR2().LIZIZ(getAbsoluteAdapterPosition());
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.basicui.listitem.common.AbsFullSpanVH, com.bytedance.jedi.ext.adapter.JediViewHolder
    public final void onCreate() {
        super.onCreate();
        C786410Ut5.I7(new AbS705S0100000_26(this, 2, 42), this.itemView.findViewById(R.id.qmi));
        C1752370vhb c1752370vhb = this.LLJJL;
        if (c1752370vhb != null) {
            c1752370vhb.setCallback(new InterfaceC1752380vhc() { // from class: X.0pMx
                @Override // X.InterfaceC1752380vhc
                public final void LJJIJIIJIL() {
                    ISeaPdpMediaControlService iSeaPdpMediaControlServiceD6 = this.LIZ.d6();
                    if (iSeaPdpMediaControlServiceD6 != null) {
                        iSeaPdpMediaControlServiceD6.MC2(this.LIZ, false, EnumC1308950kAP.ACTIVE);
                    }
                }

                @Override // X.InterfaceC1752380vhc
                public final void LJJJJJL() {
                    ISeaPdpMediaControlService iSeaPdpMediaControlServiceD6 = this.LIZ.d6();
                    if (iSeaPdpMediaControlServiceD6 != null) {
                        iSeaPdpMediaControlServiceD6.MC2(this.LIZ, true, null);
                    }
                }

                @Override // X.InterfaceC1752380vhc
                public final void LLIIII() {
                    ISeaPdpMediaControlService iSeaPdpMediaControlServiceD6;
                    if (C1507750pL3.LIZ != EnumC1508940pMy.PLAYER_PAUSE || (iSeaPdpMediaControlServiceD6 = this.LIZ.d6()) == null) {
                        return;
                    }
                    iSeaPdpMediaControlServiceD6.MC2(this.LIZ, false, EnumC1308950kAP.ACTIVE);
                }
            });
        }
        this.LLJJJJ.LJIJ = e6();
        e6().hR2(new C2217381BqS() { // from class: X.0vh7
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((SeaPdpMainState) obj).getScrollOffset());
            }
        }, new AwS602S0100000_23(this, 28));
        this.LLJJIJIL.getLifecycle().addObserver(this.LLJL);
    }

    @Override // com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder
    public final void onDestroy() {
        C1743750vTh.LIZ(this);
        this.LLJJIJIL.getLifecycle().removeObserver(this.LLJL);
    }

    public final boolean f6(View view) {
        Rect rect = new Rect();
        view.getLocalVisibleRect(rect);
        int iWidth = (rect.bottom - rect.top) * (rect.right - rect.left);
        Rect rectLIZ = C0J0T.LIZ(view);
        if (rectLIZ.top + (rectLIZ.height() / 2.0f) < C958103op.LIZJ() / 2.0f) {
            iWidth -= rectLIZ.width() * C0H9I.LIZ(44.0d);
        }
        if (iWidth < (view.getMeasuredHeight() * view.getMeasuredWidth()) / 2) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsBrickFullSpanVH, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    /* JADX INFO: renamed from: h6, reason: merged with bridge method [inline-methods] */
    public final void rr(C1406540mho c1406540mho) {
        Video video;
        DialogFragment dialogFragment;
        Window window;
        ViewGroup viewGroup;
        RadiusLayout radiusLayout;
        super.rr(c1406540mho);
        e6().LR2().LIZLLL(getAbsoluteAdapterPosition());
        this.LLJJJJLIIL = c1406540mho.LL.LIZ();
        C1750080vdu c1750080vdu = new C1750080vdu();
        View view = this.itemView;
        if ((view instanceof RadiusLayout) && (radiusLayout = (RadiusLayout) view) != null) {
            radiusLayout.setRadius(C418440Gaw.LIZIZ(10));
        }
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
        C426750GoL.LJIIIZ(this.itemView, Integer.valueOf(iLIZIZ), null, Integer.valueOf(iLIZIZ), Integer.valueOf(iLIZIZ), false, 18);
        Aweme aweme = this.LLJJJJLIIL;
        if (aweme != null && (video = aweme.getVideo()) != null) {
            C1508360pM2 c1508360pM2 = this.LLJJJJ;
            int iLIZIZ2 = c1406540mho.LL.LIZIZ();
            c1508360pM2.LJ = video;
            c1508360pM2.LJFF = iLIZIZ2;
            new C1752030vh3();
            C1752030vh3 c1752030vh3 = new C1752030vh3();
            c1752030vh3.LIZ = this.LLJJJJ;
            c1752030vh3.LIZLLL = new C0JSE(video.getWidth(), video.getHeight());
            c1752030vh3.LJ = Integer.valueOf(video.getVideoLength());
            c1752030vh3.LJI = this.LLJLIL;
            C19EG activity = this.LLJJIJIL.getActivity();
            if (activity instanceof SeaPdpActivity) {
                C19GS c19gs = (C19GS) activity;
                c1752030vh3.LIZJ = c19gs.getWindow();
                c1752030vh3.LIZIZ = (ViewGroup) c19gs.findViewById(android.R.id.content);
            } else if (this.LLJJIJIL.getParentFragment() instanceof DialogFragment) {
                Fragment parentFragment = this.LLJJIJIL.getParentFragment();
                if ((parentFragment instanceof DialogFragment) && (dialogFragment = (DialogFragment) parentFragment) != null) {
                    Dialog dialog = dialogFragment.getDialog();
                    if (dialog != null) {
                        window = dialog.getWindow();
                    } else {
                        window = null;
                    }
                    c1752030vh3.LIZJ = window;
                    Dialog dialog2 = dialogFragment.getDialog();
                    if (dialog2 != null) {
                        viewGroup = (ViewGroup) dialog2.findViewById(android.R.id.content);
                    } else {
                        viewGroup = null;
                    }
                    c1752030vh3.LIZIZ = viewGroup;
                }
            }
            C1326790kdB c1326790kdB = C1326790kdB.LIZ;
            ImageUrlModel imageUrlModelLIZ = C438710HIf.LIZ(video.getCover());
            c1326790kdB.getClass();
            C1331670kl3 c1331670kl3LIZLLL = C1326790kdB.LIZLLL(imageUrlModelLIZ);
            c1331670kl3LIZLLL.LJJIJL(this.itemView.getContext());
            c1331670kl3LIZLLL.LJIL = Bitmap.Config.ARGB_8888;
            c1331670kl3LIZLLL.LJJIIJ(new C1775630wJ7(c1752030vh3, this, 1));
            C1752370vhb c1752370vhb = this.LLJJL;
            if (c1752370vhb != null) {
                c1752370vhb.setParams(c1752030vh3);
            }
            C1054104Ah c1054104Ah = e6().LLJLIL;
            if (c1054104Ah != null) {
                String str = c1406540mho.LL.daInfo;
                if (!c1054104Ah.LJJJJJL) {
                    c1054104Ah.LJJJJJL = true;
                    InterfaceC1748810vbr interfaceC1748810vbrLJJIZ = c1054104Ah.LJJIZ();
                    if (interfaceC1748810vbrLJJIZ != null) {
                        C1748720vbi.LIZIZ(interfaceC1748810vbrLJJIZ, new C10515049h(), new AwS140S1100000_26(c1054104Ah, str, 33));
                    }
                }
            }
            C1054104Ah c1054104Ah2 = e6().LLJLIL;
            if (c1054104Ah2 != null) {
                C1054104Ah.LJJIJIL(c1054104Ah2, "", "video", true);
            }
        }
        if (c1406540mho.LLILLJJLI) {
            C03DZ.LIZJ(this.itemView.findViewById(R.id.view_more));
            C03DZ.LIZJ(this.itemView.findViewById(R.id.view_more_background));
            ((TextView) this.itemView.findViewById(R.id.view_more_text)).setText(this.itemView.getContext().getString(c1750080vdu.LIZLLL));
            ((TuxTextView) this.itemView.findViewById(R.id.view_more_text)).setTextColorRes(c1750080vdu.LIZJ);
            ((TuxIconView) this.itemView.findViewById(R.id.view_more_icon)).setTintColorRes(c1750080vdu.LIZIZ);
            if (!this.LLJJLIIIJLLLLLLLZ) {
                this.LLJJLIIIJLLLLLLLZ = true;
                C1748720vbi.LJFF(this.itemView.findViewById(R.id.view_more), new C10515049h(), AFwS215S0000000_26.get$arr$(114), AFwS268S0000000_26.get$arr$(208));
            }
            C948503nH.LJIILIIL(this.itemView.findViewById(R.id.view_more), null, new C1750120vdy(this, null), 3);
            return;
        }
        C03DZ.LIZ(this.itemView.findViewById(R.id.view_more));
        C03DZ.LIZ(this.itemView.findViewById(R.id.view_more_background));
    }

    @Override // X.InterfaceC1508310pLx
    public final void w4(boolean z) {
        if (z) {
            this.LLJJJJ.mute();
        } else {
            this.LLJJJJ.LJIIIIZZ();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r0v11, types: [com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.module.desc.SeaProductDescVideoViewHolder$observer$1] */
    public SeaProductDescVideoViewHolder(ViewGroup viewGroup, ECBaseFragment eCBaseFragment, AwS605S0100000_26 awS605S0100000_26) {
        C1755600vmo c1755600vmo = C1755600vmo.LIZ;
        Context context = viewGroup.getContext();
        c1755600vmo.getClass();
        super(C1755600vmo.LIZ(R.layout.awf, context, viewGroup, false, true));
        this.LLJJIJIL = eCBaseFragment;
        this.LLJJJ = awS605S0100000_26;
        this.LLJJJIL = C452501pT.LIZIZ(new AwS570S0100000_26(this, 1493));
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SeaPdpViewModel.class);
        this.LLJJJJJIL = C452501pT.LIZIZ(new AwS270S0300000_26(this, c19719912DlLIZ, c19719912DlLIZ, 135));
        C1752370vhb c1752370vhb = (C1752370vhb) this.itemView.findViewById(R.id.z11);
        C1508360pM2 c1508360pM2 = new C1508360pM2(c1752370vhb);
        c1508360pM2.LJIILLIIL = "gec_product_detail";
        c1508360pM2.LJIIZILJ = "gec_pdp_description";
        this.LLJJJJ = c1508360pM2;
        this.LLJJL = c1752370vhb;
        this.LLJL = new GenericLifecycleObserver() { // from class: com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.module.desc.SeaProductDescVideoViewHolder$observer$1
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                if (event == Lifecycle.Event.ON_RESUME) {
                    onResume();
                    return;
                }
                if (event == Lifecycle.Event.ON_PAUSE) {
                    onPause();
                } else if (event == Lifecycle.Event.ON_STOP) {
                    onStop();
                } else if (event == Lifecycle.Event.ON_DESTROY) {
                    onDestroy();
                }
            }

            @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
            public final void onDestroy() {
                Aweme aweme = this.LL.LLJJJJLIIL;
                if (aweme != null && aweme.getVideo() != null) {
                    SeaProductDescVideoViewHolder seaProductDescVideoViewHolder = this.LL;
                    C1054104Ah c1054104Ah = seaProductDescVideoViewHolder.e6().LLJLIL;
                    if (c1054104Ah != null) {
                        Aweme aweme2 = seaProductDescVideoViewHolder.LLJJJJLIIL;
                        C1054104Ah.LJJIJ(c1054104Ah, aweme2 != null ? aweme2.getAid() : null, (int) seaProductDescVideoViewHolder.LLJJJJ.LJIILJJIL, "product_description");
                    }
                }
                C1752370vhb c1752370vhb2 = this.LL.LLJJL;
                if (c1752370vhb2 != null) {
                    c1752370vhb2.LIZ(true);
                }
            }

            @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
            public final void onPause() {
                ISeaPdpMediaControlService iSeaPdpMediaControlServiceD6 = this.LL.d6();
                if (iSeaPdpMediaControlServiceD6 != null) {
                    iSeaPdpMediaControlServiceD6.oU(EnumC1486810onH.PAUSE);
                }
                C1752370vhb c1752370vhb2 = this.LL.LLJJL;
                if (c1752370vhb2 != null) {
                    c1752370vhb2.LIZJ();
                }
                ISeaPdpMediaControlService iSeaPdpMediaControlServiceD62 = this.LL.d6();
                if (iSeaPdpMediaControlServiceD62 != null) {
                    iSeaPdpMediaControlServiceD62.MC2(this.LL, false, EnumC1308950kAP.PASSIVE);
                }
            }

            @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
            public final void onResume() {
                SeaProductDescVideoViewHolder seaProductDescVideoViewHolder = this.LL;
                C1752370vhb c1752370vhb2 = seaProductDescVideoViewHolder.LLJJL;
                if (c1752370vhb2 != null) {
                    HandlerHook.viewPost(c1752370vhb2, new ARunnableS92S0200000_23(seaProductDescVideoViewHolder, c1752370vhb2, 19));
                }
            }

            @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
            public final void onStop() {
                C1752370vhb c1752370vhb2 = this.LL.LLJJL;
                if (c1752370vhb2 != null) {
                    c1752370vhb2.LJFF();
                }
            }
        };
        this.LLJLIL = new C1752010vh1(this);
    }
}
