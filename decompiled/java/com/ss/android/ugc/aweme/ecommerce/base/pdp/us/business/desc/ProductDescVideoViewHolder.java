package com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.desc;

import X.AnonymousClass0317;
import X.C01GW;
import X.C034S;
import X.C03DZ;
import X.C04BL;
import X.C0H9I;
import X.C0J0T;
import X.C0JSE;
import X.C1025903zl;
import X.C10515049h;
import X.C1054004Ag;
import X.C1120604Zw;
import X.C1326790kdB;
import X.C1331670kl3;
import X.C1406570mhr;
import X.C1508360pM2;
import X.C1743750vTh;
import X.C1748720vbi;
import X.C1752030vh3;
import X.C1752080vh8;
import X.C1752090vh9;
import X.C1752100vhA;
import X.C1765720w38;
import X.C1775630wJ7;
import X.C19EG;
import X.C19GS;
import X.C1AQS;
import X.C2217381BqS;
import X.C426750GoL;
import X.C438710HIf;
import X.C452501pT;
import X.C948503nH;
import X.C954703oH;
import X.C958103op;
import X.InterfaceC1508380pM4;
import X.InterfaceC1748810vbr;
import X.InterfaceC1763420vzQ;
import X.InterfaceC999703vX;
import Y.ARunnableS92S0200000_23;
import android.R;
import android.app.Dialog;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.SystemClock;
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
import c1b.m;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.widget.RadiusLayout;
import com.ss.android.ugc.aweme.base.ImageUrlModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsBrickFullSpanVH;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.ui.PdpActivity;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.desc.ProductDescVideoViewHolder;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.pictureinpicture.PiPManager;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.vm.PdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpMainState;
import com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment;
import com.ss.android.ugc.aweme.ecommerce.dependency.live.LiveDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.live.ILiveDependencyService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS215S0000000_26;
import kotlin.jvm.internal.AFwS268S0000000_26;
import kotlin.jvm.internal.AwS140S1100000_26;
import kotlin.jvm.internal.AwS4S2201000_26;
import kotlin.jvm.internal.AwS570S0100000_26;
import kotlin.jvm.internal.AwS602S0100000_23;

/* JADX INFO: loaded from: classes27.dex */
public final class ProductDescVideoViewHolder extends AbsBrickFullSpanVH<C1406570mhr> {
    public final Fragment LLJJIJIL;
    public final Function1<Integer, Object> LLJJJ;
    public final C1508360pM2 LLJJJIL;
    public final C01GW LLJJJJ;
    public Aweme LLJJJJJIL;
    public final C1765720w38 LLJJJJLIIL;
    public boolean LLJJL;
    public final ProductDescVideoViewHolder$observer$1 LLJJLIIIJLLLLLLLZ;
    public final C1752080vh8 LLJL;

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsBrickFullSpanVH, com.ss.android.ugc.aweme.ecommerce.base.pdp.basicui.listitem.common.AbsFullSpanVH, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final PdpViewModel d6() {
        return (PdpViewModel) this.LLJJJJ.getValue();
    }

    @Override // com.bytedance.jedi.ext.adapter.JediViewHolder, X.C11EV
    public final void I5() {
        super.I5();
        d6().GR2().LIZ(this.LLJJ, this.LLJJJ, d6().LLLZL, d6().iH1(Integer.valueOf(d6().Tg2())));
    }

    @Override // com.bytedance.jedi.ext.adapter.JediViewHolder, X.C11EV
    public final void P5() {
        super.P5();
        d6().GR2().LIZIZ(this.LLJJ);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.basicui.listitem.common.AbsFullSpanVH, com.bytedance.jedi.ext.adapter.JediViewHolder
    public final void onCreate() {
        super.onCreate();
        d6().hR2(new C2217381BqS() { // from class: X.0vhB
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((PdpMainState) obj).getScrollOffset());
            }
        }, new AwS602S0100000_23(this, 29));
        this.LLJJIJIL.getLifecycle().addObserver(this.LLJJLIIIJLLLLLLLZ);
    }

    @Override // com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder
    public final void onDestroy() {
        C1743750vTh.LIZ(this);
        this.LLJJIJIL.getLifecycle().removeObserver(this.LLJJLIIIJLLLLLLLZ);
    }

    public final boolean e6(View view) {
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
    /* JADX INFO: renamed from: f6, reason: merged with bridge method [inline-methods] */
    public final void rr(C1406570mhr c1406570mhr) {
        Video video;
        DialogFragment dialogFragment;
        Window window;
        ViewGroup viewGroup;
        RadiusLayout radiusLayout;
        super.rr(c1406570mhr);
        d6().GR2().LJFF(this.LLJJ);
        this.LLJJJJJIL = c1406570mhr.LL.LIZ();
        m mVarOE0 = c1406570mhr.LLILLL;
        if (mVarOE0 == null) {
            mVarOE0 = ((InterfaceC999703vX) C1025903zl.LIZ(d6(), InterfaceC999703vX.class)).oE0();
        }
        View view = this.itemView;
        if ((view instanceof RadiusLayout) && (radiusLayout = (RadiusLayout) view) != null) {
            radiusLayout.setRadius(mVarOE0.LLJJJ());
        }
        C426750GoL.LJIIIZ(this.itemView, Integer.valueOf((int) mVarOE0.LLIIII()), null, Integer.valueOf((int) mVarOE0.LLIIII()), Integer.valueOf(mVarOE0.LJJIJL()), false, 18);
        Aweme aweme = this.LLJJJJJIL;
        if (aweme != null && (video = aweme.getVideo()) != null) {
            C1508360pM2 c1508360pM2 = this.LLJJJIL;
            int iLIZIZ = c1406570mhr.LL.LIZIZ();
            c1508360pM2.LJ = video;
            c1508360pM2.LJFF = iLIZIZ;
            C1508360pM2 c1508360pM22 = this.LLJJJIL;
            Aweme aweme2 = this.LLJJJJJIL;
            InterfaceC1508380pM4 interfaceC1508380pM4 = c1508360pM22.LJII;
            if (interfaceC1508380pM4 != null) {
                interfaceC1508380pM4.LIZIZ(aweme2);
            }
            new C1752030vh3();
            C1752030vh3 c1752030vh3 = new C1752030vh3();
            c1752030vh3.LIZ = this.LLJJJIL;
            c1752030vh3.LIZLLL = new C0JSE(video.getWidth(), video.getHeight());
            c1752030vh3.LJ = Integer.valueOf(video.getVideoLength());
            c1752030vh3.LJI = this.LLJL;
            C19EG activity = this.LLJJIJIL.getActivity();
            if (activity instanceof PdpActivity) {
                C19GS c19gs = (C19GS) activity;
                c1752030vh3.LIZJ = c19gs.getWindow();
                c1752030vh3.LIZIZ = (ViewGroup) c19gs.findViewById(R.id.content);
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
                        viewGroup = (ViewGroup) dialog2.findViewById(R.id.content);
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
            c1331670kl3LIZLLL.LJJII(new C1775630wJ7(c1752030vh3, this, 2));
            C1765720w38 c1765720w38 = this.LLJJJJLIIL;
            if (c1765720w38 != null) {
                c1765720w38.setParams(c1752030vh3);
            }
            C1054004Ag c1054004Ag = d6().LLJLILLLLZIIL;
            if (c1054004Ag != null) {
                String str = c1406570mhr.LL.daInfo;
                if (!c1054004Ag.LJJIL) {
                    c1054004Ag.LJJIL = true;
                    InterfaceC1748810vbr interfaceC1748810vbrLJJIJLIJ = c1054004Ag.LJJIJLIJ();
                    if (interfaceC1748810vbrLJJIJLIJ != null) {
                        C1748720vbi.LIZIZ(interfaceC1748810vbrLJJIJLIJ, new C10515049h(), new AwS140S1100000_26(c1054004Ag, str, 64));
                    }
                }
            }
            C1054004Ag c1054004Ag2 = d6().LLJLILLLLZIIL;
            if (c1054004Ag2 != null) {
                C1054004Ag.LJJIJIIJIL(c1054004Ag2, "", "video", true);
            }
        }
        if (c1406570mhr.LLILLJJLI) {
            C03DZ.LIZJ(this.itemView.findViewById(com.zhiliaoapp.musically.R.id.view_more));
            ((TextView) this.itemView.findViewById(com.zhiliaoapp.musically.R.id.view_more_text)).setText(this.itemView.getContext().getString(mVarOE0.LJJLIIIJ()));
            ((TuxTextView) this.itemView.findViewById(com.zhiliaoapp.musically.R.id.view_more_text)).setTextColorRes(mVarOE0.LJJJJLI());
            ((TuxIconView) this.itemView.findViewById(com.zhiliaoapp.musically.R.id.view_more_icon)).setTintColorRes(mVarOE0.LJJJJJL());
            if (!this.LLJJL) {
                this.LLJJL = true;
                C1748720vbi.LJFF(this.itemView.findViewById(com.zhiliaoapp.musically.R.id.view_more), new C10515049h(), AFwS215S0000000_26.get$arr$(133), AFwS268S0000000_26.get$arr$(234));
            }
            C948503nH.LJIILIIL(this.itemView.findViewById(com.zhiliaoapp.musically.R.id.view_more), null, new C1752090vh9(this, null), 3);
            return;
        }
        C03DZ.LIZ(this.itemView.findViewById(com.zhiliaoapp.musically.R.id.view_more));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r0v5, types: [com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.desc.ProductDescVideoViewHolder$observer$1] */
    /* JADX WARN: Type inference failed for: r0v6, types: [X.0vh8] */
    public ProductDescVideoViewHolder(ViewGroup viewGroup, ECBaseFragment eCBaseFragment, View view, C1752100vhA c1752100vhA) {
        if (view == null) {
            C01GW c01gw = C954703oH.LIZ;
            view = C954703oH.LIZ(viewGroup.getContext(), com.zhiliaoapp.musically.R.layout.asj, viewGroup, false);
        }
        super(view);
        this.LLJJIJIL = eCBaseFragment;
        this.LLJJJ = c1752100vhA;
        this.LLJJJJ = C452501pT.LIZIZ(new AwS570S0100000_26(this, 24));
        C1765720w38 c1765720w38 = (C1765720w38) this.itemView.findViewById(com.zhiliaoapp.musically.R.id.z11);
        C1508360pM2 c1508360pM2 = new C1508360pM2(c1765720w38);
        c1508360pM2.LJIILLIIL = "gec_product_detail";
        c1508360pM2.LJIIZILJ = "gec_pdp_description";
        this.LLJJJIL = c1508360pM2;
        this.LLJJJJLIIL = c1765720w38;
        this.LLJJLIIIJLLLLLLLZ = new GenericLifecycleObserver() { // from class: com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.desc.ProductDescVideoViewHolder$observer$1
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
                Aweme aweme = this.LL.LLJJJJJIL;
                if (aweme != null && aweme.getVideo() != null) {
                    ProductDescVideoViewHolder productDescVideoViewHolder = this.LL;
                    C1054004Ag c1054004Ag = productDescVideoViewHolder.d6().LLJLILLLLZIIL;
                    if (c1054004Ag != null) {
                        Aweme aweme2 = productDescVideoViewHolder.LLJJJJJIL;
                        String aid = aweme2 != null ? aweme2.getAid() : null;
                        int i = (int) productDescVideoViewHolder.LLJJJIL.LJIILJJIL;
                        InterfaceC1748810vbr interfaceC1748810vbrLJJIJLIJ = c1054004Ag.LJJIJLIJ();
                        if (interfaceC1748810vbrLJJIJLIJ != null) {
                            C1748720vbi.LIZIZ(interfaceC1748810vbrLJJIJLIJ, new C04BL(), new AwS4S2201000_26(c1054004Ag, "product_description", aid, i, (Integer) null, 3));
                        }
                    }
                }
                C1765720w38 c1765720w382 = this.LL.LLJJJJLIIL;
                if (c1765720w382 != null) {
                    c1765720w382.LIZ(true);
                }
            }

            @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
            public final void onResume() {
                ProductDescVideoViewHolder productDescVideoViewHolder = this.LL;
                C1765720w38 c1765720w382 = productDescVideoViewHolder.LLJJJJLIIL;
                if (c1765720w382 != null) {
                    HandlerHook.viewPost(c1765720w382, new ARunnableS92S0200000_23(productDescVideoViewHolder, c1765720w382, 21));
                }
            }

            @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
            public final void onStop() {
                C1765720w38 c1765720w382 = this.LL.LLJJJJLIIL;
                if (c1765720w382 != null) {
                    c1765720w382.LJFF();
                }
            }

            @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
            public final void onPause() {
                AnonymousClass0317 anonymousClass0317CreateILiveDependencyServicebyMonsterPlugin;
                if (C034S.LIZ()) {
                    C1120604Zw.LIZ.LIZ();
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    anonymousClass0317CreateILiveDependencyServicebyMonsterPlugin = LiveDependencyService.createILiveDependencyServicebyMonsterPlugin(false);
                    C1AQS.LIZJ(jElapsedRealtime, 1, ILiveDependencyService.class.getName(), anonymousClass0317CreateILiveDependencyServicebyMonsterPlugin != null ? anonymousClass0317CreateILiveDependencyServicebyMonsterPlugin.getClass().getName() : null, anonymousClass0317CreateILiveDependencyServicebyMonsterPlugin != null);
                } else {
                    C1120604Zw.LIZ.LIZ();
                    anonymousClass0317CreateILiveDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(ILiveDependencyService.class);
                }
                ((ILiveDependencyService) anonymousClass0317CreateILiveDependencyServicebyMonsterPlugin).setCurrentPlayerMute(false);
                C1765720w38 c1765720w382 = this.LL.LLJJJJLIIL;
                if (c1765720w382 != null) {
                    c1765720w382.LIZJ();
                }
            }
        };
        this.LLJL = new InterfaceC1763420vzQ() { // from class: X.0vh8
            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.InterfaceC1763420vzQ
            public final void LIZIZ() {
                Video video;
                Aweme aweme = this.LIZ.LLJJJJJIL;
                if (aweme == null || (video = aweme.getVideo()) == null) {
                    return;
                }
                ProductDescVideoViewHolder productDescVideoViewHolder = this.LIZ;
                PdpViewModel pdpViewModelD6 = productDescVideoViewHolder.d6();
                EnumC1757150vpJ enumC1757150vpJ = EnumC1757150vpJ.MANUAL;
                PiPManager piPManager = pdpViewModelD6.w;
                if (piPManager != null) {
                    piPManager.k(enumC1757150vpJ, true);
                }
                C1054004Ag c1054004Ag = productDescVideoViewHolder.d6().LLJLILLLLZIIL;
                if (c1054004Ag != null) {
                    Aweme aweme2 = productDescVideoViewHolder.LLJJJJJIL;
                    c1054004Ag.LJJIIJ(video.getVideoLength() * LSPassThroughRecordSizeConfig.DEFAULT, aweme2 != null ? aweme2.getAid() : null, null, "product_description");
                }
                C1054004Ag c1054004Ag2 = productDescVideoViewHolder.d6().LLJLILLLLZIIL;
                if (c1054004Ag2 != null) {
                    String str = ((C1406570mhr) productDescVideoViewHolder.X5()).LL.daInfo;
                    InterfaceC1748810vbr interfaceC1748810vbrLJJIJLIJ = c1054004Ag2.LJJIJLIJ();
                    if (interfaceC1748810vbrLJJIJLIJ != null) {
                        C1748720vbi.LIZIZ(interfaceC1748810vbrLJJIJLIJ, new C10516049i(), new AwS140S1100000_26(c1054004Ag2, str, 63));
                    }
                }
            }
        };
    }
}
