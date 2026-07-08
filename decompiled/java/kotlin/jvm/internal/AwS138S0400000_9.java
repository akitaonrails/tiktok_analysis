package kotlin.jvm.internal;

import X.C050S;
import X.C05P0;
import X.C05P1;
import X.C09AY;
import X.C1247510iZJ;
import X.C1388190mED;
import X.C1389890mGx;
import X.C1390850mIV;
import X.C1697810uHb;
import X.C1720106oR;
import X.C19EG;
import X.C2097608Jq;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C297140Bkm;
import X.C631160OpG;
import X.C631640Oq2;
import X.C631830OqL;
import X.C632090Oql;
import X.C633020OsG;
import X.C633710OtN;
import X.C638360P2c;
import X.C724240Sb0;
import X.C737910Sx3;
import X.C946803n0;
import X.EnumC587920N4c;
import X.EnumC631610Opz;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.sheet.actionsheet.TuxActionSheet;
import com.ss.android.ugc.aweme.music.OriginMusicArg;
import com.ss.android.ugc.aweme.music.assem.list.cell.compose.MusicCellCollectIconViewModelCompose;
import com.ss.android.ugc.aweme.music.assem.list.cell.compose.MusicCellCompose;
import com.ss.android.ugc.aweme.music.fanspotlight.service.IMusicFanSpotlightService;
import com.ss.android.ugc.aweme.music.model.AddSongContextData;
import com.ss.android.ugc.aweme.music.model.AppleMusicToken;
import com.ss.android.ugc.aweme.music.model.DspAuthToken;
import com.ss.android.ugc.aweme.music.model.DspPlatform;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.model.MusicReleaseInfo;
import com.ss.android.ugc.aweme.music.model.TT2DSPSongInfo;
import com.ss.android.ugc.aweme.music.vm.MusicPlayViewModel;
import com.ss.android.ugc.aweme.music.vm.OriginMusicListViewModel;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.zhiliaoapp.musically.R;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes10.dex */
public class AwS138S0400000_9 extends C09AY implements Function0 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            case 4:
                return invoke$4(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS138S0400000_9 awS138S0400000_9) {
        FragmentManager supportFragmentManager;
        C632090Oql c632090Oql = (C632090Oql) ((C05P0) awS138S0400000_9.l0).getValue();
        C631640Oq2 c631640Oq2 = (C631640Oq2) awS138S0400000_9.l1;
        Context context = (Context) awS138S0400000_9.l2;
        OriginMusicListViewModel originMusicListViewModel = (OriginMusicListViewModel) awS138S0400000_9.l3;
        C1390850mIV c1390850mIV = new C1390850mIV();
        C1247510iZJ c1247510iZJ = new C1247510iZJ();
        c1247510iZJ.LIZIZ(2131837731);
        c1247510iZJ.LIZ(new AwS218S0300000_9(context, c631640Oq2, c632090Oql, 21));
        C1247510iZJ c1247510iZJ2 = new C1247510iZJ();
        c1247510iZJ2.LIZIZ(2131837732);
        c1247510iZJ2.LIZ(new AwS218S0300000_9(c632090Oql, context, originMusicListViewModel, 22));
        c1390850mIV.LIZIZ(c1247510iZJ, c1247510iZJ2);
        c1390850mIV.LIZLLL(2131837737);
        TuxActionSheet tuxActionSheetLIZJ = c1390850mIV.LIZJ();
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(context);
        if (c19egLIZIZ != null && (supportFragmentManager = c19egLIZIZ.getSupportFragmentManager()) != null) {
            tuxActionSheetLIZJ.show(supportFragmentManager, "edit_highlight");
        }
        MusicReleaseInfo musicReleaseInfo = c632090Oql.getMusicModel().getMusicReleaseInfo();
        if (musicReleaseInfo != null && musicReleaseInfo.isNewReleaseSong()) {
            C631830OqL.LIZJ(c631640Oq2, c632090Oql, "edit");
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS138S0400000_9 awS138S0400000_9) {
        C632090Oql c632090Oql = (C632090Oql) ((C05P0) awS138S0400000_9.l0).getValue();
        int iIntValue = ((Number) ((C05P1) awS138S0400000_9.l1).getValue()).intValue();
        Context context = (Context) awS138S0400000_9.l2;
        OriginMusicListViewModel originMusicListViewModel = (OriginMusicListViewModel) awS138S0400000_9.l3;
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("handlePinnedMusic pinStatus: ");
        sbLIZ.append(c632090Oql.getMusicItemModel().pinStatus);
        sbLIZ.append(", isHighlighted: ");
        sbLIZ.append(c632090Oql.getMusicItemModel().isHighlighted());
        C1720106oR.LJI("music_biz", C2188811AlT.LIZIZ(sbLIZ));
        if (c632090Oql.getMusicItemModel().pinStatus == EnumC631610Opz.PINNED) {
            if (!c632090Oql.getMusicItemModel().isHighlighted() && !c632090Oql.getMusicItemModel().isSpotlighted()) {
                originMusicListViewModel.IQ2(c632090Oql);
            } else {
                Activity activityLIZIZ = C737910Sx3.LIZIZ(context);
                if (activityLIZIZ != null) {
                    C1389890mGx c1389890mGx = new C1389890mGx(activityLIZIZ);
                    c1389890mGx.LJIIIZ(2131837742);
                    c1389890mGx.LJIIJJI();
                }
            }
        } else {
            originMusicListViewModel.DQ2(c632090Oql, iIntValue);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS138S0400000_9 awS138S0400000_9) {
        Context context;
        Activity activityLIZIZ;
        Fragment fragmentLIZ;
        List<TT2DSPSongInfo> tT2DSPSongInfos;
        String str;
        TT2DSPSongInfo next;
        String str2;
        AppleMusicToken appleMusicToken;
        TT2DSPSongInfo next2;
        AppleMusicToken appleMusicToken2;
        C632090Oql c632090Oql = (C632090Oql) ((C05P0) awS138S0400000_9.l0).getValue();
        ((Number) ((C05P1) awS138S0400000_9.l1).getValue()).intValue();
        C631640Oq2 c631640Oq2 = (C631640Oq2) awS138S0400000_9.l2;
        View view = (View) awS138S0400000_9.l3;
        Music music = c632090Oql.getMusicModel().getMusic();
        if (music != null && (context = view.getContext()) != null && (activityLIZIZ = C737910Sx3.LIZIZ(context)) != null && (fragmentLIZ = C946803n0.LIZ(view)) != null && (tT2DSPSongInfos = music.getTT2DSPSongInfos()) != null) {
            DspPlatform dspPlatformLJIILJJIL = C633020OsG.LIZIZ.LJIILJJIL(music);
            Iterator<TT2DSPSongInfo> it2 = tT2DSPSongInfos.iterator();
            while (true) {
                str = null;
                if (it2.hasNext()) {
                    next = it2.next();
                    Integer num = next.dspPlatform;
                    int value = dspPlatformLJIILJJIL.getValue();
                    if (num != null && num.intValue() == value) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            TT2DSPSongInfo tT2DSPSongInfo = next;
            C633020OsG c633020OsG = C633020OsG.LIZIZ;
            String strLJIILL = c633020OsG.LJIILL(dspPlatformLJIILJJIL);
            MusicCellCompose.LLJIJIL.getClass();
            AddSongContextData addSongContextDataLIZIZ = C631160OpG.LIZIZ(c631640Oq2, music, dspPlatformLJIILJJIL);
            if (dspPlatformLJIILJJIL == DspPlatform.UNKNOWN) {
                List<DspPlatform> listLJJLIIIJJI = c633020OsG.LJJLIIIJJI(music, null, null, null);
                if (listLJJLIIIJJI.size() == 1) {
                    DspPlatform dspPlatform = (DspPlatform) ListProtector.get(listLJJLIIIJJI, 0);
                    Iterator<TT2DSPSongInfo> it3 = tT2DSPSongInfos.iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            next2 = it3.next();
                            Integer num2 = next2.dspPlatform;
                            int value2 = dspPlatform.getValue();
                            if (num2 != null && num2.intValue() == value2) {
                                break;
                            }
                        } else {
                            next2 = null;
                            break;
                        }
                    }
                    TT2DSPSongInfo tT2DSPSongInfo2 = next2;
                    if (tT2DSPSongInfo2 != null) {
                        switch (C638360P2c.LIZ[dspPlatform.ordinal()]) {
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                                C633020OsG c633020OsG2 = C633020OsG.LIZIZ;
                                addSongContextDataLIZIZ.appendLogExtra(C2097608Jq.LJIIIIZZ(new Pair("dsp_installed", dspPlatform.getEventName()), new Pair("dsp_installed_number", "1")));
                                List<String> listLJIIL = C1697810uHb.LJIIL(tT2DSPSongInfo2.songId);
                                EnumC587920N4c enumC587920N4c = EnumC587920N4c.DIRECTLY_AUTH;
                                DspAuthToken dspAuthToken = tT2DSPSongInfo2.token;
                                if (dspAuthToken != null && (appleMusicToken2 = dspAuthToken.appleMusicToken) != null) {
                                    str = appleMusicToken2.developToken;
                                }
                                c633020OsG2.LJJJJZI(activityLIZIZ, fragmentLIZ, addSongContextDataLIZIZ, dspPlatform, listLJIIL, enumC587920N4c, str, null, null);
                                break;
                            default:
                                C631830OqL.LIZIZ(fragmentLIZ, addSongContextDataLIZIZ, tT2DSPSongInfos);
                                break;
                        }
                    } else {
                        C631830OqL.LIZIZ(fragmentLIZ, addSongContextDataLIZIZ, tT2DSPSongInfos);
                    }
                } else {
                    C631830OqL.LIZIZ(fragmentLIZ, addSongContextDataLIZIZ, tT2DSPSongInfos);
                }
            } else if (tT2DSPSongInfo != null && (str2 = tT2DSPSongInfo.songId) != null && str2.length() != 0) {
                if (strLJIILL.length() != 0 || C297140Bkm.LIZ()) {
                    c633020OsG.LJJIIZI(activityLIZIZ, fragmentLIZ, addSongContextDataLIZIZ, dspPlatformLJIILJJIL, Collections.singletonList(tT2DSPSongInfo), false);
                } else {
                    switch (C638360P2c.LIZ[dspPlatformLJIILJJIL.ordinal()]) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                            List<String> listLJIIL2 = C1697810uHb.LJIIL(tT2DSPSongInfo.songId);
                            EnumC587920N4c enumC587920N4c2 = EnumC587920N4c.DIRECTLY_AUTH;
                            DspAuthToken dspAuthToken2 = tT2DSPSongInfo.token;
                            if (dspAuthToken2 != null && (appleMusicToken = dspAuthToken2.appleMusicToken) != null) {
                                str = appleMusicToken.developToken;
                            }
                            c633020OsG.LJJJJZI(activityLIZIZ, fragmentLIZ, addSongContextDataLIZIZ, dspPlatformLJIILJJIL, listLJIIL2, enumC587920N4c2, str, null, null);
                            break;
                        default:
                            C631830OqL.LIZIZ(fragmentLIZ, addSongContextDataLIZIZ, tT2DSPSongInfos);
                            break;
                    }
                }
            } else {
                C1389890mGx c1389890mGx = new C1389890mGx(fragmentLIZ);
                c1389890mGx.LJIIIZ(2131824930);
                c1389890mGx.LJIIJJI();
            }
            C633020OsG c633020OsG3 = C633020OsG.LIZIZ;
            MusicCellCompose.LLJIJIL.getClass();
            c633020OsG3.LJJLJ(C631160OpG.LIZ(c631640Oq2, music));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS138S0400000_9 awS138S0400000_9) {
        String str;
        int iHashCode;
        String idStr;
        Fragment fragmentLJI = C724240Sb0.LJI((LifecycleOwner) awS138S0400000_9.l0);
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute((Context) awS138S0400000_9.l1, "aweme://aweme/detail/");
        smartRouteBuildRoute.withParam(FollowStatusChangeMethod.PARAM_UID, ((C050S) awS138S0400000_9.l2).LL.getAid());
        OriginMusicArg originMusicArg = (OriginMusicArg) awS138S0400000_9.l3;
        if (originMusicArg != null && originMusicArg.isMe()) {
            str = "personal_homepage";
        } else {
            str = "others_homepage";
        }
        smartRouteBuildRoute.withParam("enter_from", str);
        smartRouteBuildRoute.withParam("video_from", "fan_spotlighted_page");
        smartRouteBuildRoute.withParam("extra_detail_title_text", ((Context) awS138S0400000_9.l1).getString(2131834401));
        HashMap map = new HashMap();
        if (fragmentLJI != null) {
            iHashCode = fragmentLJI.hashCode();
        } else {
            iHashCode = 0;
        }
        map.put("fan_spotlighted_extra_key", String.valueOf(iHashCode));
        smartRouteBuildRoute.withParam("feed_param_extra", map);
        smartRouteBuildRoute.open();
        OriginMusicArg originMusicArg2 = (OriginMusicArg) awS138S0400000_9.l3;
        if (originMusicArg2 != null && !originMusicArg2.isMe()) {
            C633710OtN.LIZ.getClass();
            IMusicFanSpotlightService iMusicFanSpotlightService = C633710OtN.LIZJ;
            Music music = ((C050S) awS138S0400000_9.l2).LL.getMusic();
            if (music == null || (idStr = music.getIdStr()) == null) {
                idStr = "";
            }
            iMusicFanSpotlightService.LIZLLL("music_tab_item", 0, null, null, null, null, null, null, null, null, null, null, idStr, ((C050S) awS138S0400000_9.l2).LL.getAid());
        }
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS138S0400000_9 awS138S0400000_9) {
        FragmentManager supportFragmentManager;
        C1390850mIV c1390850mIV = new C1390850mIV();
        c1390850mIV.LJ(R.style.m9);
        C1247510iZJ c1247510iZJ = new C1247510iZJ();
        c1247510iZJ.LIZIZ(2131834407);
        c1247510iZJ.LIZ(new AwS218S0300000_9((OriginMusicListViewModel) awS138S0400000_9.l1, (C050S) awS138S0400000_9.l2, (View) awS138S0400000_9.l3, 23));
        c1390850mIV.LIZIZ(c1247510iZJ);
        c1390850mIV.LIZLLL(2131837737);
        TuxActionSheet tuxActionSheetLIZJ = c1390850mIV.LIZJ();
        C19EG c19egLIZIZ = C1388190mED.LIZIZ((Context) awS138S0400000_9.l0);
        if (c19egLIZIZ != null && (supportFragmentManager = c19egLIZIZ.getSupportFragmentManager()) != null) {
            tuxActionSheetLIZJ.show(supportFragmentManager, "remove fan spotlight");
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS138S0400000_9(C05P0 c05p0, C05P0 c05p02, Context context, OriginMusicListViewModel originMusicListViewModel, int i) {
        super(0);
        this.$t = i;
        this.l0 = c05p0;
        this.l1 = c05p02;
        this.l2 = context;
        this.l3 = originMusicListViewModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS138S0400000_9(C05P0 c05p0, C05P0<C632090Oql> c05p02, C631640Oq2 c631640Oq2, Context context, OriginMusicListViewModel originMusicListViewModel) {
        super(0);
        this.$t = originMusicListViewModel;
        this.l0 = c05p0;
        this.l1 = c05p02;
        this.l2 = c631640Oq2;
        this.l3 = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS138S0400000_9(Context context, OriginMusicListViewModel originMusicListViewModel, C050S c050s, View view, int i) {
        super(0);
        this.$t = i;
        this.l0 = context;
        this.l1 = originMusicListViewModel;
        this.l2 = c050s;
        this.l3 = view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS138S0400000_9(LifecycleOwner lifecycleOwner, Context context, C050S c050s, OriginMusicArg originMusicArg, int i) {
        super(0);
        this.$t = i;
        this.l0 = lifecycleOwner;
        this.l1 = context;
        this.l2 = c050s;
        this.l3 = originMusicArg;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS138S0400000_9(C05P0 c05p0, C05P0 c05p02, C631640Oq2 c631640Oq2, View view, Context context, MusicPlayViewModel musicPlayViewModel, OriginMusicListViewModel originMusicListViewModel, MusicCellCollectIconViewModelCompose musicCellCollectIconViewModelCompose, int i) {
        super(0);
        this.$t = i;
        this.l0 = c05p0;
        this.l1 = c05p02;
        this.l2 = c631640Oq2;
        this.l3 = view;
    }
}
