package com.ss.android.ugc.aweme.share.linkshare;

import X.C01GW;
import X.C098200Yq;
import X.C09O8;
import X.C13BV;
import X.C1402840mbq;
import X.C1685300txQ;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C1B4F;
import X.C1B4X;
import X.C2198861B4a;
import X.C452501pT;
import X.C786410Ut5;
import X.C960203pA;
import X.InterfaceC1850580yG0;
import X.InterfaceC2198961B4k;
import Y.AObserverS187S0200000_27;
import Y.AObserverS229S0100000_27;
import Y.AObserverS236S0100000_34;
import Y.ARunnableS131S0100000_31;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.attributionlink.model.AttributionLinkStickerStruct;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.common.MusicContent;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.port.in.IAnotherMusicService;
import com.ss.android.ugc.aweme.share.common.ShareEntryFragment;
import com.ss.android.ugc.aweme.share.linkshare.TtopLinkShareConfigSettings;
import com.ss.android.ugc.aweme.share.linkshare.model.LinkShareIntentModel;
import com.ss.android.ugc.aweme.tools.integration.plugin.integration.api.CreativeToolsPluginService;
import com.zhiliaoapp.musically.R;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.AwS469S0200000_34;
import kotlin.jvm.internal.AwS578S0100000_34;
import kotlin.jvm.internal.AwS613S0100000_34;

/* JADX INFO: loaded from: classes35.dex */
public final class LinkShareEntryFragment extends ShareEntryFragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjYkKD02ZiHELIOSklJyQgICQ+LGEfISsnGicyOiAJJzshMQM+KCg+LSs4";
    public final C13BV LLJIJIL = C13BV.INSTANCE;
    public final C01GW LLJILJIL = C452501pT.LIZIZ(new AwS578S0100000_34(this, 68));

    public final LinkShareViewModel SR() {
        return (LinkShareViewModel) this.LLJILJIL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.share.common.ShareEntryFragment
    public final void NR() {
        SR().LLIZLLLIL.postValue(Unit.LIZ);
    }

    @Override // com.ss.android.ugc.aweme.share.common.ShareEntryFragment
    public final void OR(C1B4F c1b4f) {
        SR().LLIZ.postValue(c1b4f);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        LinkShareIntentModel linkShareIntentModel;
        C1402840mbq c1402840mbq;
        Music music;
        Serializable serializable;
        Serializable serializable2;
        super.onViewCreated(view, bundle);
        PR();
        Bundle arguments = getArguments();
        if (arguments != null) {
            linkShareIntentModel = (LinkShareIntentModel) arguments.getParcelable("link_share_model");
        } else {
            linkShareIntentModel = null;
        }
        Bundle arguments2 = getArguments();
        if (arguments2 != null && (serializable2 = arguments2.getSerializable("link_share_context")) != null && (serializable2 instanceof C1402840mbq)) {
            c1402840mbq = (C1402840mbq) serializable2;
        } else {
            c1402840mbq = null;
        }
        Bundle arguments3 = getArguments();
        if (arguments3 != null && (serializable = arguments3.getSerializable("link_share_music")) != null && (serializable instanceof Music)) {
            music = (Music) serializable;
        } else {
            music = null;
        }
        LinkShareViewModel linkShareViewModelSR = SR();
        WeakReference weakReference = new WeakReference(getActivity());
        linkShareViewModelSR.getClass();
        Activity activity = (Activity) weakReference.get();
        if (activity != null) {
            linkShareViewModelSR.LLILLL.postValue(Unit.LIZ);
            if (linkShareIntentModel != null) {
                if (c1402840mbq != null) {
                    C2198861B4a c2198861B4a = new C2198861B4a(activity, linkShareIntentModel.mediaUriPaths, C09O8.IMAGE, c1402840mbq, linkShareIntentModel.creativeInfo);
                    if (activity instanceof InterfaceC2198961B4k) {
                        c2198861B4a.LJFF = new WeakReference<>(activity);
                    }
                    final C1B4X c1b4x = new C1B4X(activity, linkShareIntentModel, c1402840mbq, c2198861B4a, music);
                    c1b4x.LJI = new AwS578S0100000_34(linkShareViewModelSR, 205);
                    c1b4x.LJII = new AwS613S0100000_34(linkShareViewModelSR, 165);
                    c1b4x.LJIIIIZZ = new AwS613S0100000_34(linkShareViewModelSR, 166);
                    linkShareViewModelSR.LLILZIL.postValue(new InterfaceC1850580yG0(c1b4x) { // from class: X.1B4Z
                        public final C1B4X LIZ;

                        @Override // X.InterfaceC1850580yG0
                        public final void LIZ() {
                        }

                        @Override // X.InterfaceC1850580yG0
                        public final void LIZIZ() {
                            C1B4X c1b4x2 = this.LIZ;
                            if (c1b4x2 != null) {
                                C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1510005ve(c1b4x2, null), 3);
                                C1260120ite.LIZIZ(new ARunnableS131S0100000_31(c1b4x2, 207));
                                String str = c1b4x2.LIZIZ.clientKey;
                                List<? extends EnumC1850560yFy> list = c1b4x2.LJFF;
                                ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
                                Iterator<? extends EnumC1850560yFy> it2 = list.iterator();
                                while (it2.hasNext()) {
                                    arrayList.add(it2.next().toString());
                                }
                                C2198871B4b.LIZLLL("click_dm", str, arrayList);
                            }
                        }

                        @Override // X.InterfaceC1850580yG0
                        public final void LIZJ() {
                            UrlModel playUrl;
                            String idStr;
                            final C1B4X c1b4x2 = this.LIZ;
                            if (c1b4x2 != null) {
                                final boolean z = false;
                                CreativeToolsPluginService creativeToolsPluginService = (CreativeToolsPluginService) PluggableExtentionKt.pluggableSpi$default(CreativeToolsPluginService.class, false, false, false, 14, null);
                                if (creativeToolsPluginService != null && creativeToolsPluginService.LJIIIZ() && !creativeToolsPluginService.LIZJ(c1b4x2.LIZ, "ImageLinkShareOperator", true)) {
                                    C201955140j.LJIIIIZZ(C1662160tM6.LIZIZ, "ImageLinkShareOperator", "ve plugin not installed, wait for download");
                                    return;
                                }
                                c1b4x2.LIZ(true);
                                Music music2 = c1b4x2.LJ;
                                if (music2 != null && (idStr = music2.getIdStr()) != null) {
                                    c1b4x2.LIZJ.mMusicContent = new MusicContent(idStr, c1b4x2.LIZIZ.musicStartTimeMs);
                                }
                                C1260120ite.LIZIZ(new ARunnableS131S0100000_31(c1b4x2, 207));
                                C1402840mbq c1402840mbq2 = c1b4x2.LIZJ;
                                C19592811l8 c19592811l8 = EnumC2198891B4d.Companion;
                                EnumC2198891B4d enumC2198891B4d = c1b4x2.LIZIZ.option;
                                c19592811l8.getClass();
                                int value = C19592811l8.LIZ(enumC2198891B4d).getValue();
                                LinkShareIntentModel linkShareIntentModel2 = c1b4x2.LIZIZ;
                                c1402840mbq2.attributionLinkStickerStruct = new AttributionLinkStickerStruct(value, linkShareIntentModel2.title, linkShareIntentModel2.link, 2, linkShareIntentModel2.coverImageSize.getSize());
                                Music music3 = c1b4x2.LJ;
                                if (music3 == null || (playUrl = music3.getPlayUrl()) == null || playUrl.getUri() == null) {
                                    String idStr2 = c1b4x2.LIZIZ.musicId;
                                    if (idStr2 == null && (music3 == null || (idStr2 = music3.getIdStr()) == null)) {
                                        c1b4x2.LIZLLL(null, false);
                                    } else {
                                        final IAnotherMusicService iAnotherMusicService = (IAnotherMusicService) ServiceManager.get().getService(IAnotherMusicService.class);
                                        iAnotherMusicService.requestMusic(idStr2, new InterfaceC1416890myV() { // from class: X.15MW
                                            @Override // X.InterfaceC1416890myV
                                            public final void LIZIZ(Exception exc) {
                                                c1b4x2.LIZLLL(null, z);
                                            }

                                            @Override // X.InterfaceC1416890myV
                                            public final void LIZLLL(AVMusic aVMusic) {
                                                c1b4x2.LIZLLL(iAnotherMusicService.LJII(aVMusic), z);
                                            }
                                        });
                                    }
                                } else {
                                    c1b4x2.LIZLLL(music3.convertToMusicModel(), false);
                                }
                                String str = c1b4x2.LIZIZ.clientKey;
                                List<? extends EnumC1850560yFy> list = c1b4x2.LJFF;
                                ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
                                Iterator<? extends EnumC1850560yFy> it2 = list.iterator();
                                while (it2.hasNext()) {
                                    arrayList.add(it2.next().toString());
                                }
                                C2198871B4b.LIZLLL("click_photo", str, arrayList);
                                C2198871B4b.LJ(c1b4x2.LIZJ.extraET, true);
                            }
                        }

                        /* JADX WARN: Type inference failed for: r0v29, types: [X.09AY, kotlin.jvm.functions.Function0] */
                        @Override // X.InterfaceC1850580yG0
                        public final void LIZLLL() {
                            String idStr;
                            C1B4X c1b4x2 = this.LIZ;
                            if (c1b4x2 != null) {
                                CreativeToolsPluginService creativeToolsPluginService = (CreativeToolsPluginService) PluggableExtentionKt.pluggableSpi$default(CreativeToolsPluginService.class, false, false, false, 14, null);
                                if (creativeToolsPluginService != null && creativeToolsPluginService.LJIIIZ() && !creativeToolsPluginService.LIZJ(c1b4x2.LIZ, "ImageLinkShareOperator", true)) {
                                    C201955140j.LJIIIIZZ(C1662160tM6.LIZIZ, "ImageLinkShareOperator", "ve plugin not installed, wait for download");
                                    return;
                                }
                                c1b4x2.LIZ(false);
                                c1b4x2.LIZJ.mShareFormat = EnumC569040MTm.GREEN_SCREEN;
                                Music music2 = c1b4x2.LJ;
                                if (music2 != null && (idStr = music2.getIdStr()) != null) {
                                    c1b4x2.LIZJ.mMusicContent = new MusicContent(idStr, c1b4x2.LIZIZ.musicStartTimeMs);
                                }
                                C1402840mbq c1402840mbq2 = c1b4x2.LIZJ;
                                C19592811l8 c19592811l8 = EnumC2198891B4d.Companion;
                                EnumC2198891B4d enumC2198891B4d = c1b4x2.LIZIZ.option;
                                c19592811l8.getClass();
                                int value = C19592811l8.LIZ(enumC2198891B4d).getValue();
                                LinkShareIntentModel linkShareIntentModel2 = c1b4x2.LIZIZ;
                                c1402840mbq2.attributionLinkStickerStruct = new AttributionLinkStickerStruct(value, linkShareIntentModel2.title, linkShareIntentModel2.link, 1, linkShareIntentModel2.coverImageSize.getSize());
                                TtopLinkShareConfigSettings.TtopLinkShareConfigModel ttopLinkShareConfigModelLIZ = TtopLinkShareConfigSettings.LIZ();
                                C2198861B4a c2198861B4a2 = c1b4x2.LIZLLL;
                                C1B4P c1b4p = c2198861B4a2.LJI;
                                c1b4p.LIZIZ = c1b4p.LIZIZ.subList(0, 1);
                                C1B4P c1b4p2 = c2198861B4a2.LJI;
                                int i = C2198901B4e.LIZ[c2198861B4a2.LIZJ.ordinal()];
                                int i2 = 2;
                                if (i != 1) {
                                    if (i != 2) {
                                        throw new C1954807lC();
                                    }
                                    i2 = c2198861B4a2.LJI.LIZIZ.size() == 1 ? 1 : 3;
                                } else if (c2198861B4a2.LJI.LIZIZ.size() != 1) {
                                    i2 = 4;
                                }
                                c1b4p2.LIZ = i2;
                                String str = ttopLinkShareConfigModelLIZ.videoGreenScreenEffectId.get(String.valueOf(c1b4x2.LIZIZ.coverImageSize.getSize()));
                                C2198861B4a c2198861B4a3 = c1b4x2.LIZLLL;
                                Music music3 = c1b4x2.LJ;
                                c2198861B4a3.LIZIZ(true, music3 != null ? music3.convertToMusicModel() : null, str);
                                String str2 = c1b4x2.LIZIZ.clientKey;
                                List<? extends EnumC1850560yFy> list = c1b4x2.LJFF;
                                ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
                                Iterator<? extends EnumC1850560yFy> it2 = list.iterator();
                                while (it2.hasNext()) {
                                    arrayList.add(it2.next().toString());
                                }
                                C2198871B4b.LIZLLL("click_video", str2, arrayList);
                                C2198871B4b.LJ(c1b4x2.LIZJ.extraET, false);
                                ?? r0 = c1b4x2.LJI;
                                if (r0 != 0) {
                                    r0.invoke();
                                }
                            }
                        }

                        {
                            this.LIZ = c1b4x;
                        }
                    });
                    c2198861B4a.LIZ(linkShareIntentModel, new AwS469S0200000_34(linkShareIntentModel, linkShareViewModelSR, 5));
                    SR().LLIZLLLIL.observe(getViewLifecycleOwner(), new AObserverS187S0200000_27(this, linkShareIntentModel, 5));
                    SR().LLILLJJLI.observe(getViewLifecycleOwner(), new AObserverS229S0100000_27(this, 30));
                    SR().LLILLL.observe(getViewLifecycleOwner(), new AObserverS229S0100000_27(this, 31));
                    SR().LLILZ.observe(getViewLifecycleOwner(), new AObserverS229S0100000_27(this, 32));
                    SR().LLILZIL.observe(getViewLifecycleOwner(), new AObserverS229S0100000_27(this, 33));
                    SR().LLILZLL.observe(getViewLifecycleOwner(), new AObserverS236S0100000_34(this, 15));
                    SR().LLIZLLLIL.observe(getViewLifecycleOwner(), new AObserverS236S0100000_34(this, 16));
                    SR().LLIZ.observe(getViewLifecycleOwner(), new AObserverS236S0100000_34(this, 17));
                    return;
                }
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // com.ss.android.ugc.aweme.share.common.ShareEntryFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewOnCreateView;
        SettingsManager.LIZLLL().getClass();
        boolean z = true;
        if (SettingsManager.LIZ("ttop_link_share_fix_setting", true)) {
            Context context = getContext();
            if (context == null || !C960203pA.LIZIZ(context)) {
                z = false;
            }
            if (z) {
                layoutInflater.getContext().setTheme(R.style.y0);
            } else {
                layoutInflater.getContext().setTheme(R.style.xm);
            }
            viewOnCreateView = C786410Ut5.Td(layoutInflater, R.layout.c8u, viewGroup, false);
        } else {
            viewOnCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        }
        C19GS c19gs = null;
        if (!(viewOnCreateView instanceof View)) {
            viewOnCreateView = null;
        }
        if (viewOnCreateView != null) {
            try {
                ViewTreeLifecycleOwner.set(viewOnCreateView, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(viewOnCreateView, this);
                viewOnCreateView.setTag(R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity = getActivity();
                if (activity instanceof C19GS) {
                    c19gs = (C19GS) activity;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return viewOnCreateView;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return viewOnCreateView;
    }
}
