package com.ss.android.ugc.aweme.poi.detail.basicinfo.header.p008new;

import X.AbstractC712240Rwk;
import X.C019F;
import X.C01GW;
import X.C08A4;
import X.C098200Yq;
import X.C09HN;
import X.C09R3;
import X.C0ZDN;
import X.C1173300gdc;
import X.C1174850gg7;
import X.C1175120ggY;
import X.C1178990gmn;
import X.C1180060goW;
import X.C1185000gwU;
import X.C1185410gx9;
import X.C1185430gxB;
import X.C1185490gxH;
import X.C1185600gxS;
import X.C1186000gy6;
import X.C1186010gy7;
import X.C1186030gy9;
import X.C1188440h22;
import X.C1252710ihh;
import X.C1308910kAL;
import X.C13BV;
import X.C13LE;
import X.C13LP;
import X.C15438062q;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1637806bA;
import X.C166V;
import X.C1697810uHb;
import X.C189200o6;
import X.C18JG;
import X.C19719912Dl;
import X.C19M4;
import X.C19MB;
import X.C20600815jK;
import X.C2188811AlT;
import X.C2211941Bhg;
import X.C2213981Bky;
import X.C2217381BqS;
import X.C2248361CzK;
import X.C2365509Or;
import X.C337180DJs;
import X.C341680DaQ;
import X.C384050F3z;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C426750GoL;
import X.C452501pT;
import X.C698190Ra5;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC043300Dn;
import X.EnumC1181950grZ;
import X.InterfaceC1181010gq3;
import X.InterfaceC1184330gvP;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import X.InterfaceC665370Q7z;
import X.ViewOnAttachStateChangeListenerC20631115oD;
import Y.ARunnableS118S0100000_18;
import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.os.Looper;
import android.text.TextPaint;
import android.view.animation.LinearInterpolator;
import androidx.fragment.app.Fragment;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.poi.detail.basicinfo.IPoiSlashContextAbility;
import com.ss.android.ugc.aweme.poi.detail.basicinfo.header.ai.model.PoiHeadAiSummary;
import com.ss.android.ugc.aweme.poi.detail.container.PoiDetailInfoViewModel;
import com.ss.android.ugc.aweme.poi.detail.container.PoiListApi;
import com.ss.android.ugc.aweme.poi.detail.container.model.DynamicIcon;
import com.ss.android.ugc.aweme.poi.detail.container.model.PictureAlbum;
import com.ss.android.ugc.aweme.poi.detail.container.model.PoiCommonMobParams;
import com.ss.android.ugc.aweme.poi.detail.container.newarchi.abilities.ContainerEventDispatcher$IPoiDetailContentTouchAbility;
import com.ss.android.ugc.aweme.poi.detail.container.newarchi.abilities.ContainerEventDispatcher$IPoiDetailSpringScrollAbility;
import com.ss.android.ugc.aweme.poi.detail.container.newarchi.abilities.ContainerEventDispatcher$PageScrollCallBackAbility;
import com.ss.android.ugc.aweme.poi.detail.container.slash.component.PoiDetailBaseUiSlotComponent;
import com.ss.android.ugc.aweme.poi.detail.dishes.PoiInnerPageMobData;
import com.ss.android.ugc.aweme.poi.detail.gallery.PoiPicture;
import com.ss.android.ugc.aweme.poi.model.PoiCurrentSessionInfo;
import com.ss.android.ugc.aweme.poi.uiwidget.gallery.PoiGalleryAnchorData;
import com.ss.android.ugc.aweme.slash.component.BaseComponentData;
import com.zhiliaoapp.musically.R;
import irm.AkS57S0200000_18;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS597S0100000_18;
import kotlin.jvm.internal.AwS60S0001000_18;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiHeaderGalleryAssem extends PoiDetailBaseUiSlotComponent<PoiHeaderGalleryModule> implements ContainerEventDispatcher$IPoiDetailSpringScrollAbility, ContainerEventDispatcher$IPoiDetailContentTouchAbility, ContainerEventDispatcher$PageScrollCallBackAbility, IHeaderGalleryAbility {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJLL;
    public static final int LLJLLIL;
    public static final int LLJLLL;
    public static final int LLJZ;
    public final AssemVMLazy LLJJIJI;
    public final C166V LLJJIJIIJIL;
    public PictureAlbum LLJJIJIL;
    public Animator LLJJJ;
    public Animator LLJJJIL;
    public int LLJJJJ;
    public int LLJJJJJIL;
    public final Map<Integer, Boolean> LLJJJJLIIL;
    public final C01GW LLJJL;
    public boolean LLJJLIIIJLLLLLLLZ;
    public final BPEAHandler LLJL;
    public final C01GW LLJLIL;
    public final ARunnableS118S0100000_18 LLJLILLLLZIIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PoiHeaderGalleryAssem.class, "poiDetailHeaderVm", "getPoiDetailHeaderVm()Lcom/ss/android/ugc/aweme/poi/detail/container/PoiDetailInfoViewModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(PoiHeaderGalleryAssem.class, "binding", "getBinding()Lcom/ss/android/ugc/tiktok/poi/databinding/PoiDetailLayoutHeaderGalleryBinding;", 0);
        c09r3.getClass();
        LLJLL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
        LLJLLIL = 242;
        LLJLLL = 24;
        LLJZ = 16;
    }

    public PoiHeaderGalleryAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PoiDetailInfoViewModel.class);
        this.LLJJIJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS562S0100000_18(c19719912DlLIZ, 1019), AFwS256S0000000_18.get$arr$(357), null, true);
        this.LLJJIJIIJIL = new C166V(new AwS597S0100000_18((UISlotAssem) this, 302));
        this.LLJJJJLIIL = new LinkedHashMap();
        this.LLJJL = C452501pT.LIZIZ(new AwS562S0100000_18(this, 1018));
        this.LLJL = new BPEAHandler(Looper.getMainLooper());
        this.LLJLIL = C452501pT.LIZIZ(new AwS562S0100000_18(this, 1017));
        this.LLJLILLLLZIIL = new ARunnableS118S0100000_18(this, 34);
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.e06;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onPause_isOnPauseEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onResume_isOnResumeEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    public final C1186000gy6 sp() {
        C166V c166v = this.LLJJIJIIJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJLL;
        return (C1186000gy6) c166v.LIZ(this);
    }

    public final PoiDetailInfoViewModel tp() {
        AssemVMLazy assemVMLazy = this.LLJJIJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJLL;
        return (PoiDetailInfoViewModel) assemVMLazy.getValue();
    }

    public final void yp() {
        if (this.LLJJLIIIJLLLLLLLZ) {
            return;
        }
        this.LLJL.removeCallbacks(this.LLJLILLLLZIIL);
        C786410Ut5.LJLIIL(3000L, this.LLJL, this.LLJLILLLLZIIL);
    }

    @Override // com.ss.android.ugc.aweme.slash.component.BaseSlashSlotAssemComponent, com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        this.LLJJLIIIJLLLLLLLZ = false;
        tp().vQ2(EnumC1181950grZ.GALLERY_HEADER);
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            C1558520qew.LJII(C1558360qeg.LJFF(fragmentLJI, null), this, IHeaderGalleryAbility.class, null, null);
        }
    }

    @Override // com.ss.android.ugc.aweme.slash.component.BaseSlashSlotAssemComponent, com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        this.LLJJLIIIJLLLLLLLZ = true;
        this.LLJL.removeCallbacksAndMessages(null);
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            C1558520qew.LJIIJJI(C1558360qeg.LJFF(fragmentLJI, null), IHeaderGalleryAbility.class, null);
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void onPause() {
        super.onPause();
        this.LLJL.removeCallbacks(this.LLJLILLLLZIIL);
    }

    @Override // X.AbstractC738140SxQ
    public final void onResume() {
        super.onResume();
        yp();
    }

    public final void up() {
        if (sp().LLILZ.getBackground() == null) {
            C19M4 c19m4 = sp().LLILZ;
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZ = C1308910kAL.LIZJ(R.attr.zg, getContentView().getContext());
            c384050F3z.LIZJ = Float.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6)));
            c19m4.setBackground(c384050F3z.LIZ(getContentView().getContext()));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r11v4, types: [java.util.ArrayList] */
    @Override // com.ss.android.ugc.aweme.slash.component.BaseSlashSlotAssemComponent, X.InterfaceC1173970geh
    public final void CG1(BaseComponentData baseComponentData) {
        int type;
        ?? arrayList;
        String str;
        String str2;
        Object c098200Yq;
        TuxTextView tuxTextView;
        List<UrlModel> picturesByExperiment;
        PoiPicture poiPicture;
        Integer numValueOf;
        Integer numValueOf2;
        Integer num;
        Integer numValueOf3;
        List<UrlModel> picturesByExperiment2;
        List<UrlModel> picturesByExperiment3;
        Integer num2;
        PoiHeaderGalleryModule poiHeaderGalleryModule = (PoiHeaderGalleryModule) baseComponentData;
        super.CG1(poiHeaderGalleryModule);
        this.LLJJIJIL = poiHeaderGalleryModule.getPictureAlbum();
        PictureAlbum pictureAlbum = poiHeaderGalleryModule.getPictureAlbum();
        if (pictureAlbum != null && (num2 = pictureAlbum.uiType) != null) {
            type = num2.intValue();
        } else {
            type = EnumC043300Dn.DOT_STYLE.getType();
        }
        if (type == EnumC043300Dn.DOT_STYLE.getType()) {
            up();
            PictureAlbum pictureAlbum2 = poiHeaderGalleryModule.getPictureAlbum();
            if (pictureAlbum2 != null && (picturesByExperiment3 = pictureAlbum2.getPicturesByExperiment()) != null) {
                numValueOf = Integer.valueOf(picturesByExperiment3.size());
            } else {
                numValueOf = null;
            }
            int iLIZJ = C1175120ggY.LIZJ(numValueOf);
            if (iLIZJ > 1) {
                C337180DJs.LIZJ(sp().LLILLL);
                sp().LLILLL.setCount(iLIZJ);
                sp().LLILLL.setLifecycleOwner(this);
                sp().LLILLL.LLIZLLLIL = true;
                sp().LLILLL.setSelectedIndex(0);
            } else {
                C337180DJs.LIZ(sp().LLILLL);
            }
            PictureAlbum pictureAlbum3 = poiHeaderGalleryModule.getPictureAlbum();
            if (pictureAlbum3 != null && (picturesByExperiment2 = pictureAlbum3.getPicturesByExperiment()) != null) {
                numValueOf2 = Integer.valueOf(picturesByExperiment2.size());
            } else {
                numValueOf2 = null;
            }
            int iLIZJ2 = C1175120ggY.LIZJ(numValueOf2);
            if (pictureAlbum3 != null) {
                num = pictureAlbum3.imageCountLabelShowThreshold;
            } else {
                num = null;
            }
            if (iLIZJ2 > C1175120ggY.LIZJ(num)) {
                C19M4 c19m4 = sp().LLILZ;
                C419910GdJ c419910GdJ = new C419910GdJ();
                c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
                c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
                c419910GdJ.LIZ = R.raw.icon_image_alt_1_fill;
                c419910GdJ.LJ = Integer.valueOf(R.attr.zi);
                c19m4.setStartIcon(c419910GdJ);
                C19M4 c19m42 = sp().LLILZ;
                if (pictureAlbum3 != null) {
                    numValueOf3 = Integer.valueOf(pictureAlbum3.totalPictureNum);
                } else {
                    numValueOf3 = null;
                }
                c19m42.setText(String.valueOf(C1175120ggY.LIZJ(numValueOf3)));
                C337180DJs.LIZJ(sp().LLILZ);
            } else {
                C337180DJs.LIZ(sp().LLILZ);
            }
        } else if (type == EnumC043300Dn.NUMBER_STYLE.getType()) {
            up();
            C337180DJs.LIZ(sp().LLILLL);
        }
        PictureAlbum pictureAlbum4 = poiHeaderGalleryModule.getPictureAlbum();
        final ViewOnAttachStateChangeListenerC20631115oD viewOnAttachStateChangeListenerC20631115oD = sp().LLILZLL;
        ArrayList arrayList2 = new ArrayList();
        if (pictureAlbum4 != null && (picturesByExperiment = pictureAlbum4.getPicturesByExperiment()) != null) {
            arrayList = new ArrayList(C15438062q.LJIJJ(picturesByExperiment, 10));
            int i = 0;
            for (UrlModel urlModel : picturesByExperiment) {
                int i2 = i + 1;
                if (i >= 0) {
                    UrlModel urlModel2 = urlModel;
                    List<PoiPicture> list = pictureAlbum4.poiPictures;
                    if (list != null) {
                        poiPicture = (PoiPicture) C13LP.LJJJLZIJ(i, list);
                    } else {
                        poiPicture = null;
                    }
                    arrayList.add(new C1186010gy7(urlModel2, poiPicture));
                    i = i2;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
        } else {
            arrayList = C13BV.INSTANCE;
        }
        arrayList2.addAll(arrayList);
        C20600815jK<InterfaceC1891350zJl> state = viewOnAttachStateChangeListenerC20631115oD.getViewItemOperator().getState();
        state.LJFF(null);
        state.LIZLLL(arrayList2, null);
        if (!viewOnAttachStateChangeListenerC20631115oD.isFakeDragging()) {
            viewOnAttachStateChangeListenerC20631115oD.setCurrentItem(0);
        } else {
            viewOnAttachStateChangeListenerC20631115oD.registerOnPageChangeCallback(new AbstractC712240Rwk() { // from class: X.0gy8
                public final /* synthetic */ int LLILLJJLI = 0;

                @Override // X.AbstractC712240Rwk
                public final void onPageScrollStateChanged(int i3) {
                    if (i3 == 0 && !viewOnAttachStateChangeListenerC20631115oD.isFakeDragging()) {
                        viewOnAttachStateChangeListenerC20631115oD.setCurrentItem(this.LLILLJJLI);
                        viewOnAttachStateChangeListenerC20631115oD.unregisterOnPageChangeCallback(this);
                    }
                }
            });
        }
        yp();
        PoiHeadAiSummary aiSummary = poiHeaderGalleryModule.getAiSummary();
        if (aiSummary != null && (str = aiSummary.recommendationText) != null && str.length() > 0) {
            C341680DaQ c341680DaQ = sp().LLILLJJLI;
            PoiHeadAiSummary aiSummary2 = poiHeaderGalleryModule.getAiSummary();
            c341680DaQ.getClass();
            if (aiSummary2 != null) {
                String str3 = aiSummary2.recommendationText;
                if (str3 != null && (tuxTextView = c341680DaQ.LL) != null) {
                    tuxTextView.setText(str3);
                }
                DynamicIcon dynamicIcon = aiSummary2.icon;
                if (dynamicIcon != null && (str2 = dynamicIcon.tuxToken) != null) {
                    try {
                        C01GW c01gw = C2248361CzK.LIZ;
                        c098200Yq = C2248361CzK.LJFF(c341680DaQ.getContext(), str2);
                        C189200o6.m2constructorimpl(c098200Yq);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        c098200Yq = new C098200Yq(th);
                        C189200o6.m2constructorimpl(c098200Yq);
                    }
                    if (C189200o6.m7isFailureimpl(c098200Yq)) {
                        c098200Yq = null;
                    }
                    C698190Ra5 c698190Ra5 = (C698190Ra5) c098200Yq;
                    if (c698190Ra5 != null) {
                        C419910GdJ c419910GdJ2 = new C419910GdJ();
                        c419910GdJ2.LIZ = c698190Ra5.LIZ;
                        c419910GdJ2.LJ = Integer.valueOf(R.attr.cc);
                        TuxIconView tuxIconView = c341680DaQ.LLILLJJLI;
                        if (tuxIconView != null) {
                            tuxIconView.setTuxIcon(c419910GdJ2);
                        }
                    }
                }
            }
            TextPaint paint = sp().LLILZ.getPaint();
            PictureAlbum pictureAlbum5 = this.LLJJIJIL;
            if (pictureAlbum5 != null) {
                Integer numValueOf4 = Integer.valueOf(pictureAlbum5.totalPictureNum);
                if (C08A4.LIZ(Integer.valueOf(numValueOf4.intValue()))) {
                    int iIntValue = numValueOf4.intValue();
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("5/");
                    sbLIZ.append(iIntValue);
                    C426750GoL.LJIIIZ(sp().LLILLJJLI, null, null, Integer.valueOf((int) (C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20)) + paint.measureText(C2188811AlT.LIZIZ(sbLIZ)) + C1180060goW.LIZLLL(sp().LLILZ) + C1180060goW.LJI(sp().LLILZ))), null, false, 27);
                    C337180DJs.LIZJ(sp().LLILLJJLI);
                    C1185430gxB c1185430gxB = C1185430gxB.LIZ;
                    InterfaceC665370Q7z interfaceC665370Q7zLJIIL = C1558520qew.LJIIL(this);
                    String str4 = poiHeaderGalleryModule.getAiSummary().dimensionKey;
                    PageFinder pageFinder = (PageFinder) this.LLJLIL.getValue();
                    c1185430gxB.getClass();
                    C1185430gxB.LJI(pageFinder, interfaceC665370Q7zLJIIL, null, str4);
                }
            }
            zp(1);
        }
        C337180DJs.LIZ(sp().LLILLJJLI);
        C19MB c19mb = new C19MB();
        c19mb.LJII(sp().LLILZIL);
        c19mb.LJIIJJI(sp().LLILZ.getId(), -2);
        c19mb.LJI(sp().LLILZ.getId(), 3);
        c19mb.LJI(sp().LLILZ.getId(), 4);
        c19mb.LJIIIZ(sp().LLILZ.getId(), 4, 0, 4, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(LLJZ))) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(LLJLLL))));
        c19mb.LIZIZ(sp().LLILZIL);
        PoiHeadAiSummary aiSummary3 = poiHeaderGalleryModule.getAiSummary();
        if (aiSummary3 != null && Intrinsics.LJFF(aiSummary3.clickEnable, Boolean.FALSE)) {
            C341680DaQ c341680DaQ2 = sp().LLILLJJLI;
            if (C2213981Bky.LIZIZ.isOffline()) {
                C2211941Bhg.LIZ.injectViewListener(c341680DaQ2);
            }
            c341680DaQ2.setOnClickListener(null);
            sp().LLILLJJLI.setClickable(false);
        } else {
            C786410Ut5.I7(new AkS57S0200000_18(this, poiHeaderGalleryModule, 9), sp().LLILLJJLI);
        }
        zp(1);
    }

    @Override // com.ss.android.ugc.aweme.poi.detail.container.newarchi.abilities.ContainerEventDispatcher$IPoiDetailSpringScrollAbility
    public final void a3(int i) {
        if (this.LLJJJJJIL != i) {
            this.LLJJJJJIL = i;
            C1180060goW.LJIIIZ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(LLJLLIL))) + Math.abs(i), sp().LLIZ);
        }
    }

    @Override // com.ss.android.ugc.aweme.poi.detail.container.newarchi.abilities.ContainerEventDispatcher$PageScrollCallBackAbility
    public final void bq(int i) {
        Animator animator;
        Animator animator2;
        Animator animator3;
        C1186030gy9.LIZ(new AwS60S0001000_18(i, 3));
        if (i < this.LLJJJJ || getContentView().getAlpha() <= 0.0f || ((animator2 = this.LLJJJIL) != null && animator2.isStarted())) {
            if (i <= this.LLJJJJ && getContentView().getAlpha() < 1.0f) {
                Animator animator4 = this.LLJJJ;
                if (animator4 != null && animator4.isStarted()) {
                    return;
                }
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(getContentView(), "alpha", 0.0f, 1.0f);
                objectAnimatorOfFloat.setDuration(200L);
                objectAnimatorOfFloat.setInterpolator(new LinearInterpolator());
                this.LLJJJ = objectAnimatorOfFloat;
                objectAnimatorOfFloat.start();
                Animator animator5 = this.LLJJJIL;
                if (animator5 != null && animator5.isStarted() && (animator = this.LLJJJIL) != null) {
                    animator.cancel();
                }
                yp();
                return;
            }
            return;
        }
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(getContentView(), "alpha", 1.0f, 0.0f);
        objectAnimatorOfFloat2.setDuration(200L);
        objectAnimatorOfFloat2.setInterpolator(new LinearInterpolator());
        this.LLJJJIL = objectAnimatorOfFloat2;
        objectAnimatorOfFloat2.start();
        Animator animator6 = this.LLJJJ;
        if (animator6 != null && animator6.isStarted() && (animator3 = this.LLJJJ) != null) {
            animator3.cancel();
        }
        this.LLJL.removeCallbacks(this.LLJLILLLLZIIL);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to com.ss.android.ugc.aweme.poi.detail.basicinfo.header.new.PoiHeaderGalleryAssem for r14v6 'this'  java.lang.Object
        	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
        	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
        	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // com.ss.android.ugc.aweme.poi.detail.container.slash.component.PoiDetailBaseUiSlotComponent, com.ss.android.ugc.aweme.slash.component.BaseSlashSlotAssemComponent, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(android.view.View r15) {
        /*
            Method dump skipped, instruction units count: 690
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.detail.basicinfo.header.p008new.PoiHeaderGalleryAssem.onViewCreated(android.view.View):void");
    }

    @Override // com.ss.android.ugc.aweme.poi.detail.container.newarchi.abilities.ContainerEventDispatcher$PageScrollCallBackAbility
    public final void oq(int i) {
        C1186030gy9.LIZ(new AwS60S0001000_18(i, 2));
    }

    @Override // com.ss.android.ugc.aweme.poi.detail.basicinfo.header.p008new.IHeaderGalleryAbility
    public final void vO(int i) {
        this.LLJJJJLIIL.put(Integer.valueOf(i), Boolean.TRUE);
        if (sp().LLILZLL.getCurrentItem() == i) {
            C337180DJs.LIZJ(sp().LLJ);
            C337180DJs.LIZJ(sp().LLIZLLLIL);
        }
    }

    public final void zp(int i) {
        PictureAlbum pictureAlbum;
        Integer numValueOf;
        List<UrlModel> picturesByExperiment;
        PoiHeaderGalleryModule poiHeaderGalleryModule = (PoiHeaderGalleryModule) C1174850gg7.LIZJ(this);
        if (poiHeaderGalleryModule != null && (pictureAlbum = poiHeaderGalleryModule.getPictureAlbum()) != null) {
            Integer num = pictureAlbum.uiType;
            int type = EnumC043300Dn.NUMBER_STYLE.getType();
            if (num != null && num.intValue() == type) {
                PictureAlbum pictureAlbum2 = this.LLJJIJIL;
                Integer num2 = null;
                if (pictureAlbum2 != null && (picturesByExperiment = pictureAlbum2.getPicturesByExperiment()) != null) {
                    numValueOf = Integer.valueOf(picturesByExperiment.size());
                } else {
                    numValueOf = null;
                }
                int iLIZJ = C1175120ggY.LIZJ(numValueOf);
                PictureAlbum pictureAlbum3 = this.LLJJIJIL;
                if (pictureAlbum3 != null) {
                    num2 = pictureAlbum3.imageCountLabelShowThreshold;
                }
                if (iLIZJ > C1175120ggY.LIZJ(num2)) {
                    PictureAlbum pictureAlbum4 = this.LLJJIJIL;
                    if (pictureAlbum4 != null) {
                        Integer numValueOf2 = Integer.valueOf(pictureAlbum4.totalPictureNum);
                        if (C08A4.LIZ(Integer.valueOf(numValueOf2.intValue()))) {
                            int iIntValue = numValueOf2.intValue();
                            C19M4 c19m4 = sp().LLILZ;
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append(i);
                            sbLIZ.append('/');
                            sbLIZ.append(iIntValue);
                            c19m4.setText(C2188811AlT.LIZIZ(sbLIZ));
                            C337180DJs.LIZJ(sp().LLILZ);
                            return;
                        }
                        return;
                    }
                    return;
                }
                C337180DJs.LIZ(sp().LLILZ);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.poi.detail.basicinfo.header.p008new.IHeaderGalleryAbility
    public final void Vp2(String str, SmartImageView smartImageView, UrlModel urlModel) {
        boolean z;
        PictureAlbum pictureAlbum;
        ArrayList arrayListLIZ;
        ArrayList arrayListLIZ2;
        int i;
        ArrayList arrayListLJ;
        Object c098200Yq;
        C1185600gxS c1185600gxS;
        Integer numValueOf;
        C1188440h22 c1188440h22;
        C1185410gx9 c1185410gx9;
        C1185490gxH c1185490gxH;
        String poiId;
        String collectInfo;
        String regionCode;
        String fromGroupId;
        String initialEnterFrom;
        String initialEnterMethod;
        String initialPoiFromGroupId;
        String collectInfo2;
        PictureAlbum pictureAlbum2;
        C1173300gdc c1173300gdcQr0;
        PoiCurrentSessionInfo poiCurrentSessionInfoA50;
        String strLJ;
        Object objLJJJLL;
        List<String> urlList;
        List<PoiPicture> list;
        List<UrlModel> picturesByExperiment;
        Object objLJJJLL2;
        C1185600gxS c1185600gxS2;
        Object c098200Yq2;
        Long lValueOf;
        String collectInfo3;
        C1188440h22 c1188440h222;
        C1185490gxH c1185490gxH2;
        Integer numValueOf2;
        String collectInfo4;
        String regionCode2;
        String fromGroupId2;
        String initialEnterFrom2;
        String initialEnterMethod2;
        String initialPoiFromGroupId2;
        PictureAlbum pictureAlbum3;
        PoiCurrentSessionInfo poiCurrentSessionInfoA502;
        String strLJ2;
        PictureAlbum pictureAlbum4 = this.LLJJIJIL;
        if (pictureAlbum4 != null && pictureAlbum4.routeToGallery) {
            z = true;
        } else {
            z = false;
        }
        String collectInfo5 = null;
        String str2 = "";
        if (z) {
            Context context = getContext();
            if (context != null) {
                if (Intrinsics.LJFF(str, "slide_to_album")) {
                    new C0ZDN(context).LIZ(0);
                }
                C1173300gdc c1173300gdcLJ = C1174850gg7.LJ(this);
                if (c1173300gdcLJ != null) {
                    c1185600gxS2 = (C1185600gxS) c1173300gdcLJ.LIZ;
                } else {
                    c1185600gxS2 = null;
                }
                IPoiSlashContextAbility iPoiSlashContextAbility = (IPoiSlashContextAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), IPoiSlashContextAbility.class, null);
                if (iPoiSlashContextAbility != null && (poiCurrentSessionInfoA502 = iPoiSlashContextAbility.a50()) != null && (strLJ2 = C2365509Or.LJ(poiCurrentSessionInfoA502)) != null) {
                    str2 = strLJ2;
                }
                try {
                    InterfaceC1184330gvP interfaceC1184330gvP = (InterfaceC1184330gvP) C1252710ihh.LJI(this, C13LE.LIZ(InterfaceC1184330gvP.class), null);
                    if (interfaceC1184330gvP != null) {
                        c098200Yq2 = interfaceC1184330gvP.Nf();
                    } else {
                        c098200Yq2 = null;
                    }
                    C189200o6.m2constructorimpl(c098200Yq2);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq2 = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq2);
                }
                if (C189200o6.m7isFailureimpl(c098200Yq2)) {
                    c098200Yq2 = null;
                }
                C1185410gx9 c1185410gx92 = (C1185410gx9) c098200Yq2;
                SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, "//poi/album");
                smartRouteBuildRoute.withParam("poi_id", tp().LL);
                if (c1185600gxS2 != null) {
                    lValueOf = Long.valueOf(c1185600gxS2.LJIIJ);
                } else {
                    lValueOf = null;
                }
                smartRouteBuildRoute.withParam("fragment_id", lValueOf);
                PoiListApi.PoiDetailResponse poiDetailResponse = tp().LLILLJJLI;
                if (poiDetailResponse != null) {
                    collectInfo3 = poiDetailResponse.getCollectInfo();
                } else {
                    collectInfo3 = null;
                }
                smartRouteBuildRoute.withParam("collect_info", collectInfo3);
                smartRouteBuildRoute.withParam("current_poi_session_info", str2);
                smartRouteBuildRoute.withParam("poi_detail_response", ip());
                if (c1185600gxS2 != null) {
                    c1188440h222 = c1185600gxS2.LJ;
                } else {
                    c1188440h222 = null;
                }
                smartRouteBuildRoute.withParam("poi_anchor_data", c1188440h222);
                smartRouteBuildRoute.withParam("poi_detail_params", c1185410gx92);
                if (c1185600gxS2 != null) {
                    c1185490gxH2 = c1185600gxS2.LJI;
                } else {
                    c1185490gxH2 = null;
                }
                smartRouteBuildRoute.withParam("poiAnchorMobData", c1185490gxH2);
                PoiListApi.PoiDetailResponse poiDetailResponseIp = ip();
                if (poiDetailResponseIp != null && (pictureAlbum3 = poiDetailResponseIp.getPictureAlbum()) != null) {
                    numValueOf2 = Integer.valueOf(pictureAlbum3.totalPictureNum);
                } else {
                    numValueOf2 = null;
                }
                smartRouteBuildRoute.withParam("image_size", C1175120ggY.LIZJ(numValueOf2));
                String str3 = tp().LL;
                PoiListApi.PoiDetailResponse poiDetailResponse2 = tp().LLILLJJLI;
                if (poiDetailResponse2 != null) {
                    collectInfo4 = poiDetailResponse2.getCollectInfo();
                } else {
                    collectInfo4 = null;
                }
                PoiListApi.PoiDetailResponse poiDetailResponse3 = tp().LLILLJJLI;
                if (poiDetailResponse3 != null) {
                    regionCode2 = poiDetailResponse3.getRegionCode();
                } else {
                    regionCode2 = null;
                }
                if (c1185410gx92 != null) {
                    fromGroupId2 = c1185410gx92.getFromGroupId();
                    initialEnterFrom2 = c1185410gx92.getInitialEnterFrom();
                    initialEnterMethod2 = c1185410gx92.getInitialEnterMethod();
                    initialPoiFromGroupId2 = c1185410gx92.getInitialPoiFromGroupId();
                } else {
                    fromGroupId2 = null;
                    initialEnterFrom2 = null;
                    initialEnterMethod2 = null;
                    initialPoiFromGroupId2 = null;
                }
                smartRouteBuildRoute.withParam("mob_data", new PoiInnerPageMobData("poi_detail", "header_image", str3, collectInfo4, regionCode2, fromGroupId2, initialEnterFrom2, initialEnterMethod2, initialPoiFromGroupId2));
                smartRouteBuildRoute.withParam("source_btm_token", C18JG.LIZ("a4257.b26943.c87042.d0", PageFinder.via(C724240Sb0.LJI(this)), null));
                PoiCommonMobParams poiCommonMobParams = (PoiCommonMobParams) this.LLJJL.getValue();
                if (poiCommonMobParams != null) {
                    smartRouteBuildRoute.withParam("poi_common_mob_params", poiCommonMobParams);
                }
                smartRouteBuildRoute.open();
            }
            C1185430gxB c1185430gxB = C1185430gxB.LIZ;
            String str4 = tp().LL;
            PoiListApi.PoiDetailResponse poiDetailResponse4 = tp().LLILLJJLI;
            if (poiDetailResponse4 != null) {
                collectInfo5 = poiDetailResponse4.getCollectInfo();
            }
            String strLJIIJJI = kp().LJIIJJI();
            String strLJ3 = kp().LJ();
            InterfaceC665370Q7z interfaceC665370Q7zLJIIL = C1558520qew.LJIIL(this);
            PageFinder pageFinder = (PageFinder) this.LLJLIL.getValue();
            c1185430gxB.getClass();
            C1185430gxB.LJIIJJI(str4, collectInfo5, strLJIIJJI, strLJ3, "large_header_image", str, interfaceC665370Q7zLJIIL, pageFinder);
            return;
        }
        PoiListApi.PoiDetailResponse poiDetailResponseIp2 = ip();
        if (poiDetailResponseIp2 != null) {
            pictureAlbum = poiDetailResponseIp2.getPictureAlbum();
        } else {
            pictureAlbum = null;
        }
        Context context2 = getContext();
        if (context2 == null) {
            return;
        }
        if (pictureAlbum != null && (picturesByExperiment = pictureAlbum.getPicturesByExperiment()) != null) {
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(picturesByExperiment, 10));
            Iterator<UrlModel> it2 = picturesByExperiment.iterator();
            while (it2.hasNext()) {
                List<String> urlList2 = it2.next().getUrlList();
                if (urlList2 != null) {
                    objLJJJLL2 = C13LP.LJJJLL(urlList2);
                } else {
                    objLJJJLL2 = null;
                }
                arrayList.add(objLJJJLL2);
            }
            arrayListLIZ = C09HN.LIZ(arrayList);
        } else {
            arrayListLIZ = null;
        }
        if (C1185000gwU.LIZ() && pictureAlbum != null && (list = pictureAlbum.poiPictures) != null) {
            arrayListLIZ2 = C09HN.LIZ(list);
        } else {
            arrayListLIZ2 = null;
        }
        if (arrayListLIZ != null) {
            i = 0;
            int i2 = 0;
            for (Object obj : arrayListLIZ) {
                int i3 = i2 + 1;
                if (i2 >= 0) {
                    if (urlModel != null && (urlList = urlModel.getUrlList()) != null) {
                        objLJJJLL = C13LP.LJJJLL(urlList);
                    } else {
                        objLJJJLL = null;
                    }
                    if (Intrinsics.LJFF(obj, objLJJJLL)) {
                        i = i2;
                    }
                    i2 = i3;
                    collectInfo5 = null;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
        } else {
            i = 0;
        }
        IPoiSlashContextAbility iPoiSlashContextAbility2 = (IPoiSlashContextAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), IPoiSlashContextAbility.class, collectInfo5);
        if (iPoiSlashContextAbility2 != null && (poiCurrentSessionInfoA50 = iPoiSlashContextAbility2.a50()) != null && (strLJ = C2365509Or.LJ(poiCurrentSessionInfoA50)) != null) {
            str2 = strLJ;
        }
        if (arrayListLIZ != null) {
            if (smartImageView != null) {
                int[] iArr = new int[2];
                smartImageView.getLocationOnScreen(iArr);
                arrayListLJ = C1697810uHb.LJ(new PoiGalleryAnchorData(smartImageView.getWidth(), smartImageView.getHeight(), iArr[0], iArr[1], 240));
            } else {
                arrayListLJ = null;
            }
            try {
                c098200Yq = null;
                try {
                    InterfaceC1184330gvP interfaceC1184330gvP2 = (InterfaceC1184330gvP) C1252710ihh.LJI(this, C13LE.LIZ(InterfaceC1184330gvP.class), null);
                    if (interfaceC1184330gvP2 != null) {
                        c098200Yq = interfaceC1184330gvP2.Nf();
                    }
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th2) {
                    th = th2;
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
            } catch (Throwable th3) {
                th = th3;
            }
            if (C189200o6.m7isFailureimpl(c098200Yq)) {
                c098200Yq = null;
            }
            C1185410gx9 c1185410gx93 = (C1185410gx9) c098200Yq;
            InterfaceC1181010gq3 interfaceC1181010gq3LIZIZ = C1178990gmn.LIZIZ(this);
            if (interfaceC1181010gq3LIZIZ != null && (c1173300gdcQr0 = interfaceC1181010gq3LIZIZ.qr0()) != null) {
                c1185600gxS = (C1185600gxS) c1173300gdcQr0.LIZ;
            } else {
                c1185600gxS = null;
            }
            SmartRoute smartRouteBuildRoute2 = SmartRouter.buildRoute(context2, "aweme://poi/gallery/v2");
            smartRouteBuildRoute2.withParam("poi_gallery_images", arrayListLIZ);
            smartRouteBuildRoute2.withParam("poi_picture_infos", arrayListLIZ2);
            smartRouteBuildRoute2.withParam("poi_gallery_index", i);
            PoiListApi.PoiDetailResponse poiDetailResponseIp3 = ip();
            if (poiDetailResponseIp3 != null && (pictureAlbum2 = poiDetailResponseIp3.getPictureAlbum()) != null) {
                numValueOf = Integer.valueOf(pictureAlbum2.totalPictureNum);
            } else {
                numValueOf = null;
            }
            smartRouteBuildRoute2.withParam("image_size", C1175120ggY.LIZJ(numValueOf));
            smartRouteBuildRoute2.withParam("poi_detail_response", ip());
            if (c1185600gxS != null) {
                c1188440h22 = c1185600gxS.LJ;
            } else {
                c1188440h22 = null;
            }
            smartRouteBuildRoute2.withParam("poi_anchor_data", c1188440h22);
            if (c1185600gxS != null) {
                c1185410gx9 = c1185600gxS.LJFF;
            } else {
                c1185410gx9 = null;
            }
            smartRouteBuildRoute2.withParam("poi_detail_params", c1185410gx9);
            if (c1185600gxS != null) {
                c1185490gxH = c1185600gxS.LJI;
            } else {
                c1185490gxH = null;
            }
            smartRouteBuildRoute2.withParam("poi_anchor_mob_data", c1185490gxH);
            if (c1185410gx93 != null) {
                poiId = c1185410gx93.getPoiId();
            } else {
                poiId = null;
            }
            PoiListApi.PoiDetailResponse poiDetailResponseIp4 = ip();
            if (poiDetailResponseIp4 != null) {
                collectInfo = poiDetailResponseIp4.getCollectInfo();
            } else {
                collectInfo = null;
            }
            PoiListApi.PoiDetailResponse poiDetailResponseIp5 = ip();
            if (poiDetailResponseIp5 != null) {
                regionCode = poiDetailResponseIp5.getRegionCode();
            } else {
                regionCode = null;
            }
            if (c1185410gx93 != null) {
                fromGroupId = c1185410gx93.getFromGroupId();
                initialEnterFrom = c1185410gx93.getInitialEnterFrom();
                initialEnterMethod = c1185410gx93.getInitialEnterMethod();
                initialPoiFromGroupId = c1185410gx93.getInitialPoiFromGroupId();
            } else {
                fromGroupId = null;
                initialEnterFrom = null;
                initialEnterMethod = null;
                initialPoiFromGroupId = null;
            }
            smartRouteBuildRoute2.withParam("mob_data", new PoiInnerPageMobData("poi_detail", "header_image", poiId, collectInfo, regionCode, fromGroupId, initialEnterFrom, initialEnterMethod, initialPoiFromGroupId));
            smartRouteBuildRoute2.withParam("current_poi_session_info", str2);
            PoiCommonMobParams poiCommonMobParams2 = (PoiCommonMobParams) this.LLJJL.getValue();
            if (poiCommonMobParams2 != null) {
                smartRouteBuildRoute2.withParam("poi_common_mob_params", poiCommonMobParams2);
            }
            if (arrayListLJ != null) {
                smartRouteBuildRoute2.withParam("poi_gallery_anchor_data", arrayListLJ);
            }
            smartRouteBuildRoute2.withParam("poi_enter_gallery_scene", "large_header_gallery");
            smartRouteBuildRoute2.open();
            C1185430gxB c1185430gxB2 = C1185430gxB.LIZ;
            String str5 = tp().LL;
            PoiListApi.PoiDetailResponse poiDetailResponse5 = tp().LLILLJJLI;
            if (poiDetailResponse5 != null) {
                collectInfo2 = poiDetailResponse5.getCollectInfo();
            } else {
                collectInfo2 = null;
            }
            String strLJIIJJI2 = kp().LJIIJJI();
            String strLJ4 = kp().LJ();
            InterfaceC665370Q7z interfaceC665370Q7zLJIIL2 = C1558520qew.LJIIL(this);
            PageFinder pageFinder2 = (PageFinder) this.LLJLIL.getValue();
            c1185430gxB2.getClass();
            C1185430gxB.LJIIJJI(str5, collectInfo2, strLJIIJJI2, strLJ4, "large_header_image", str, interfaceC665370Q7zLJIIL2, pageFinder2);
        }
    }
}
