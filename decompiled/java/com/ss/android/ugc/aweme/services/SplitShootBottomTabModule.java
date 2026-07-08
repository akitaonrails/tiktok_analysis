package com.ss.android.ugc.aweme.services;

import X.AbstractC1653180t7c;
import X.C09R3;
import X.C13LE;
import X.C1646490swp;
import X.C1653300t7o;
import X.C1653330t7r;
import X.C1664770tQJ;
import X.C1DRG;
import X.C2217381BqS;
import X.C385670FAf;
import X.C579080MnS;
import X.EnumC569740MWe;
import X.InterfaceC1638550sk1;
import X.InterfaceC1648570t0B;
import X.InterfaceC1652190t61;
import X.InterfaceC1653190t7d;
import X.InterfaceC1653360t7u;
import X.InterfaceC1731706qJ;
import X.InterfaceC2217461Bqa;
import X.InterfaceC379610EuV;
import a6n.a;
import androidx.lifecycle.ViewModelProvider;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.record.RecordMobModel;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel;
import com.ss.android.ugc.aweme.shortvideo.d4;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes26.dex */
public final class SplitShootBottomTabModule implements InterfaceC1653190t7d, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] $$delegatedProperties;
    public final boolean defaultSelected;
    public final C1DRG diContainer;
    public final String shootMode;
    public final String tag;
    public final String text;
    public final InterfaceC1731706qJ splitShootApiComponent$delegate = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1638550sk1.class, null);
    public final InterfaceC1731706qJ recordControlApi$delegate = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1648570t0B.class, null);
    public final InterfaceC1731706qJ permissionComponent$delegate = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1652190t61.class, null);

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SplitShootBottomTabModule.class, "splitShootApiComponent", "getSplitShootApiComponent()Lcom/ss/android/ugc/gamora/recorder/splitshoot/SplitShootApiComponent;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(SplitShootBottomTabModule.class, "recordControlApi", "getRecordControlApi()Lcom/bytedance/creativex/recorder/camera/api/RecordControlApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(SplitShootBottomTabModule.class, "permissionComponent", "getPermissionComponent()Lcom/ss/android/ugc/aweme/shortvideo/ui/permissionmanager/RecordPermissionUIApiComponent;", 0);
        c09r3.getClass();
        $$delegatedProperties = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3};
    }

    @Override // X.InterfaceC1653190t7d
    public boolean enable() {
        return true;
    }

    @Override // X.InterfaceC1653190t7d
    public void initialize(a aVar) {
    }

    @Override // X.InterfaceC1653190t7d
    public AbstractC1653180t7c provideScene() {
        return null;
    }

    public final InterfaceC1652190t61 getPermissionComponent() {
        return (InterfaceC1652190t61) this.permissionComponent$delegate.getValue(this, $$delegatedProperties[2]);
    }

    public final InterfaceC1648570t0B getRecordControlApi() {
        return (InterfaceC1648570t0B) this.recordControlApi$delegate.getValue(this, $$delegatedProperties[1]);
    }

    public final InterfaceC1638550sk1 getSplitShootApiComponent() {
        return (InterfaceC1638550sk1) this.splitShootApiComponent$delegate.getValue(this, $$delegatedProperties[0]);
    }

    public final ShortVideoContext getShortVideoContext() {
        return ((ShortVideoContextViewModel) ((ViewModelProvider) getDiContainer().LJII(ViewModelProvider.class, null)).get(ShortVideoContextViewModel.class)).LL;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.diContainer;
    }

    @Override // X.InterfaceC1653190t7d
    public C1653330t7r createBottomTabItem(final a aVar) {
        return new C1653330t7r(this.text, this.tag, this.shootMode, this.defaultSelected, new InterfaceC1653360t7u() { // from class: com.ss.android.ugc.aweme.services.SplitShootBottomTabModule.createBottomTabItem.1
            @Override // X.InterfaceC1653360t7u
            public void onCelebrationStyleApplied(String str) {
            }

            private final void resetCameraFirstFrameAnchorIfFromCreateTab(Object obj, Object obj2) {
                ShortVideoContext shortVideoContextLIZLLL = aVar.LIZLLL();
                if (d4.LJJIIJ(shortVideoContextLIZLLL)) {
                    CreativeModel creativeModel = shortVideoContextLIZLLL.creativeModel;
                    if (creativeModel.landingModel.defaultLandingCreateTab) {
                        RecordMobModel recordMobModel = creativeModel.recordMobModel;
                        if (Intrinsics.LJFF(obj, SplitShootBottomTabModule.this.tag) && recordMobModel.recordFromTab == EnumC569740MWe.DEFAULT.getTab()) {
                            recordMobModel.startRecordTime = System.currentTimeMillis();
                            recordMobModel.recordFromTab = EnumC569740MWe.CREATE_TAB.getTab();
                        }
                    }
                }
            }

            @Override // X.InterfaceC1653360t7u
            public boolean onTabSelected(C1653330t7r c1653330t7r, C1646490swp c1646490swp) {
                C385670FAf<Boolean> c385670FAfL00;
                InterfaceC1652190t61 permissionComponent;
                InterfaceC1638550sk1 splitShootApiComponent;
                SplitShootBottomTabModule.this.getRecordControlApi().va0(C579080MnS.class);
                if (!SplitShootBottomTabModule.this.getShortVideoContext().isDuetMode && c1646490swp.LIZLLL && (splitShootApiComponent = SplitShootBottomTabModule.this.getSplitShootApiComponent()) != null) {
                    splitShootApiComponent.JN0(true);
                }
                InterfaceC1638550sk1 splitShootApiComponent2 = SplitShootBottomTabModule.this.getSplitShootApiComponent();
                if (splitShootApiComponent2 != null) {
                    splitShootApiComponent2.yf(c1646490swp);
                }
                InterfaceC1652190t61 permissionComponent2 = SplitShootBottomTabModule.this.getPermissionComponent();
                if (permissionComponent2 != null && (c385670FAfL00 = permissionComponent2.L00()) != null && Intrinsics.LJFF(c385670FAfL00.LIZJ(), Boolean.TRUE) && (permissionComponent = SplitShootBottomTabModule.this.getPermissionComponent()) != null) {
                    permissionComponent.tu2();
                }
                return true;
            }

            @Override // X.InterfaceC1653360t7u
            public boolean onTabUnselected(C1653330t7r c1653330t7r, C1646490swp c1646490swp) {
                InterfaceC1638550sk1 splitShootApiComponent = SplitShootBottomTabModule.this.getSplitShootApiComponent();
                if (splitShootApiComponent != null) {
                    splitShootApiComponent.m5(c1646490swp);
                }
                InterfaceC1638550sk1 splitShootApiComponent2 = SplitShootBottomTabModule.this.getSplitShootApiComponent();
                if (splitShootApiComponent2 != null) {
                    splitShootApiComponent2.JN0(false);
                }
                return false;
            }

            @Override // X.InterfaceC1653360t7u
            public void onTabChanged(Object obj, Object obj2, C1653300t7o c1653300t7o) {
                resetCameraFirstFrameAnchorIfFromCreateTab(obj, obj2);
            }
        }, null, false, null, null, 480);
    }

    public SplitShootBottomTabModule(String str, String str2, String str3, C1DRG c1drg, boolean z) {
        this.text = str;
        this.tag = str2;
        this.shootMode = str3;
        this.diContainer = c1drg;
        this.defaultSelected = z;
    }
}
