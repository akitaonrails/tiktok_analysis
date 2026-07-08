package com.ss.android.ugc.aweme.favorites.business.music;

import X.C01GW;
import X.C0LAB;
import X.C0OGJ;
import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C0XKC;
import X.C1161970gLL;
import X.C1206360hUw;
import X.C12Y3;
import X.C13BV;
import X.C1443560nfW;
import X.C1449410nox;
import X.C1449430noz;
import X.C1458960o4M;
import X.C14EU;
import X.C1537410q6t;
import X.C1697810uHb;
import X.C191862104e;
import X.C191871104n;
import X.C19EG;
import X.C20533215Wg;
import X.C2200821BBo;
import X.C432050Gwt;
import X.C433060GyW;
import X.C580830MqH;
import X.C629770On1;
import X.InterfaceC1206390hUz;
import X.InterfaceC1206440hV4;
import X.InterfaceC1206570hVH;
import X.InterfaceC1206580hVI;
import X.InterfaceC1258040iqI;
import X.InterfaceC1541990qEH;
import X.InterfaceC20499515Jh;
import X.SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ScrollView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.ss.android.ugc.aweme.compliance.api.services.privacy.IPrivacyService;
import com.ss.android.ugc.aweme.favorites.business.powerviewpager.MusicCollectionFragmentData;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.mob.record.IRecordMobService;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.ui.MusicDownloadPlayHelper;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.external.ui.RecordConfig;
import com.ss.android.ugc.aweme.shortvideo.FromGroupPropService;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.shortvideo.model.RecordPresetResource;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacyUserSettingsV2;
import java.util.Map;
import java.util.UUID;
import kotlin.text.a0;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes30.dex */
public final class MusicCollectionFragment extends AmeBaseFragment implements InterfaceC20499515Jh, InterfaceC1206570hVH, InterfaceC1258040iqI, InterfaceC1206390hUz, InterfaceC1206440hV4, InterfaceC1206580hVI {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiMtPyAhITEpOmExPTHELIOSYlJyogO2shPDw6K2sBPDw6KwYjJSM2KzElJiEVOiQrJCo9PA==";
    public MusicDownloadPlayHelper LL;
    public long LLILLJJLI;
    public String LLILZ;
    public SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB LLILZLL;
    public View LLIZ;
    public boolean LLIZLLLIL;
    public boolean LLILLL = true;
    public boolean LLILZIL = true;

    @Override // X.InterfaceC20499515Jh
    public final /* synthetic */ void J2(MusicModel musicModel, long j) {
    }

    @Override // X.InterfaceC20499515Jh
    public final MusicModel LJI() {
        return null;
    }

    @Override // X.InterfaceC20499515Jh
    public final /* synthetic */ void LLJILJILJ(MusicModel musicModel, Exception exc) {
    }

    @Override // X.InterfaceC1206390hUz
    public final void LLLILZLLLI() throws Throwable {
        setUserVisibleHint(false);
    }

    @Override // X.InterfaceC1206440hV4
    public final void Sg() {
    }

    @Override // X.InterfaceC1206390hUz
    public final void V6() {
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment
    public final boolean isRegisterEventBus() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        this.LLIZ = null;
        this.LLIZLLLIL = false;
        super.onDestroyView();
        NR();
        MusicDownloadPlayHelper musicDownloadPlayHelper = this.LL;
        (musicDownloadPlayHelper != null ? musicDownloadPlayHelper : null).onDestroy();
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = this.LLILZLL;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null) {
            boolean z = SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LLLILZJ;
            sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LJJ(true);
        }
        C01GW<C1537410q6t> c01gw = C1537410q6t.LJIIIZ;
        C1161970gLL.LIZIZ();
    }

    @Override // X.InterfaceC20499515Jh
    public final /* synthetic */ void v2() {
    }

    @Override // X.InterfaceC20499515Jh
    public final /* synthetic */ void y4(Map map, MusicModel musicModel, String str) {
    }

    @Override // X.InterfaceC1258040iqI
    public final View LJJLIIIJILLIZJL() {
        View view = this.LLIZ;
        if (view != null && this.LLIZLLLIL) {
            return view;
        }
        RecyclerView recyclerViewLIZ = C1206360hUw.LIZ(this.LLILZLL);
        if (recyclerViewLIZ != null) {
            this.LLIZ = recyclerViewLIZ;
            this.LLIZLLLIL = true;
            return recyclerViewLIZ;
        }
        if (getContext() == null) {
            return null;
        }
        ScrollView scrollView = new ScrollView(getContext());
        this.LLIZ = scrollView;
        return scrollView;
    }

    public final void NR() {
        InterfaceC1541990qEH kitView;
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = this.LLILZLL;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB == null || (kitView = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.getKitView()) == null) {
            return;
        }
        kitView.X0("onPageJumped", C13BV.INSTANCE);
    }

    @Override // X.InterfaceC1206570hVH
    public final void onPageSelected() {
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
        InterfaceC1541990qEH kitView;
        if (!this.LLILLL || (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = this.LLILZLL) == null || (kitView = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.getKitView()) == null) {
            return;
        }
        kitView.X0("onTabSelected", C13BV.INSTANCE);
    }

    @Override // X.InterfaceC20499515Jh
    public final Activity LLILLL() {
        return getActivity();
    }

    @Override // X.InterfaceC20499515Jh
    public final boolean LLJLLIL() {
        return isViewValid();
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        NR();
    }

    public static void MR(C0LAB c0lab) {
        FromGroupPropService fromGroupPropService = (FromGroupPropService) ServiceManager.get().getService(FromGroupPropService.class);
        if (fromGroupPropService != null) {
            c0lab.LJ("from_group_id_prop_list", fromGroupPropService.LIZJ());
            c0lab.LJ("from_group_id_prop_resource_list", fromGroupPropService.LIZLLL());
        }
    }

    @Override // X.InterfaceC20499515Jh
    public final void ba(MusicModel musicModel) {
        String str;
        C19EG activity = getActivity();
        if (activity != null && !activity.isFinishing()) {
            String string = UUID.randomUUID().toString();
            RecordConfig.Builder builder = new RecordConfig.Builder();
            builder.creationId(string);
            builder.shootWay("collection_music");
            builder.recordPresetResource(new RecordPresetResource(null, null, musicModel.getMusicId(), musicModel));
            ((IExternalService) ServiceManager.get().getService(IExternalService.class)).asyncService("MusicCollect", new C12Y3(activity, builder.build(), musicModel, 1));
            NR();
            C0LAB c0lab = new C0LAB();
            c0lab.LJ("content_source", "shoot");
            c0lab.LIZ(C1443560nfW.LJIIIIZZ, "from_aigc_theme_status");
            c0lab.LIZ(C1443560nfW.LJIIIIZZ, "from_aigc_theme_status");
            MR(c0lab);
            IRecordMobService iRecordMobService = (IRecordMobService) ServiceManager.get().getService(IRecordMobService.class);
            if (this.LLILZIL) {
                str = "personal_homepage";
            } else {
                str = "others_homepage";
            }
            iRecordMobService.LIZIZ(new C1449410nox(string, "collection_music", str, null, null, new C1449430noz(musicModel.getMusicId(), "collection_music"), null, null, 216), c0lab, null);
        }
    }

    @Override // X.InterfaceC1206580hVI
    public final void gQ(boolean z) {
        this.LLILLL = z;
    }

    @C14EU
    public final void onAntiCrawlerEvent(C0XKC c0xkc) {
        InterfaceC1541990qEH kitView;
        String str = c0xkc.LIZ;
        if (str != null && a0.LJJIIZI(str, "/aweme/v1/user/music/collect/?", false)) {
            EventBus.LIZLLL().LIZIZ(c0xkc);
            SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = this.LLILZLL;
            if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null && (kitView = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.getKitView()) != null) {
                kitView.X0("onMusicCollectEvent", C13BV.INSTANCE);
            }
        }
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        System.currentTimeMillis();
    }

    @C14EU(threadMode = ThreadMode.BACKGROUND)
    public final void onCollectMusicEvent(C0OGJ c0ogj) {
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
        InterfaceC1541990qEH kitView;
        InterfaceC1541990qEH kitView2;
        if (isViewValid() && this.LLILZIL) {
            int i = c0ogj.LIZIZ;
            if (i == 0) {
                SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2 = this.LLILZLL;
                if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2 != null && (kitView2 = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2.getKitView()) != null) {
                    kitView2.X0("onMusicCollectEvent", C1697810uHb.LJIIJJI(0, c0ogj.LIZ));
                    return;
                }
                return;
            }
            if (i != 1 || (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = this.LLILZLL) == null || (kitView = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.getKitView()) == null) {
                return;
            }
            kitView.X0("onMusicCollectEvent", C1697810uHb.LJIIJJI(1, c0ogj.LIZ));
        }
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        MusicCollectionFragmentData musicCollectionFragmentData;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null && (musicCollectionFragmentData = (MusicCollectionFragmentData) arguments.getParcelable("power_viewpager_default_key")) != null) {
            this.LLILLL = musicCollectionFragmentData.lazyLoad;
        }
    }

    @C14EU
    public final void onMusicCollectEvent(C629770On1 c629770On1) {
        boolean z;
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
        InterfaceC1541990qEH kitView;
        InterfaceC1541990qEH kitView2;
        if (isViewValid() && this.LLILZIL) {
            Music music = c629770On1.LIZIZ.getMusic();
            if (music != null && music.getCollectStatus() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2 = this.LLILZLL;
                if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2 != null && (kitView2 = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2.getKitView()) != null) {
                    kitView2.X0("onMusicCollectEvent", C1697810uHb.LJIIJJI(0, music.getMid()));
                    return;
                }
                return;
            }
            if (music == null || music.getCollectStatus() != 1 || (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = this.LLILZLL) == null || (kitView = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.getKitView()) == null) {
                return;
            }
            kitView.X0("onMusicCollectEvent", C1697810uHb.LJIIJJI(1, music.getMid()));
        }
    }

    @Override // X.InterfaceC1206390hUz
    public final void onPageSelected(int i) {
        onPageSelected();
    }

    @Override // androidx.fragment.app.Fragment
    public final void setUserVisibleHint(boolean z) throws Throwable {
        Object obj;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(10502, "com/ss/android/ugc/aweme/favorites/business/music/MusicCollectionFragment", "setUserVisibleHint", this, new Object[]{Boolean.valueOf(z)}, "void", new C0WZW(false, "(Z)V", new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOypdZDc1SYJh7FSwtQaJ5OuoLl4C581ld/Hriht2ZKsdvePlq/KgZMLhFt7d6qTgA==", null)));
        if (c0wsuLIZIZ.LIZ) {
            return;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null && (obj = objArr[0]) != null) {
            z = ((Boolean) obj).booleanValue();
        }
        super.setUserVisibleHint(z);
        if (!z && !isDetached() && isViewValid()) {
            NR();
        }
        C2200821BBo.LIZ.getClass();
        if (!C2200821BBo.LIZ() && C2200821BBo.LJI && z) {
            C20533215Wg.LIZ(MusicCollectionFragment.class);
        }
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
        Integer numLIZ;
        super.onViewCreated(view, bundle);
        if (this.LLILZIL && (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = this.LLILZLL) != null) {
            final C432050Gwt c432050Gwt = new C432050Gwt();
            Lifecycle lifecycle = getLifecycle();
            c432050Gwt.LIZ = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
            C191862104e c191862104eLJ = C191871104n.LJ();
            C433060GyW c433060GyW = c432050Gwt.LIZJ;
            c191862104eLJ.getClass();
            C191862104e.LIZJ(c433060GyW);
            lifecycle.addObserver(new LifecycleEventObserver() { // from class: com.ss.android.ugc.aweme.favorites.business.music.MusicCollectionPublicBanner$startUp$1
                @Override // androidx.lifecycle.LifecycleEventObserver
                public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                    if (event == Lifecycle.Event.ON_DESTROY) {
                        C191862104e c191862104eLJ2 = C191871104n.LJ();
                        C433060GyW c433060GyW2 = c432050Gwt.LIZJ;
                        c191862104eLJ2.getClass();
                        C191862104e.LIZLLL(c433060GyW2);
                    }
                }
            });
            PrivacyUserSettingsV2 privacyUserSettingsV2LJIIIIZZ = ((IPrivacyService) ServiceManager.get().getService(IPrivacyService.class)).LJIIIIZZ();
            if (privacyUserSettingsV2LJIIIIZZ != null && (numLIZ = privacyUserSettingsV2LJIIIIZZ.LIZ("favorite_music")) != null && numLIZ.intValue() == 1) {
                c432050Gwt.LIZ();
            } else {
                c432050Gwt.LIZIZ();
            }
        }
    }

    @Override // X.InterfaceC20499515Jh
    public final void LLJJL(MusicModel musicModel, String str, String str2) {
        String str3;
        C19EG activity = getActivity();
        if (activity != null && !activity.isFinishing()) {
            String string = UUID.randomUUID().toString();
            RecordConfig.Builder builder = new RecordConfig.Builder();
            builder.creationId(string);
            builder.shootWay("collection_music");
            builder.musicPath(str);
            builder.musicOrigin(str2);
            ((IExternalService) ServiceManager.get().getService(IExternalService.class)).asyncService("MusicCollect", new C580830MqH(activity, builder.build(), musicModel, 8));
            NR();
            C1458960o4M.LIZ = true;
            C1458960o4M.LIZJ(true);
            C0LAB c0lab = new C0LAB();
            c0lab.LJ("content_source", "shoot");
            c0lab.LIZ(C1458960o4M.LIZ(), "favorite_scene");
            c0lab.LIZ(C1443560nfW.LJIIIIZZ, "from_aigc_theme_status");
            MR(c0lab);
            IRecordMobService iRecordMobService = (IRecordMobService) ServiceManager.get().getService(IRecordMobService.class);
            if (this.LLILZIL) {
                str3 = "personal_homepage";
            } else {
                str3 = "others_homepage";
            }
            iRecordMobService.LIZIZ(new C1449410nox(string, "collection_music", str3, null, null, new C1449430noz(musicModel.getMusicId(), "collection_music"), null, null, 216), c0lab, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x008c  */
    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View onCreateView(android.view.LayoutInflater r10, android.view.ViewGroup r11, android.os.Bundle r12) {
        /*
            Method dump skipped, instruction units count: 415
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.favorites.business.music.MusicCollectionFragment.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }
}
