package kotlin.jvm.internal;

import X.AbstractC1321260kUG;
import X.AbstractC589620NAq;
import X.AbstractViewOnClickListenerC1173120gdK;
import X.C09AY;
import X.C0ID2;
import X.C0NT5;
import X.C0OKA;
import X.C1322200kVm;
import X.C1325710kbR;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C1537050q6J;
import X.C15438062q;
import X.C1551950qUL;
import X.C178200mK;
import X.C20684815ws;
import X.C2097908Jt;
import X.C2126308Ur;
import X.C2296808zG;
import X.C23250099c;
import X.C2344009Gk;
import X.C323200Cli;
import X.C418440Gaw;
import X.C424560Gko;
import X.C5185020h;
import X.C589650NAt;
import X.C589700NAy;
import X.C604680Nne;
import X.C704830Rkn;
import X.C724240Sb0;
import X.C770770ULj;
import X.C786410Ut5;
import X.C823050WQl;
import X.InterfaceC1369790lkX;
import X.InterfaceC2217461Bqa;
import Y.ARunnableS75S0200000_6;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.geckox.OptionCheckUpdateParams;
import com.bytedance.geckox.model.CheckRequestBodyModel;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.feed.assem.share.quickexternalshare.QuickExternalShareSensorConfigProvider;
import com.ss.android.ugc.aweme.feed.assem.share.quickexternalshare.QuickExternalShareVM;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinListViewModel;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.highlights.model.ECGuidanceButton;
import com.ss.android.ugc.aweme.music.model.MatchedSoundInfo;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.model.MusicDetail;
import com.ss.android.ugc.aweme.music.model.MusicResourceBitStruct;
import com.ss.android.ugc.aweme.music.model.MusicResourceBitStructScene;
import com.ss.android.ugc.aweme.music.v2.assem.MusicIPPageBannerSlotAssem;
import com.ss.android.ugc.aweme.music.v2.viewmodel.MusicDetailViewModel;
import com.ss.android.ugc.aweme.services.IMainService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public class AwS44S0500000_9 extends C09AY implements Function1 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            case 4:
                return invoke$4(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS44S0500000_9 awS44S0500000_9, Object obj) {
        QuickExternalShareVM quickExternalShareVM = (QuickExternalShareVM) awS44S0500000_9.l0;
        quickExternalShareVM.LLILLJJLI = (InterfaceC1369790lkX) obj;
        QuickExternalShareSensorConfigProvider quickExternalShareSensorConfigProvider = (QuickExternalShareSensorConfigProvider) awS44S0500000_9.l1;
        C704830Rkn c704830Rkn = (C704830Rkn) awS44S0500000_9.l2;
        Map map = (Map) awS44S0500000_9.l3;
        quickExternalShareSensorConfigProvider.getClass();
        QuickExternalShareSensorConfigProvider.LIZ(c704830Rkn, quickExternalShareVM, map);
        Function0 function0 = (Function0) awS44S0500000_9.l4;
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS44S0500000_9 awS44S0500000_9, Object obj) {
        String string;
        final String scene;
        String idStr;
        String logExtra;
        Object obj2;
        Object obj3;
        Object obj4;
        MatchedSoundInfo matchedSongInfo;
        String id;
        Bundle arguments;
        final MusicDetail musicDetail = (MusicDetail) obj;
        final MusicIPPageBannerSlotAssem musicIPPageBannerSlotAssem = (MusicIPPageBannerSlotAssem) awS44S0500000_9.l0;
        View view = (View) awS44S0500000_9.l1;
        C424560Gko c424560Gko = (C424560Gko) awS44S0500000_9.l2;
        TuxTextView tuxTextView = (TuxTextView) awS44S0500000_9.l3;
        View view2 = (View) awS44S0500000_9.l4;
        musicIPPageBannerSlotAssem.getClass();
        MusicIPPageBannerSlotAssem.LLJJIII.getClass();
        if (!musicDetail.hasMusicIPPageBanner()) {
            C786410Ut5.LJLLLLLL(8, view);
        } else {
            MusicResourceBitStruct musicResourceBitStruct = musicDetail.musicResourceBitStruct;
            if (musicResourceBitStruct != null) {
                List<String> channels = musicResourceBitStruct.getChannels();
                if (channels != null) {
                    ArrayList arrayList = new ArrayList();
                    for (String str : channels) {
                        if (str.length() > 0) {
                            arrayList.add(str);
                        }
                    }
                    ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(new CheckRequestBodyModel.TargetChannel((String) it2.next()));
                    }
                    if (!arrayList2.isEmpty()) {
                        try {
                            OptionCheckUpdateParams optionCheckUpdateParams = new OptionCheckUpdateParams();
                            optionCheckUpdateParams.setLazyUpdate(true);
                            String accessKey = ((IMainService) ServiceManager.get().getService(IMainService.class)).getAccessKey();
                            C1537050q6J.LIZ.getClass();
                            C1551950qUL c1551950qULLIZ = C1537050q6J.LIZ(accessKey);
                            if (c1551950qULLIZ != null) {
                                c1551950qULLIZ.LIZ(null, C2097908Jt.LIZJ(new Pair(accessKey, arrayList2)), optionCheckUpdateParams);
                            }
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                        }
                    }
                }
                Fragment fragmentLJI = C724240Sb0.LJI(musicIPPageBannerSlotAssem);
                String str2 = "";
                if (fragmentLJI == null || (arguments = fragmentLJI.getArguments()) == null || (string = arguments.getString("aweme_id")) == null) {
                    string = "";
                }
                MusicResourceBitStruct musicResourceBitStruct2 = musicDetail.musicResourceBitStruct;
                if (musicResourceBitStruct2 == null || (scene = musicResourceBitStruct2.getScene()) == null) {
                    scene = "";
                }
                String icon = musicResourceBitStruct.getIcon();
                if (icon != null) {
                    c424560Gko.setCornerRadius(C418440Gaw.LIZIZ(6));
                    tuxTextView.setText(musicResourceBitStruct.getDesc());
                    C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(icon);
                    c1331670kl3LJIIIZ.LIZLLL("music_detail_page_ip_page_banner");
                    c1331670kl3LJIIIZ.LJJ(c424560Gko);
                    c1331670kl3LJIIIZ.LJIIJ(new C0ID2(view2, 3));
                    AssemVMLazy assemVMLazy = musicIPPageBannerSlotAssem.LLJJI;
                    InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = MusicIPPageBannerSlotAssem.LLJJIJI;
                    final String str3 = ((MusicDetailViewModel) assemVMLazy.getValue()).LLIZ;
                    if (str3 == null) {
                        str3 = "";
                    }
                    final String str4 = ((MusicDetailViewModel) musicIPPageBannerSlotAssem.LLJJI.getValue()).LLJ;
                    Music music = musicDetail.music;
                    if (music != null && (matchedSongInfo = music.getMatchedSongInfo()) != null && (id = matchedSongInfo.getId()) != null) {
                        str2 = id;
                    }
                    final String str5 = str2;
                    final String str6 = string;
                    C786410Ut5.I7(new AbstractViewOnClickListenerC1173120gdK() { // from class: X.0OnU
                        @Override // X.AbstractViewOnClickListenerC1173120gdK
                        public final void LIZ(View view3) {
                            MusicResourceBitStruct musicResourceBitStruct3;
                            String schema;
                            String idStr2;
                            String logExtra2;
                            Object obj5;
                            Object obj6;
                            if (Intrinsics.LJFF(scene, MusicResourceBitStructScene.TV_FILM_IP_PAGE.getScene()) && (musicResourceBitStruct3 = musicDetail.musicResourceBitStruct) != null && (schema = musicResourceBitStruct3.getSchema()) != null) {
                                SmartRouter.buildRoute(musicIPPageBannerSlotAssem.getContext(), schema).open();
                                String str7 = str3;
                                String str8 = str4;
                                String str9 = str5;
                                Music music2 = musicDetail.music;
                                Object obj7 = null;
                                if (music2 != null) {
                                    idStr2 = music2.getIdStr();
                                } else {
                                    idStr2 = null;
                                }
                                String str10 = str6;
                                MusicResourceBitStruct musicResourceBitStruct4 = musicDetail.musicResourceBitStruct;
                                if (musicResourceBitStruct4 != null) {
                                    logExtra2 = musicResourceBitStruct4.getLogExtra();
                                } else {
                                    logExtra2 = null;
                                }
                                ConcurrentHashMap concurrentHashMapLIZ = C178200mK.LIZ(logExtra2);
                                C2344009Gk c2344009Gk = new C2344009Gk();
                                c2344009Gk.LJIIIIZZ("enter_from", str7);
                                c2344009Gk.LJIIIIZZ("enter_method", str8);
                                if (concurrentHashMapLIZ != null) {
                                    obj5 = concurrentHashMapLIZ.get("activity_title");
                                } else {
                                    obj5 = null;
                                }
                                c2344009Gk.LJ(obj5, "activity_title");
                                if (concurrentHashMapLIZ != null) {
                                    obj6 = concurrentHashMapLIZ.get("promotion_entity_id");
                                } else {
                                    obj6 = null;
                                }
                                c2344009Gk.LJ(obj6, "promotion_entity_id");
                                if (concurrentHashMapLIZ != null) {
                                    obj7 = concurrentHashMapLIZ.get("anchor_id");
                                }
                                c2344009Gk.LJ(obj7, "anchor_id");
                                c2344009Gk.LJIIIIZZ("group_id", str10);
                                c2344009Gk.LJIIIIZZ("meta_song_id", str9);
                                c2344009Gk.LJIIIIZZ("music_id", idStr2);
                                if (concurrentHashMapLIZ != null) {
                                    for (Map.Entry entry : concurrentHashMapLIZ.entrySet()) {
                                        c2344009Gk.LJ(entry.getValue(), (String) entry.getKey());
                                    }
                                }
                                C20684815ws.LJIILLIIL("entertainment_detail_mdp_entrance_click", c2344009Gk.LIZ);
                            }
                        }
                    }, view);
                    Music music2 = musicDetail.music;
                    if (music2 != null) {
                        idStr = music2.getIdStr();
                    } else {
                        idStr = null;
                    }
                    MusicResourceBitStruct musicResourceBitStruct3 = musicDetail.musicResourceBitStruct;
                    if (musicResourceBitStruct3 != null) {
                        logExtra = musicResourceBitStruct3.getLogExtra();
                    } else {
                        logExtra = null;
                    }
                    ConcurrentHashMap concurrentHashMapLIZ = C178200mK.LIZ(logExtra);
                    C2344009Gk c2344009Gk = new C2344009Gk();
                    c2344009Gk.LJIIIIZZ("enter_from", str3);
                    c2344009Gk.LJIIIIZZ("enter_method", str4);
                    if (concurrentHashMapLIZ != null) {
                        obj2 = concurrentHashMapLIZ.get("activity_title");
                    } else {
                        obj2 = null;
                    }
                    c2344009Gk.LJ(obj2, "activity_title");
                    if (concurrentHashMapLIZ != null) {
                        obj3 = concurrentHashMapLIZ.get("promotion_entity_id");
                    } else {
                        obj3 = null;
                    }
                    c2344009Gk.LJ(obj3, "promotion_entity_id");
                    if (concurrentHashMapLIZ != null) {
                        obj4 = concurrentHashMapLIZ.get("anchor_id");
                    } else {
                        obj4 = null;
                    }
                    c2344009Gk.LJ(obj4, "anchor_id");
                    c2344009Gk.LJIIIIZZ("group_id", string);
                    c2344009Gk.LJIIIIZZ("meta_song_id", str2);
                    c2344009Gk.LJIIIIZZ("music_id", idStr);
                    if (concurrentHashMapLIZ != null) {
                        for (Map.Entry entry : concurrentHashMapLIZ.entrySet()) {
                            c2344009Gk.LJ(entry.getValue(), (String) entry.getKey());
                        }
                    }
                    C20684815ws.LJIILLIIL("entertainment_detail_mdp_entrance_show", c2344009Gk.LIZ);
                }
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS44S0500000_9 awS44S0500000_9, Object obj) {
        if (((Boolean) obj).booleanValue()) {
            if ((((Number) C323200Cli.LIZ.getValue()).intValue() & 2) != 0) {
                Executor executor = C589700NAy.LIZ;
                C589700NAy.LIZIZ((C1325710kbR) awS44S0500000_9.l0, (Context) awS44S0500000_9.l1, (Function0) awS44S0500000_9.l2, new C5185020h((Function2) awS44S0500000_9.l3, (Function2<? super Boolean, ? super Throwable, Unit>) 34));
            }
        } else {
            Executor executor2 = C589700NAy.LIZ;
            C1325710kbR c1325710kbR = (C1325710kbR) awS44S0500000_9.l0;
            Context context = (Context) awS44S0500000_9.l1;
            final C589650NAt c589650NAt = new C589650NAt(context, c1325710kbR, (Function0) awS44S0500000_9.l4, (Function0) awS44S0500000_9.l2, (Function2) awS44S0500000_9.l3);
            AbstractC1321260kUG abstractC1321260kUGLJIJ = C1322200kVm.LIZ().LJIJ(c1325710kbR, context);
            final ScheduledFuture<?> scheduledFutureSchedule = C823050WQl.LJ().schedule(new ARunnableS75S0200000_6(abstractC1321260kUGLJIJ, c589650NAt, 97), Mp4ScreenVideoLoadTimeout.CONTROL, TimeUnit.MILLISECONDS);
            abstractC1321260kUGLJIJ.LIZJ(new AbstractC589620NAq() { // from class: X.0NAs
                @Override // X.AbstractC589620NAq
                public final void LJFF() {
                    ScheduledFuture<?> scheduledFuture = scheduledFutureSchedule;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                    }
                    c589650NAt.invoke(Boolean.TRUE, null);
                }

                @Override // X.AbstractC589620NAq
                public final void LJ(InterfaceC1320200kSY<Void> interfaceC1320200kSY) {
                    Throwable exc;
                    ScheduledFuture<?> scheduledFuture = scheduledFutureSchedule;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                    }
                    if (interfaceC1320200kSY == null || (exc = ((AbstractC1321260kUG) interfaceC1320200kSY).LIZLLL()) == null) {
                        exc = new Exception("Disk prefetch failed");
                    }
                    c589650NAt.invoke(Boolean.FALSE, exc);
                }
            }, C589700NAy.LIZ);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00ba  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$3(kotlin.jvm.internal.AwS44S0500000_9 r19, java.lang.Object r20) {
        /*
            Method dump skipped, instruction units count: 332
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS44S0500000_9.invoke$3(kotlin.jvm.internal.AwS44S0500000_9, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$4(AwS44S0500000_9 awS44S0500000_9, Object obj) {
        C770770ULj c770770ULj = (C770770ULj) obj;
        ECGuidanceButton eCGuidanceButton = (ECGuidanceButton) awS44S0500000_9.l0;
        Integer num = eCGuidanceButton.callbackScene;
        if (num != null) {
            C604680Nne c604680Nne = (C604680Nne) awS44S0500000_9.l1;
            Context context = (Context) awS44S0500000_9.l2;
            Function0 function0 = (Function0) awS44S0500000_9.l3;
            Function1 function1 = (Function1) awS44S0500000_9.l4;
            int iIntValue = num.intValue();
            c770770ULj.LIZIZ = false;
            c770770ULj.LIZ(true);
            C23250099c.LIZLLL(C2296808zG.LIZ(C2126308Ur.LIZIZ), null, null, new C0NT5(iIntValue, c604680Nne, eCGuidanceButton, context, c770770ULj, function0, function1, null), 3);
        } else {
            ((Function0) awS44S0500000_9.l3).invoke();
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS44S0500000_9(BulletinListViewModel bulletinListViewModel, Long l, C0OKA c0oka, int i) {
        super(1);
        this.$t = i;
        this.l0 = bulletinListViewModel;
        this.l1 = null;
        this.l2 = null;
        this.l3 = l;
        this.l4 = c0oka;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS44S0500000_9(Context context, C1325710kbR c1325710kbR, Function0 function0, Function0 function02, Function2 function2, int i) {
        super(1);
        this.$t = i;
        this.l0 = c1325710kbR;
        this.l1 = context;
        this.l2 = function0;
        this.l3 = function2;
        this.l4 = function02;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS44S0500000_9(QuickExternalShareVM quickExternalShareVM, QuickExternalShareVM quickExternalShareVM2, QuickExternalShareSensorConfigProvider quickExternalShareSensorConfigProvider, C704830Rkn c704830Rkn, Map<String, Object> map, Function0<Unit> function0) {
        super(1);
        this.$t = function0;
        this.l0 = quickExternalShareVM;
        this.l1 = quickExternalShareVM2;
        this.l2 = quickExternalShareSensorConfigProvider;
        this.l3 = c704830Rkn;
        this.l4 = map;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS44S0500000_9(ECGuidanceButton eCGuidanceButton, C604680Nne c604680Nne, Context context, AwS553S0100000_9 awS553S0100000_9, AwS588S0100000_9 awS588S0100000_9, int i) {
        super(1);
        this.$t = i;
        this.l0 = eCGuidanceButton;
        this.l1 = c604680Nne;
        this.l2 = context;
        this.l3 = awS553S0100000_9;
        this.l4 = awS588S0100000_9;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS44S0500000_9(MusicIPPageBannerSlotAssem musicIPPageBannerSlotAssem, View view, C424560Gko c424560Gko, TuxTextView tuxTextView, View view2, int i) {
        super(1);
        this.$t = i;
        this.l0 = musicIPPageBannerSlotAssem;
        this.l1 = view;
        this.l2 = c424560Gko;
        this.l3 = tuxTextView;
        this.l4 = view2;
    }
}
