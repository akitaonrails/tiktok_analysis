package com.ss.android.ugc.aweme.im.creative.edit.impl.editor;

import X.AbstractC738140SxQ;
import X.C01GW;
import X.C03IJ;
import X.C09R3;
import X.C0QSJ;
import X.C127G;
import X.C13LE;
import X.C1452400ntm;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2174131A6x;
import X.C2217381BqS;
import X.C2298208zU;
import X.C296250BjL;
import X.C452501pT;
import X.C687700QyG;
import X.C724750Sbp;
import X.EnumC20228214Cy;
import X.InterfaceC1146704e9;
import X.InterfaceC1660990tKD;
import X.InterfaceC2217461Bqa;
import X.InterfaceC570310MYj;
import X.InterfaceC665370Q7z;
import X.InterfaceSurfaceHolderCallbackC2173441A4g;
import X.InterfaceTextureViewSurfaceTextureListenerC2173451A4h;
import Y.AObjectS407S0100000_33;
import android.net.Uri;
import android.view.SurfaceView;
import android.view.TextureView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.im.creative.common.api.model.data.IMCreativeEditModel;
import com.ss.android.ugc.aweme.im.creative.edit.impl.ui.IMEditPageScope;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS279S0000000_33;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS577S0100000_33;

/* JADX INFO: loaded from: classes34.dex */
public final class IMEditorAssem extends AbstractC738140SxQ implements InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLIZ;
    public final C01GW LL = C452501pT.LIZIZ(new AwS577S0100000_33(this, 2395));
    public final AssemVMLazy LLILLJJLI;
    public volatile C2174131A6x LLILLL;
    public C127G LLILZ;
    public InterfaceC665370Q7z LLILZIL;
    public C0QSJ LLILZLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(IMEditorAssem.class, "featureGraph", "getFeatureGraph()Lcom/ss/android/ugc/aweme/im/creative/edit/impl/di/IMEditFeatureGraph;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(IMEditorAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/im/creative/edit/impl/editor/IMEditorVM;", 0);
        c09r3.getClass();
        LLIZ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    public IMEditorAssem() {
        C03IJ c03ij = C03IJ.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(IMEditorVM.class);
        this.LLILLJJLI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c03ij, C1637806bA.LIZ, new AwS563S0100000_19(c19719912DlLIZ, 1494), AFwS279S0000000_33.get$arr$(162), null, true);
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{IMEditPageScope.class});
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(IMEditPageScope.class);
        return arrayList;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onPause_isOnPauseEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onResume_isOnResumeEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    public final C2174131A6x bo() throws IllegalAccessException {
        C0QSJ c0qsjLIZLLL = this.LLILZLL;
        if (c0qsjLIZLLL == null) {
            InterfaceC665370Q7z interfaceC665370Q7zLJIIIZ = this.LLILZIL;
            if (interfaceC665370Q7zLJIIIZ == null) {
                interfaceC665370Q7zLJIIIZ = C687700QyG.LJIIIZ(this);
                this.LLILZIL = interfaceC665370Q7zLJIIIZ;
            }
            c0qsjLIZLLL = C687700QyG.LIZLLL(interfaceC665370Q7zLJIIIZ, new Class[]{IMEditPageScope.class});
            this.LLILZLL = c0qsjLIZLLL;
            if (c0qsjLIZLLL == null) {
                return null;
            }
        }
        C2174131A6x c2174131A6x = (C2174131A6x) c0qsjLIZLLL.getAbility(C2174131A6x.class);
        C687700QyG.LJ(c2174131A6x, C2174131A6x.class);
        return c2174131A6x;
    }

    /* JADX INFO: renamed from: do, reason: not valid java name */
    public final IMEditorVM m233do() {
        AssemVMLazy assemVMLazy = this.LLILLJJLI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLIZ;
        return (IMEditorVM) assemVMLazy.getValue();
    }

    @Override // X.AbstractC738140SxQ, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        ViewModelProvider.Factory defaultViewModelProviderFactory = super.getDefaultViewModelProviderFactory();
        C127G c127g = this.LLILZ;
        if (c127g == null) {
            synchronized (this) {
                c127g = this.LLILZ;
                if (c127g == null) {
                    C127G c127g2 = new C127G(new Object[]{IMEditorVM.class, new AObjectS407S0100000_33(this, 0)}, defaultViewModelProviderFactory);
                    this.LLILZ = c127g2;
                    return c127g2;
                }
            }
        }
        return c127g;
    }

    @Override // X.AbstractC738140SxQ
    public final void onCreate() {
        LifecycleOwner lifecycleOwnerM233do;
        Fragment fragment;
        super.onCreate();
        if (C296250BjL.LIZ()) {
            LifecycleOwner parent = getParent();
            if (!(parent instanceof Fragment) || (fragment = (Fragment) parent) == null || (lifecycleOwnerM233do = fragment.getViewLifecycleOwner()) == null) {
                lifecycleOwnerM233do = this;
            }
        } else {
            lifecycleOwnerM233do = m233do();
        }
        IMEditorVM iMEditorVMM233do = m233do();
        String strLIZLLL = C2298208zU.LIZLLL((InterfaceC570310MYj) iMEditorVMM233do.LLILLJJLI.getValue(), new CreativeInfo(iMEditorVMM233do.LL.creationId, 0, null, 6, null), EnumC20228214Cy.VE_PREVIEW_WORKSPACE, null, false, 12);
        if (iMEditorVMM233do.LL.LIZIZ()) {
            TextureView textureViewLJIJJLI = ((InterfaceTextureViewSurfaceTextureListenerC2173451A4h) iMEditorVMM233do.LLILZ.getValue()).LJIJJLI();
            if (textureViewLJIJJLI == null) {
                throw new IllegalArgumentException("null surface view");
            }
            ((InterfaceTextureViewSurfaceTextureListenerC2173451A4h) iMEditorVMM233do.LLILZ.getValue()).a0();
            InterfaceC1660990tKD interfaceC1660990tKDVQ2 = iMEditorVMM233do.vQ2();
            IMCreativeEditModel iMCreativeEditModel = iMEditorVMM233do.LL;
            Uri uri = iMCreativeEditModel.originUri;
            if (uri == null) {
                throw new IllegalArgumentException("null uri");
            }
            interfaceC1660990tKDVQ2.LJIIIZ(new C1452400ntm(uri, strLIZLLL, iMCreativeEditModel.creationId, iMCreativeEditModel.isImage), textureViewLJIJJLI);
            ((InterfaceTextureViewSurfaceTextureListenerC2173451A4h) iMEditorVMM233do.LLILZ.getValue()).LLZZJLIL(iMEditorVMM233do);
            return;
        }
        SurfaceView surfaceViewLJIJJLI = ((InterfaceSurfaceHolderCallbackC2173441A4g) iMEditorVMM233do.LLILLL.getValue()).LJIJJLI();
        if (surfaceViewLJIJJLI == null) {
            throw new IllegalArgumentException("null surface view");
        }
        ((InterfaceSurfaceHolderCallbackC2173441A4g) iMEditorVMM233do.LLILLL.getValue()).a0();
        InterfaceC1660990tKD interfaceC1660990tKDVQ22 = iMEditorVMM233do.vQ2();
        IMCreativeEditModel iMCreativeEditModel2 = iMEditorVMM233do.LL;
        Uri uri2 = iMCreativeEditModel2.originUri;
        if (uri2 == null) {
            throw new IllegalArgumentException("null uri");
        }
        interfaceC1660990tKDVQ22.LJFF(new C1452400ntm(uri2, strLIZLLL, iMCreativeEditModel2.creationId, iMCreativeEditModel2.isImage), surfaceViewLJIJJLI, lifecycleOwnerM233do);
        ((InterfaceSurfaceHolderCallbackC2173441A4g) iMEditorVMM233do.LLILLL.getValue()).LLZZJLIL(iMEditorVMM233do);
    }

    @Override // X.AbstractC738140SxQ
    public final void onDestroy() {
        m233do().vQ2().LIZJ();
        super.onDestroy();
    }

    @Override // X.AbstractC738140SxQ
    public final void onPause() {
        m233do().vQ2().LJIIIIZZ();
        super.onPause();
    }

    @Override // X.AbstractC738140SxQ
    public final void onResume() {
        super.onResume();
        m233do().vQ2().LJ();
    }
}
