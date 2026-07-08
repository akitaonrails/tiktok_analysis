package com.ss.android.ugc.aweme.poi.detail.container.background;

import X.C019F;
import X.C1180060goW;
import X.C1180560gpK;
import X.C1180580gpM;
import X.C1180600gpO;
import X.C1189060h32;
import X.C1189360h3W;
import X.C1202680hP0;
import X.C13LE;
import X.C13LP;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C418440Gaw;
import X.C438710HIf;
import X.C724750Sbp;
import X.C814420VxA;
import X.EnumC1177490gkN;
import X.EnumC1181950grZ;
import X.InterfaceC2217461Bqa;
import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.animation.LinearInterpolator;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.poi.detail.container.PoiDetailInfoViewModel;
import com.ss.android.ugc.aweme.poi.detail.container.PoiListApi;
import com.ss.android.ugc.aweme.poi.detail.container.newarchi.abilities.ContainerEventDispatcher$IPoiDetailSpringScrollAbility;
import com.ss.android.ugc.aweme.poi.detail.container.newarchi.abilities.ContainerEventDispatcher$PageScrollCallBackAbility;
import com.ss.android.ugc.aweme.poi.detail.container.slash.component.PoiDetailBaseUiSlotComponent;
import com.ss.android.ugc.aweme.slash.component.BaseComponentData;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS562S0100000_18;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiHeaderImageAssemV2 extends PoiDetailBaseUiSlotComponent<PoiHeaderImgModule> implements ContainerEventDispatcher$IPoiDetailSpringScrollAbility, ContainerEventDispatcher$PageScrollCallBackAbility {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJL;
    public static final int LLJJLIIIJLLLLLLLZ;
    public final AssemVMLazy LLJJIJI;
    public SmartImageView LLJJIJIIJIL;
    public View LLJJIJIL;
    public View LLJJJ;
    public Animator LLJJJIL;
    public Animator LLJJJJ;
    public int LLJJJJJIL;
    public int LLJJJJLIIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PoiHeaderImageAssemV2.class, "poiDetailHeaderVm", "getPoiDetailHeaderVm()Lcom/ss/android/ugc/aweme/poi/detail/container/PoiDetailInfoViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJL = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLJJLIIIJLLLLLLLZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(223));
        C814420VxA.LIZIZ(C418440Gaw.LIZIZ(188));
    }

    public PoiHeaderImageAssemV2() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PoiDetailInfoViewModel.class);
        this.LLJJIJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS562S0100000_18(c19719912DlLIZ, 1067), AFwS256S0000000_18.get$arr$(368), null, true);
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.e0_;
    }

    @Override // com.ss.android.ugc.aweme.poi.detail.container.slash.component.PoiDetailBaseUiSlotComponent
    public final boolean mp() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.poi.detail.container.slash.component.PoiDetailBaseUiSlotComponent
    public final void op(PoiListApi.PoiDetailResponse poiDetailResponse) {
    }

    @Override // com.ss.android.ugc.aweme.poi.detail.container.newarchi.abilities.ContainerEventDispatcher$PageScrollCallBackAbility
    public final void oq(int i) {
    }

    @Override // com.ss.android.ugc.aweme.slash.component.BaseSlashSlotAssemComponent, com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        AssemVMLazy assemVMLazy = this.LLJJIJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJL;
        ((PoiDetailInfoViewModel) assemVMLazy.getValue()).vQ2(EnumC1181950grZ.IMAGE_HEADER_V2);
    }

    @Override // com.ss.android.ugc.aweme.slash.component.BaseSlashSlotAssemComponent, X.InterfaceC1173970geh
    public final void CG1(BaseComponentData baseComponentData) {
        CoverImg coverImg;
        List<String> list;
        PoiHeaderImgModule poiHeaderImgModule = (PoiHeaderImgModule) baseComponentData;
        super.CG1(poiHeaderImgModule);
        String str = null;
        C1180600gpO c1180600gpO = new C1180600gpO("poi_detail", "poi_header_cover_image", new C1180560gpK(getContext(), EnumC1177490gkN.FALLBACK_32_PX, new C1180580gpM(Float.valueOf(0.0f)), null));
        AssemVMLazy assemVMLazy = this.LLJJIJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJL;
        c1180600gpO.LIZLLL = new C1202680hP0(((PoiDetailInfoViewModel) assemVMLazy.getValue()).LL, null, null, null, null, 30);
        if (poiHeaderImgModule != null && (coverImg = poiHeaderImgModule.getCoverImg()) != null && (list = coverImg.urlList) != null) {
            str = (String) C13LP.LJJJLL(list);
        }
        C1189360h3W c1189360h3WLIZ = c1180600gpO.LIZ(C438710HIf.LIZJ(str));
        c1189360h3WLIZ.LIZ.LIZLLL("poi_header_cover_image");
        c1189360h3WLIZ.LIZLLL(this.LLJJIJIIJIL);
        c1189360h3WLIZ.LIZIZ();
    }

    @Override // com.ss.android.ugc.aweme.poi.detail.container.newarchi.abilities.ContainerEventDispatcher$IPoiDetailSpringScrollAbility
    public final void a3(int i) {
        if (this.LLJJJJLIIL != i) {
            this.LLJJJJLIIL = i;
            SmartImageView smartImageView = this.LLJJIJIIJIL;
            if (smartImageView != null) {
                C1180060goW.LJIIIZ(LLJJLIIIJLLLLLLLZ + Math.abs(i), smartImageView);
            }
            View view = this.LLJJIJIL;
            if (view != null) {
                C1189060h32.LJJII(view, null, Integer.valueOf((LLJJLIIIJLLLLLLLZ - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(90))) + Math.abs(i)), null, null);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.poi.detail.container.newarchi.abilities.ContainerEventDispatcher$PageScrollCallBackAbility
    public final void bq(int i) {
        Animator animator;
        Animator animator2;
        Animator animator3;
        if (i < this.LLJJJJJIL || getContentView().getAlpha() <= 0.0f || ((animator2 = this.LLJJJJ) != null && animator2.isStarted())) {
            if (i <= this.LLJJJJJIL && getContentView().getAlpha() < 1.0f) {
                Animator animator4 = this.LLJJJIL;
                if (animator4 != null && animator4.isStarted()) {
                    return;
                }
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(getContentView(), "alpha", 0.0f, 1.0f);
                objectAnimatorOfFloat.setDuration(200L);
                objectAnimatorOfFloat.setInterpolator(new LinearInterpolator());
                this.LLJJJIL = objectAnimatorOfFloat;
                objectAnimatorOfFloat.start();
                Animator animator5 = this.LLJJJJ;
                if (animator5 == null || !animator5.isStarted() || (animator = this.LLJJJJ) == null) {
                    return;
                }
                animator.cancel();
                return;
            }
            return;
        }
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(getContentView(), "alpha", 1.0f, 0.0f);
        objectAnimatorOfFloat2.setDuration(200L);
        objectAnimatorOfFloat2.setInterpolator(new LinearInterpolator());
        this.LLJJJJ = objectAnimatorOfFloat2;
        objectAnimatorOfFloat2.start();
        Animator animator6 = this.LLJJJIL;
        if (animator6 == null || !animator6.isStarted() || (animator3 = this.LLJJJIL) == null) {
            return;
        }
        animator3.cancel();
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to com.ss.android.ugc.aweme.poi.detail.container.background.PoiHeaderImageAssemV2 for r10v4 'this'  java.lang.Object
        	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
        	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
        	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // com.ss.android.ugc.aweme.poi.detail.container.slash.component.PoiDetailBaseUiSlotComponent, com.ss.android.ugc.aweme.slash.component.BaseSlashSlotAssemComponent, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(android.view.View r11) {
        /*
            Method dump skipped, instruction units count: 368
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.detail.container.background.PoiHeaderImageAssemV2.onViewCreated(android.view.View):void");
    }
}
