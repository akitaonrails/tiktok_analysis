package com.ss.android.ugc.aweme.tools.live.sticker;

import X.C0APK;
import X.C0EBE;
import X.C13BV;
import X.C13RH;
import X.C1437860nWK;
import X.C1445850njD;
import X.C15438062q;
import X.C1624010sMZ;
import X.C1625240sOY;
import X.C1631210sYB;
import X.C1631240sYE;
import X.C1635820sfc;
import X.C1637900siy;
import X.C1637910siz;
import X.C1637920sj0;
import X.C1660670tJh;
import X.C19F0;
import X.C19GS;
import X.C20622515mp;
import X.C21360518iZ;
import X.C21366718jZ;
import X.C2347809Hw;
import X.C294080Bfq;
import X.C535690Kzf;
import X.C786410Ut5;
import X.InterfaceC1159800gHq;
import X.InterfaceC1456340o08;
import X.InterfaceC1623190sLF;
import X.InterfaceC1625290sOd;
import X.InterfaceC1625520sP0;
import X.InterfaceC1628180sTI;
import X.InterfaceC1630220sWa;
import X.InterfaceC1635660sfM;
import X.InterfaceC1637930sj1;
import X.InterfaceC1637950sj3;
import X.InterfaceC1637960sj4;
import X.InterfaceC20597015ii;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import com.bef.effectsdk.EffectSDKBuildConfig;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.framework.services.IStickerService;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.sticker.IStickerViewService;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes26.dex */
public class StickerViewServiceImpl implements IStickerViewService {
    public C1637900siy liveGalleryModule;
    public C1625240sOY liveStickerModule;
    public InterfaceC1456340o08<InterfaceC1625290sOd> processorSupplier;
    public InterfaceC1637960sj4 stickerMobHelper;

    @Override // com.ss.android.ugc.aweme.sticker.IStickerViewService
    public void hideStickerView() {
        InterfaceC1623190sLF interfaceC1623190sLFU;
        C1625240sOY c1625240sOY = this.liveStickerModule;
        if (c1625240sOY == null || (interfaceC1623190sLFU = c1625240sOY.U()) == null) {
            return;
        }
        interfaceC1623190sLFU.hide();
    }

    @Override // com.ss.android.ugc.aweme.sticker.IStickerViewService
    public boolean isGalleryModuleInitialized() {
        return this.liveGalleryModule != null;
    }

    @Override // com.ss.android.ugc.aweme.sticker.IStickerViewService
    public boolean isShowStickerView() {
        C1625240sOY c1625240sOY = this.liveStickerModule;
        return c1625240sOY != null && C1624010sMZ.LIZJ(c1625240sOY);
    }

    @Override // com.ss.android.ugc.aweme.sticker.IStickerViewService
    public void release() {
        C1625240sOY c1625240sOY = this.liveStickerModule;
        if (c1625240sOY != null) {
            c1625240sOY.LJFF();
            this.liveStickerModule = null;
        }
    }

    @Override // com.ss.android.ugc.aweme.sticker.IStickerViewService
    public void releaseGalleryModule() {
        C1637900siy c1637900siy = this.liveGalleryModule;
        if (c1637900siy != null) {
            c1637900siy.LIZLLL.clear();
            if (((Boolean) C0APK.LIZ.getValue()).booleanValue()) {
                C21360518iZ c21360518iZ = c1637900siy.LIZJ;
                if (c21360518iZ != null) {
                    c21360518iZ.LIZ();
                }
            } else {
                ((C21360518iZ) c1637900siy.LIZIZ.getValue()).LIZ();
            }
        }
        this.liveGalleryModule = null;
    }

    @Override // com.ss.android.ugc.aweme.sticker.IStickerViewService
    public void scanPhotoList() {
        C1637900siy c1637900siy = this.liveGalleryModule;
        if (c1637900siy != null) {
            if (!((Boolean) C0APK.LIZ.getValue()).booleanValue()) {
                ((C21360518iZ) c1637900siy.LIZIZ.getValue()).LIZIZ();
                return;
            }
            if (c1637900siy.LIZJ == null) {
                C21360518iZ c21360518iZ = new C21360518iZ(new C21366718jZ(), c1637900siy.LIZ, 50, null, false);
                c21360518iZ.LJIIIIZZ = new C1637910siz(c1637900siy);
                c1637900siy.LIZJ = c21360518iZ;
            }
            C21360518iZ c21360518iZ2 = c1637900siy.LIZJ;
            if (c21360518iZ2 != null) {
                c21360518iZ2.LIZIZ();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0093 A[PHI: r1
      0x0093: PHI (r1v20 X.0KiL) = (r1v12 X.0KiL), (r1v14 X.0KiL), (r1v15 X.0KiL), (r1v22 X.0KiL) binds: [B:34:0x0091, B:23:0x0077, B:19:0x006d, B:10:0x0057] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.ss.android.ugc.aweme.sticker.IStickerViewService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void selectFromGallery() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 202
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tools.live.sticker.StickerViewServiceImpl.selectFromGallery():void");
    }

    @Override // com.ss.android.ugc.aweme.sticker.IStickerViewService
    public String getEPVersion() {
        return C13RH.LIZJ();
    }

    @Override // com.ss.android.ugc.aweme.sticker.IStickerViewService
    public String getEffectSdkVersion() {
        return EffectSDKBuildConfig.getSdkVersion();
    }

    @Override // com.ss.android.ugc.aweme.sticker.IStickerViewService
    public String getEPAccessKey() {
        return "142710f02c3a11e8b42429f14557854a";
    }

    @Override // com.ss.android.ugc.aweme.sticker.IStickerViewService
    public List<String> handleGalleryResult(Intent intent) {
        this.liveGalleryModule.getClass();
        if (intent == null) {
            return C13BV.INSTANCE;
        }
        ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("key_choose_media_data");
        if (parcelableArrayListExtra != null) {
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(parcelableArrayListExtra, 10));
            Iterator it2 = parcelableArrayListExtra.iterator();
            while (it2.hasNext()) {
                arrayList.add(((MediaModel) it2.next()).LJFF());
            }
            return arrayList;
        }
        return C13BV.INSTANCE;
    }

    @Override // com.ss.android.ugc.aweme.sticker.IStickerViewService
    public void removeScanPhotoListListener(InterfaceC1637930sj1 interfaceC1637930sj1) {
        C1637900siy c1637900siy = this.liveGalleryModule;
        if (c1637900siy != null) {
            c1637900siy.LIZLLL.remove(interfaceC1637930sj1);
        }
    }

    @Override // com.ss.android.ugc.aweme.sticker.IStickerViewService
    public void selectFromGalleryByLauncher(C19F0<Intent> c19f0) {
        C1637900siy c1637900siy;
        if (c19f0 != null && (c1637900siy = this.liveGalleryModule) != null) {
            Bundle bundle = new Bundle();
            bundle.putInt("key_choose_scene", 3);
            bundle.putInt("key_photo_select_min_count", 1);
            bundle.putInt("key_photo_select_max_count", 1);
            bundle.putInt("upload_photo_min_height", 480);
            bundle.putInt("upload_photo_min_width", 360);
            bundle.putInt("key_support_flag", 1);
            c19f0.LIZ(C1660670tJh.LIZ().LIZIZ(c1637900siy.LIZ, bundle, 10001));
        }
    }

    @Override // com.ss.android.ugc.aweme.sticker.IStickerViewService
    public void setPixelLoopStickerPresenterSupplier(InterfaceC1456340o08<InterfaceC1625290sOd> interfaceC1456340o08) {
        this.processorSupplier = interfaceC1456340o08;
        if (this.liveStickerModule != null) {
            this.liveStickerModule.LJ(interfaceC1456340o08);
        }
    }

    public void setStickerMobHelper(InterfaceC1637960sj4 interfaceC1637960sj4) {
        C1625240sOY c1625240sOY = this.liveStickerModule;
        if (c1625240sOY != null) {
            c1625240sOY.LLJL.getClass();
        }
    }

    private void initLiveModuleIfNeeded(C19GS c19gs, String str) {
        C1625240sOY c1625240sOY = this.liveStickerModule;
        Effect effectLLILIL = null;
        if (c1625240sOY == null || c1625240sOY.LLJJI != c19gs || !c1625240sOY.LLJJIII.equals(str)) {
            C1625240sOY c1625240sOY2 = this.liveStickerModule;
            if (c1625240sOY2 != null) {
                effectLLILIL = c1625240sOY2.LLJJIJIL.LLILIL();
                this.liveStickerModule.LJFF();
            }
            this.liveStickerModule = new C1625240sOY(c19gs, str);
            if (effectLLILIL != null && this.liveStickerModule.LLJJIJIL.getStickerRepository().LJI().LIZ(effectLLILIL)) {
                this.liveStickerModule.LLJJIJIL.LJII().LJIJJ(effectLLILIL);
            }
        }
        if (this.processorSupplier != null) {
            this.liveStickerModule.LJ(this.processorSupplier);
        }
    }

    @Override // com.ss.android.ugc.aweme.sticker.IStickerViewService
    public void initGalleryModule(Activity activity, InterfaceC1637930sj1 interfaceC1637930sj1) {
        if (this.liveGalleryModule == null) {
            this.liveGalleryModule = new C1637900siy(activity);
        }
        this.liveGalleryModule.LIZLLL.add(interfaceC1637930sj1);
    }

    @Override // com.ss.android.ugc.aweme.sticker.IStickerViewService
    public void resizePhoto(String str, String str2) {
        C1637900siy c1637900siy = this.liveGalleryModule;
        if (c1637900siy != null) {
            c1637900siy.getClass();
            C2347809Hw.LJ(str2, C2347809Hw.LIZIZ(C1445850njD.LIZ), null, C786410Ut5.L3(c1637900siy.LIZ), new C1637920sj0(c1637900siy, str, str2));
        }
    }

    public void showStickerView(C19GS c19gs, String str, FrameLayout frameLayout, InterfaceC1637950sj3 interfaceC1637950sj3) {
        FragmentManager supportFragmentManager;
        Scene sceneLIZ;
        InterfaceC20597015ii interfaceC20597015iiLJIIIIZZ;
        if (!C294080Bfq.LIZ() || frameLayout == null || (sceneLIZ = C0EBE.LIZ(frameLayout)) == null || (interfaceC20597015iiLJIIIIZZ = C20622515mp.LJIIIIZZ(sceneLIZ)) == null || (supportFragmentManager = interfaceC20597015iiLJIIIIZZ.getSupportFragmentManager()) == null) {
            supportFragmentManager = c19gs.getSupportFragmentManager();
        }
        showStickerView(c19gs, supportFragmentManager, str, frameLayout, interfaceC1637950sj3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [X.0sPR] */
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
    public void showStickerView(C19GS c19gs, FragmentManager fragmentManager, String str, FrameLayout frameLayout, InterfaceC1637950sj3 interfaceC1637950sj3) {
        initLiveModuleIfNeeded(c19gs, str);
        final C1625240sOY c1625240sOY = this.liveStickerModule;
        if (c1625240sOY != null) {
            if (c1625240sOY.LLJI == null || !Intrinsics.LJFF(c1625240sOY.LLJJJJLIIL, frameLayout) || !Intrinsics.LJFF(c1625240sOY.LLJJL, fragmentManager)) {
                c1625240sOY.LLJJL = fragmentManager;
                c1625240sOY.LLJJJJLIIL = frameLayout;
                C1631210sYB c1631210sYBLIZIZ = C1437860nWK.LIZIZ((C1635820sfc) c1625240sOY.LLJLILLLLZIIL.getValue(), c1625240sOY.LLJJIJIL, c1625240sOY.LLJJJIL, c1625240sOY.LLJJIJI.getValue(), c1625240sOY.LLJL, c1625240sOY.LLJLIL);
                C19GS c19gs2 = c1625240sOY.LLJJI;
                LifecycleOwner lifecycleOwnerLIZ = C535690Kzf.LIZ(frameLayout);
                if (lifecycleOwnerLIZ == null) {
                    lifecycleOwnerLIZ = c1625240sOY.LLJJI;
                }
                C1631240sYE c1631240sYELIZ = c1631210sYBLIZIZ.LIZ(c19gs2, frameLayout, lifecycleOwnerLIZ, fragmentManager);
                c1625240sOY.LLJLIL.LJII(InterfaceC1635660sfM.class, null);
                c1625240sOY.LLJLIL.LJII(InterfaceC1628180sTI.class, null);
                c1625240sOY.LLJLIL.LJII(InterfaceC1630220sWa.class, null);
                c1631240sYELIZ.Bo(new InterfaceC1159800gHq() { // from class: X.0sPV
                    @Override // X.InterfaceC1159800gHq
                    public final void LJI() {
                    }

                    @Override // X.InterfaceC1159800gHq
                    public final void LJIIIZ(View view) {
                    }

                    {
                        C0CHQ.LIZ().getUiService().getClass();
                    }

                    @Override // X.InterfaceC1159800gHq
                    public final void LIZLLL(EnumC1155090gAF enumC1155090gAF) {
                        if (enumC1155090gAF == EnumC1155090gAF.BEFORE_ANIMATE) {
                            if (c1625240sOY.LLJJJJ && c1625240sOY.LLJJIJIL.LLILIL() != null && !Intrinsics.LJFF(c1625240sOY.LLJJIJIL.LLILIL(), c1625240sOY.LLJJJJJIL)) {
                                c1625240sOY.LLJJJJ = false;
                                C1625240sOY c1625240sOY2 = c1625240sOY;
                                c1625240sOY2.LLJJJJJIL = c1625240sOY2.LLJJIJIL.LLILIL();
                                Effect effectLLILIL = c1625240sOY.LLJJIJIL.LLILIL();
                                if (effectLLILIL != null) {
                                    C202008142k.LIZIZ(effectLLILIL);
                                }
                            }
                            if (!Intrinsics.LJFF("livestreaming", c1625240sOY.LLJJIII)) {
                                return;
                            }
                            a0.LJJIIZI(c1625240sOY.LLJJI.getClass().getName(), "SAAActivity", false);
                        }
                    }

                    @Override // X.InterfaceC1159800gHq
                    public final void LJIIZILJ(EnumC1155090gAF enumC1155090gAF) {
                        if (enumC1155090gAF != EnumC1155090gAF.AFTER_ANIMATE || !Intrinsics.LJFF("livestreaming", c1625240sOY.LLJJIII)) {
                            return;
                        }
                        a0.LJJIIZI(c1625240sOY.LLJJI.getClass().getName(), "SAAActivity", false);
                    }
                });
                c1631240sYELIZ.wk(new Observer() { // from class: X.07Zs
                    @Override // androidx.lifecycle.Observer
                    public final /* bridge */ /* synthetic */ void onChanged(Object obj) {
                    }
                });
                c1631240sYELIZ.LJ(new InterfaceC1625520sP0() { // from class: X.0sPR
                    @Override // X.InterfaceC1625520sP0
                    public final void LIZ(C1627360sRy c1627360sRy) {
                        c1625240sOY.LLJJJJJIL = null;
                    }

                    @Override // X.InterfaceC1625520sP0
                    public final void LIZIZ(C1627370sRz c1627370sRz) {
                        boolean z;
                        C1625240sOY c1625240sOY2 = c1625240sOY;
                        Effect effect = c1627370sRz.LIZ;
                        c1625240sOY2.LLJJJJJIL = effect;
                        IStickerService.FaceSticker faceStickerLIZIZ = C202008142k.LIZIZ(effect);
                        if (faceStickerLIZIZ != null) {
                            Bundle bundle = c1627370sRz.LJ;
                            if (bundle != null) {
                                z = bundle.getBoolean("is_video_used_sticker");
                            } else {
                                z = false;
                            }
                            faceStickerLIZIZ.isVideoUsedSticker = z;
                        }
                    }
                });
                c1625240sOY.rf(c1631240sYELIZ);
            }
            InterfaceC1623190sLF interfaceC1623190sLF = this.liveStickerModule.LLJI;
            if (interfaceC1623190sLF != null) {
                interfaceC1623190sLF.show();
            }
        }
    }
}
