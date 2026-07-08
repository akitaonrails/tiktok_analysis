package com.ss.android.ugc.aweme.ecommerce.base.sku.powercells.productdescription;

import X.AnonymousClass0317;
import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C034S;
import X.C03DZ;
import X.C03IJ;
import X.C03K6;
import X.C0JSE;
import X.C10515049h;
import X.C1066100dqi;
import X.C1120604Zw;
import X.C1326790kdB;
import X.C1331670kl3;
import X.C13LE;
import X.C1406570mhr;
import X.C1406700mi4;
import X.C1421920n6c;
import X.C1427600nFm;
import X.C1508360pM2;
import X.C1748720vbi;
import X.C1752030vh3;
import X.C1752040vh4;
import X.C1752360vha;
import X.C1765720w38;
import X.C1775630wJ7;
import X.C19719912Dl;
import X.C1AQS;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C426750GoL;
import X.C438710HIf;
import X.C452080Ho6;
import X.C452501pT;
import X.C737910Sx3;
import X.C827203La;
import X.C948503nH;
import X.C954703oH;
import X.EnumC1752350vhZ;
import X.InterfaceC1752190vhJ;
import X.InterfaceC1763420vzQ;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.InterfaceC497601wk;
import Y.ARunnableS95S0200000_26;
import android.R;
import android.app.Dialog;
import android.graphics.Bitmap;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import androidx.lifecycle.ViewModelKt;
import c1b.m;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.bytedance.tux.widget.RadiusLayout;
import com.ss.android.ugc.aweme.base.ImageUrlModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BasicPopUp;
import com.ss.android.ugc.aweme.ecommerce.base.sku.vm.SkuPanelAssemVM;
import com.ss.android.ugc.aweme.ecommerce.dependency.live.LiveDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.live.ILiveDependencyService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import kotlin.jvm.internal.AFwS215S0000000_26;
import kotlin.jvm.internal.AFwS268S0000000_26;
import kotlin.jvm.internal.AwS427S0200000_26;
import kotlin.jvm.internal.AwS570S0100000_26;
import kotlin.jvm.internal.AwS605S0100000_26;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class SkuProductVideoCell extends PowerCell<C1406570mhr> implements InterfaceC1752190vhJ {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILJIL;
    public C1508360pM2 LL;
    public final AssemVMLazy LLILLJJLI;
    public final C01GW LLILLL;
    public Aweme LLILZ;
    public C1765720w38 LLILZIL;
    public boolean LLILZLL;
    public TuxTextView LLIZ;
    public FrameLayout LLIZLLLIL;
    public TuxIconView LLJ;
    public final SkuProductVideoCell$observer$1 LLJI;
    public final C1752040vh4 LLJIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SkuProductVideoCell.class, "viewModel", "getViewModel()Lcom/ss/android/ugc/aweme/ecommerce/base/sku/vm/SkuPanelAssemVM;", 0);
        C13LE.LIZ.getClass();
        LLJILJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // X.InterfaceC1752190vhJ
    public final void LJJJJJL(boolean z) {
    }

    @Override // X.InterfaceC1752190vhJ
    public final void LJJLIIIJILLIZJL() {
    }

    @Override // X.InterfaceC1752190vhJ
    public final void h1(C1406700mi4 c1406700mi4, SmartImageView smartImageView, C1066100dqi c1066100dqi) {
    }

    @Override // X.InterfaceC1752190vhJ
    public final void l4(TuxSheet tuxSheet) {
    }

    @Override // X.InterfaceC1752190vhJ
    public final void m4(BasicPopUp basicPopUp, String str) {
    }

    @Override // X.InterfaceC1752190vhJ
    public final void p2() {
    }

    /* JADX WARN: Type inference failed for: r1v35, types: [com.ss.android.ugc.aweme.ecommerce.base.sku.powercells.productdescription.SkuProductVideoCell$observer$1] */
    /* JADX WARN: Type inference failed for: r1v36, types: [X.0vh4] */
    public SkuProductVideoCell() {
        AssemVMLazy assemVMLazy;
        Object obj = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SkuPanelAssemVM.class);
        AwS570S0100000_26 awS570S0100000_26 = new AwS570S0100000_26(c19719912DlLIZ, 589);
        AFwS268S0000000_26 aFwS268S0000000_26 = AFwS268S0000000_26.get$arr$(255);
        if (Intrinsics.LJFF(obj, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(new AwS570S0100000_26(c19719912DlLIZ, 574), awS570S0100000_26, AFwS215S0000000_26.get$arr$(149), new AwS570S0100000_26((C03K6) this, 575), new AwS570S0100000_26((C03K6) this, 577), new AwS570S0100000_26((HasDefaultViewModelProviderFactory) this, 579), aFwS268S0000000_26, new AwS570S0100000_26((C03K6) this, 581), null, new AwS570S0100000_26((C03K6) this, 582));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS570S0100000_26 awS570S0100000_262 = new AwS570S0100000_26((C03K6) this, 576);
            AwS570S0100000_26 awS570S0100000_263 = new AwS570S0100000_26((HasDefaultViewModelProviderFactory) this, 578);
            AwS570S0100000_26 awS570S0100000_264 = new AwS570S0100000_26(c19719912DlLIZ, 580);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS427S0200000_26((InterfaceC451590HnJ) obj, awS570S0100000_262, 33));
            AwS570S0100000_26 awS570S0100000_265 = new AwS570S0100000_26(c01gwLIZIZ, 583);
            AwS570S0100000_26 awS570S0100000_266 = new AwS570S0100000_26(c01gwLIZIZ, 584);
            AwS570S0100000_26 awS570S0100000_267 = new AwS570S0100000_26(c01gwLIZIZ, 585);
            AwS570S0100000_26 awS570S0100000_268 = new AwS570S0100000_26(c01gwLIZIZ, 586);
            AwS570S0100000_26 awS570S0100000_269 = new AwS570S0100000_26(c01gwLIZIZ, 587);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS570S0100000_264, awS570S0100000_26, new C452080Ho6(), awS570S0100000_265, awS570S0100000_266, awS570S0100000_263, aFwS268S0000000_26, awS570S0100000_267, awS570S0100000_268, awS570S0100000_269);
        } else if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new AwS570S0100000_26(c19719912DlLIZ, 588), awS570S0100000_26, AFwS215S0000000_26.get$arr$(150), new AwS570S0100000_26((C03K6) this, 590), new AwS570S0100000_26((C03K6) this, 591), new AwS570S0100000_26((HasDefaultViewModelProviderFactory) this, 592), aFwS268S0000000_26, new AwS570S0100000_26((C03K6) this, 593), null, new AwS570S0100000_26((C03K6) this, 594));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new AwS570S0100000_26(c19719912DlLIZ, 595), awS570S0100000_26, AFwS215S0000000_26.get$arr$(151), new AwS570S0100000_26((C03K6) this, 596), new AwS570S0100000_26((C03K6) this, 597), new AwS570S0100000_26((C03K6) this, 598), aFwS268S0000000_26, null, null, new AwS570S0100000_26((C03K6) this, 572));
        }
        this.LLILLJJLI = assemVMLazy;
        this.LLILLL = C452501pT.LIZIZ(new AwS570S0100000_26(this, 573));
        this.LLJI = new GenericLifecycleObserver() { // from class: com.ss.android.ugc.aweme.ecommerce.base.sku.powercells.productdescription.SkuProductVideoCell$observer$1
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
                C1765720w38 c1765720w38 = this.LL.LLILZIL;
                if (c1765720w38 != null) {
                    c1765720w38.LIZ(true);
                }
            }

            @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
            public final void onResume() {
                SkuProductVideoCell skuProductVideoCell = this.LL;
                C1765720w38 c1765720w38 = skuProductVideoCell.LLILZIL;
                if (c1765720w38 != null) {
                    HandlerHook.viewPost(c1765720w38, new ARunnableS95S0200000_26(skuProductVideoCell, c1765720w38, 12));
                }
            }

            @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
            public final void onStop() {
                C1765720w38 c1765720w38 = this.LL.LLILZIL;
                if (c1765720w38 != null) {
                    c1765720w38.LJFF();
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
                C1765720w38 c1765720w38 = this.LL.LLILZIL;
                if (c1765720w38 != null) {
                    c1765720w38.LIZJ();
                }
            }
        };
        this.LLJIJIL = new InterfaceC1763420vzQ() { // from class: X.0vh4
            @Override // X.InterfaceC1763420vzQ
            public final void LIZIZ() {
                Aweme aweme = this.LIZ.LLILZ;
                if (aweme != null) {
                    aweme.getVideo();
                }
            }
        };
    }

    public final SkuPanelAssemVM I5() {
        AssemVMLazy assemVMLazy = this.LLILLJJLI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILJIL;
        return (SkuPanelAssemVM) assemVMLazy.getValue();
    }

    @Override // com.bytedance.ies.powerlist.PowerCell, X.InterfaceC1906750zib
    public final void onCreate() {
        super.onCreate();
        C827203La.LIZIZ(getCurrentLifecycleOwner()).getLifecycle().addObserver(this.LLJI);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onViewAttachedToWindow() {
        super.onViewAttachedToWindow();
        C1427600nFm c1427600nFmBQ2 = I5().BQ2();
        if (c1427600nFmBQ2 != null) {
            int absoluteAdapterPosition = getAbsoluteAdapterPosition();
            AwS605S0100000_26 awS605S0100000_26 = new AwS605S0100000_26(this, 250);
            InterfaceC497601wk viewModelScope = ViewModelKt.getViewModelScope(I5());
            C1752360vha c1752360vha = EnumC1752350vhZ.Companion;
            Integer numValueOf = Integer.valueOf(I5().Zf2().LJIIJ());
            c1752360vha.getClass();
            c1427600nFmBQ2.LIZ(absoluteAdapterPosition, awS605S0100000_26, viewModelScope, C1752360vha.LIZ(numValueOf));
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onViewDetachedFromWindow() {
        super.onViewDetachedFromWindow();
        C1765720w38 c1765720w38 = this.LLILZIL;
        if (c1765720w38 != null) {
            c1765720w38.LIZJ();
        }
        C1427600nFm c1427600nFmBQ2 = I5().BQ2();
        if (c1427600nFmBQ2 != null) {
            c1427600nFmBQ2.LIZIZ(getAbsoluteAdapterPosition());
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        Video video;
        DialogFragment dialogFragment;
        Window window;
        ViewGroup viewGroup;
        RadiusLayout radiusLayout;
        C1406570mhr c1406570mhr = (C1406570mhr) interfaceC1891350zJl;
        super.onBindItemView(c1406570mhr);
        C1427600nFm c1427600nFmBQ2 = I5().BQ2();
        if (c1427600nFmBQ2 != null) {
            c1427600nFmBQ2.LJFF(getAbsoluteAdapterPosition());
        }
        this.LLILZ = c1406570mhr.LL.LIZ();
        m mVar = (m) this.LLILLL.getValue();
        View view = this.itemView;
        if ((view instanceof RadiusLayout) && (radiusLayout = (RadiusLayout) view) != null) {
            radiusLayout.setRadius(mVar.LLJJJ());
        }
        C426750GoL.LJIIIZ(this.itemView, Integer.valueOf((int) mVar.LLIIII()), null, Integer.valueOf((int) mVar.LLIIII()), Integer.valueOf(mVar.LJJIJL()), false, 18);
        Aweme aweme = this.LLILZ;
        if (aweme != null && (video = aweme.getVideo()) != null) {
            C1508360pM2 c1508360pM2 = this.LL;
            if (c1508360pM2 != null) {
                int iLIZIZ = c1406570mhr.LL.LIZIZ();
                c1508360pM2.LJ = video;
                c1508360pM2.LJFF = iLIZIZ;
            }
            new C1752030vh3();
            C1752030vh3 c1752030vh3 = new C1752030vh3();
            c1752030vh3.LIZ = this.LL;
            c1752030vh3.LIZLLL = new C0JSE(video.getWidth(), video.getHeight());
            c1752030vh3.LJ = Integer.valueOf(video.getVideoLength());
            c1752030vh3.LJI = this.LLJIJIL;
            Fragment fragmentLIZIZ = C827203La.LIZIZ(getCurrentLifecycleOwner());
            if ((fragmentLIZIZ instanceof DialogFragment) && (dialogFragment = (DialogFragment) fragmentLIZIZ) != null) {
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
            C1326790kdB c1326790kdB = C1326790kdB.LIZ;
            ImageUrlModel imageUrlModelLIZ = C438710HIf.LIZ(video.getCover());
            c1326790kdB.getClass();
            C1331670kl3 c1331670kl3LIZLLL = C1326790kdB.LIZLLL(imageUrlModelLIZ);
            c1331670kl3LIZLLL.LJJIJL(this.itemView.getContext());
            c1331670kl3LIZLLL.LJIL = Bitmap.Config.ARGB_8888;
            c1331670kl3LIZLLL.LJJII(new C1775630wJ7(c1752030vh3, this, 3));
            C1765720w38 c1765720w38 = this.LLILZIL;
            if (c1765720w38 != null) {
                c1765720w38.setParams(c1752030vh3);
            }
        }
        if (c1406570mhr.LLILLJJLI) {
            FrameLayout frameLayout = this.LLIZLLLIL;
            if (frameLayout != null) {
                C03DZ.LIZJ(frameLayout);
            }
            TuxTextView tuxTextView = this.LLIZ;
            if (tuxTextView != null) {
                tuxTextView.setText(this.itemView.getContext().getString(mVar.LJJLIIIJ()));
            }
            TuxTextView tuxTextView2 = this.LLIZ;
            if (tuxTextView2 != null) {
                tuxTextView2.setTextColorRes(mVar.LJJJJLI());
            }
            TuxIconView tuxIconView = this.LLJ;
            if (tuxIconView != null) {
                tuxIconView.setTintColorRes(mVar.LJJJJJL());
            }
            if (!this.LLILZLL) {
                this.LLILZLL = true;
                FrameLayout frameLayout2 = this.LLIZLLLIL;
                if (frameLayout2 != null) {
                    C1748720vbi.LJFF(frameLayout2, new C10515049h(), AFwS215S0000000_26.get$arr$(291), AFwS268S0000000_26.get$arr$(497));
                }
            }
            FrameLayout frameLayout3 = this.LLIZLLLIL;
            if (frameLayout3 != null) {
                C948503nH.LJIILIIL(frameLayout3, null, new C1421920n6c(this, null), 3);
            }
        } else {
            FrameLayout frameLayout4 = this.LLIZLLLIL;
            if (frameLayout4 != null) {
                C03DZ.LIZ(frameLayout4);
            }
        }
        C1765720w38 c1765720w382 = this.LLILZIL;
        if (c1765720w382 != null) {
            c1765720w382.LIZLLL();
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        C01GW c01gw = C954703oH.LIZ;
        View viewLIZ = C954703oH.LIZ(viewGroup.getContext(), com.zhiliaoapp.musically.R.layout.asj, viewGroup, false);
        C1765720w38 c1765720w38 = (C1765720w38) viewLIZ.findViewById(com.zhiliaoapp.musically.R.id.z11);
        C1508360pM2 c1508360pM2 = new C1508360pM2(c1765720w38);
        c1508360pM2.LJIILLIIL = "gec_product_detail";
        c1508360pM2.LJIIZILJ = "gec_pdp_description";
        this.LL = c1508360pM2;
        this.LLILZIL = c1765720w38;
        this.LLIZ = (TuxTextView) viewLIZ.findViewById(com.zhiliaoapp.musically.R.id.view_more_text);
        this.LLIZLLLIL = (FrameLayout) viewLIZ.findViewById(com.zhiliaoapp.musically.R.id.view_more);
        this.LLJ = (TuxIconView) viewLIZ.findViewById(com.zhiliaoapp.musically.R.id.view_more_icon);
        return viewLIZ;
    }
}
