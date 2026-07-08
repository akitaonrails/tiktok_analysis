package com.ss.android.ugc.aweme.services.mediaselector;

import X.C099R;
import X.C09AX;
import X.C09DV;
import X.C0CHQ;
import X.C0L91;
import X.C0LAB;
import X.C0LGY;
import X.C0PEM;
import X.C1397510mTF;
import X.C1397580mTM;
import X.C155000ia;
import X.C19EG;
import X.C1C7U;
import X.C1D75;
import X.C1D7E;
import X.C20684815ws;
import X.C2296808zG;
import X.C23250099c;
import X.C291130Bb5;
import X.C375070EnB;
import X.C524870KiD;
import X.C526890KlT;
import X.C985403tE;
import X.InterfaceC1364105Vn;
import X.InterfaceC497601wk;
import X.InterfaceC530910Krx;
import android.app.Activity;
import android.os.Bundle;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.shortvideo.album.EPAICreateSelectMaterialScene;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoScene;
import java.lang.ref.WeakReference;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS409S0200000_8;
import kotlin.jvm.internal.AwS9S0300100_8;
import njp.a;

/* JADX INFO: loaded from: classes9.dex */
public final class InternalMediaSelectorServiceImpl implements InterfaceC530910Krx {
    @Override // X.InterfaceC530910Krx
    public boolean checkImageAndVideoReadStoragePermissionGranted() {
        C0LGY c0lgy = C0LGY.LIZ;
        C0L91 c0l91 = C0L91.IMAGE_AND_VIDEO;
        c0lgy.getClass();
        return C0LGY.LIZIZ(c0l91);
    }

    @Override // X.InterfaceC530910Krx
    public int getCreativeRefineAlbumGroupStrategy() {
        return ((Number) C1D75.LIZ(C1D7E.class)).intValue();
    }

    @Override // X.InterfaceC530910Krx
    public boolean isAlbumOptDegradation() {
        return ((Number) C1D75.LIZ(C1D7E.class)).intValue() == 2;
    }

    @Override // X.InterfaceC530910Krx
    public boolean isPartialMediaAccessPermissionGranted() {
        C0LGY.LIZ.getClass();
        return C0LGY.LJI();
    }

    @Override // X.InterfaceC530910Krx
    public boolean executeCreativeRefinePreloadAlbumUserStrategy() {
        return C524870KiD.LIZ();
    }

    @Override // X.InterfaceC530910Krx
    public Class<? extends Scene> getDefaultMediaSelectorSceneClass() {
        return MvChoosePhotoScene.class;
    }

    /* JADX INFO: renamed from: com.ss.android.ugc.aweme.services.mediaselector.InternalMediaSelectorServiceImpl$preDownloadMusicForShootVideo$1, reason: invalid class name */
    /* JADX INFO: loaded from: classes3.dex */
    @C09DV(c = "com.ss.android.ugc.aweme.services.mediaselector.InternalMediaSelectorServiceImpl$preDownloadMusicForShootVideo$1", f = "InternalMediaSelectorServiceImpl.kt", l = {}, m = "invokeSuspend")
    public final class AnonymousClass1 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
        public final /* synthetic */ Function0<Unit> $preloadMusic;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Function0<Unit> function0, InterfaceC1364105Vn<? super AnonymousClass1> interfaceC1364105Vn) {
            super(2, interfaceC1364105Vn);
            this.$preloadMusic = function0;
        }

        @Override // njp.a
        public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
            return new AnonymousClass1(this.$preloadMusic, interfaceC1364105Vn);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
            return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
        }

        @Override // njp.a
        public final Object invokeSuspend(Object obj) {
            C1C7U.LIZ("InternalMediaSelectorServiceImpl@a319.preDownloadMusicForShootVideo$1");
            C099R.LJFF();
            if (this.label == 0) {
                C155000ia.LIZIZ(obj);
                this.$preloadMusic.invoke();
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("InternalMediaSelectorServiceImpl@a319.preDownloadMusicForShootVideo$1");
                return unit;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Override // X.InterfaceC530910Krx
    public Scene newDefaultMediaSelectorSceneInstance(Bundle bundle) {
        Scene mvChoosePhotoScene;
        if (bundle.getBoolean("key_ep_aigc_new_album_style", false)) {
            mvChoosePhotoScene = new EPAICreateSelectMaterialScene();
        } else {
            mvChoosePhotoScene = new MvChoosePhotoScene();
        }
        mvChoosePhotoScene.mArguments = bundle;
        return mvChoosePhotoScene;
    }

    @Override // X.InterfaceC530910Krx
    public void preDownloadMusicForShootVideo(Activity activity, C526890KlT c526890KlT) {
        if (!C291130Bb5.LIZ() || activity == null || !(activity instanceof C19EG)) {
            return;
        }
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new AnonymousClass1(new AwS409S0200000_8(new WeakReference(activity), (WeakReference<C19EG>) c526890KlT, (C526890KlT) 17), null), 3);
    }

    public String provideDate(long j, boolean z, boolean z2) {
        Locale locale;
        String str;
        if (j <= 0) {
            return "";
        }
        if (z2) {
            locale = Locale.ENGLISH;
        } else {
            locale = Locale.getDefault();
        }
        if (z) {
            str = "yyyy.M.d";
        } else {
            str = "MMM d, yyyy";
        }
        return new SimpleDateFormat(str, locale).format(new Date(j));
    }

    @Override // X.InterfaceC530910Krx
    public void showEditorProReplacePopup(Activity activity, long j, Function0<Unit> function0) {
        if (activity != null && !activity.isFinishing() && !activity.isDestroyed()) {
            Bundle bundleLJIIL = C0CHQ.LIZ().LJIJJ().LJIIL(activity);
            C1397580mTM c1397580mTM = new C1397580mTM(activity);
            c1397580mTM.LJI(activity.getResources().getString(2131833952));
            c1397580mTM.LIZIZ(activity.getResources().getString(2131833951));
            C985403tE.LIZ(c1397580mTM, new AwS9S0300100_8(activity, (Activity) function0, (Function0<Unit>) bundleLJIIL, (Bundle) j, 0L));
            new C1397510mTF(c1397580mTM).LIZLLL();
            C0LAB c0labLIZ = C375070EnB.LIZ(bundleLJIIL, String.valueOf(j));
            if (c0labLIZ != null) {
                C20684815ws.LJIILLIIL("choose_shorter_video_popup_show", c0labLIZ.LIZ);
            }
        }
    }
}
