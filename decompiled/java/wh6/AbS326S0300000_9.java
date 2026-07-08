package wh6;

import X.AbstractViewOnClickListenerC1637610siV;
import X.C0XI4;
import X.C20684815ws;
import X.C2188811AlT;
import X.C2344009Gk;
import X.C632050Oqh;
import X.C632410OrH;
import X.C786410Ut5;
import X.EnumC632420OrI;
import android.content.Context;
import android.view.View;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.music.OriginMusicArg;
import com.ss.android.ugc.aweme.music.assem.MusicListArtistCertificationAssem;
import com.ss.android.ugc.aweme.music.ghost.ClaimStatusMusicAssem;
import com.ss.android.ugc.aweme.profile.model.ClaimStatus;
import com.ss.android.ugc.aweme.profile.model.MusicTabClaimInfo;
import com.ss.android.ugc.aweme.profile.model.MusicTabInfo;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes10.dex */
public class AbS326S0300000_9 extends AbstractViewOnClickListenerC1637610siV {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // X.AbstractViewOnClickListenerC1637610siV
    public final void LIZ(View view) {
        switch (this.$t) {
            case 0:
                LIZ$0(this, view);
                break;
            case 1:
                LIZ$1(this, view);
                break;
            case 2:
                LIZ$2(this, view);
                break;
            default:
                super.LIZ(view);
                break;
        }
    }

    public static final void LIZ$0(AbS326S0300000_9 abS326S0300000_9, View view) {
        MusicTabInfo musicTabInfo;
        Integer numValueOf;
        String strLJFF;
        String userId;
        String strLIZJ;
        if (view != null && (musicTabInfo = ((User) abS326S0300000_9.l0).getMusicTabInfo()) != null) {
            MusicTabClaimInfo musicTabClaimInfo = musicTabInfo.musicTabClaimInfo;
            if (musicTabClaimInfo != null && musicTabClaimInfo.status != ClaimStatus.UNCLAIMED.getValue()) {
                strLJFF = new C0XI4(C632410OrH.LIZIZ(EnumC632420OrI.MUSIC_TAB_BANNER, (User) abS326S0300000_9.l0)).LJFF();
            } else {
                EnumC632420OrI enumC632420OrI = EnumC632420OrI.MUSIC_TAB_BANNER;
                ClaimStatus.Companion companion = ClaimStatus.Companion;
                MusicTabClaimInfo musicTabClaimInfo2 = musicTabInfo.musicTabClaimInfo;
                if (musicTabClaimInfo2 != null) {
                    numValueOf = Integer.valueOf(musicTabClaimInfo2.status);
                } else {
                    numValueOf = null;
                }
                strLJFF = new C0XI4(C632410OrH.LIZ(enumC632420OrI, companion.of(numValueOf))).LJFF();
            }
            SmartRouter.buildRoute(C786410Ut5.N3((Context) abS326S0300000_9.l1), strLJFF).open();
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("enter_from", "others_homepage");
            OriginMusicArg originMusicArg = (OriginMusicArg) ((MusicListArtistCertificationAssem) abS326S0300000_9.l2).LLIZLLLIL.getValue();
            if (originMusicArg == null || (userId = originMusicArg.getUserId()) == null) {
                userId = "";
            }
            c2344009Gk.LJIIIIZZ("to_user_id", userId);
            User user = (User) abS326S0300000_9.l0;
            if (user == null || (strLIZJ = C632050Oqh.LIZJ(user)) == null) {
                strLIZJ = CardStruct.IStatusCode.DEFAULT;
            }
            c2344009Gk.LJIIIIZZ(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, strLIZJ);
            C20684815ws.LJIILLIIL("apply_music_tab_click", c2344009Gk.LIZ);
        }
    }

    public static final void LIZ$1(AbS326S0300000_9 abS326S0300000_9, View view) {
        Integer numValueOf;
        MusicTabClaimInfo musicTabClaimInfo;
        if (view != null) {
            Context context = ((View) abS326S0300000_9.l0).getContext();
            EnumC632420OrI enumC632420OrI = EnumC632420OrI.GHOST_TAB;
            ClaimStatus.Companion companion = ClaimStatus.Companion;
            MusicTabInfo musicTabInfo = (MusicTabInfo) abS326S0300000_9.l1;
            if (musicTabInfo != null && (musicTabClaimInfo = musicTabInfo.musicTabClaimInfo) != null) {
                numValueOf = Integer.valueOf(musicTabClaimInfo.status);
            } else {
                numValueOf = null;
            }
            SmartRouter.buildRoute(context, new C0XI4(C632410OrH.LIZ(enumC632420OrI, companion.of(numValueOf))).LJFF()).open();
            ((ClaimStatusMusicAssem) abS326S0300000_9.l2).ip("privilege");
        }
    }

    public static final void LIZ$2(AbS326S0300000_9 abS326S0300000_9, View view) {
        Integer numValueOf;
        MusicTabClaimInfo musicTabClaimInfo;
        if (view != null) {
            Context context = ((View) abS326S0300000_9.l0).getContext();
            EnumC632420OrI enumC632420OrI = EnumC632420OrI.GHOST_TAB;
            ClaimStatus.Companion companion = ClaimStatus.Companion;
            MusicTabInfo musicTabInfo = (MusicTabInfo) abS326S0300000_9.l1;
            if (musicTabInfo != null && (musicTabClaimInfo = musicTabInfo.musicTabClaimInfo) != null) {
                numValueOf = Integer.valueOf(musicTabClaimInfo.status);
            } else {
                numValueOf = null;
            }
            ClaimStatus claimStatusOf = companion.of(numValueOf);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(C632410OrH.LIZJ().searchInputUrl);
            sbLIZ.append("&enter_from=");
            sbLIZ.append(enumC632420OrI.getFrom());
            sbLIZ.append("&user_status=");
            sbLIZ.append(claimStatusOf.getValue());
            SmartRouter.buildRoute(context, new C0XI4(C2188811AlT.LIZIZ(sbLIZ)).LJFF()).open();
            ((ClaimStatusMusicAssem) abS326S0300000_9.l2).ip("resubmit");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbS326S0300000_9(Object obj, Object obj2, Object obj3, int i) {
        super(300L);
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
    }
}
