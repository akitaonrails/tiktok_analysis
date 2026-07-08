package com.ss.android.ugc.aweme.music.ghost;

import X.C1397510mTF;
import X.C1397580mTM;
import X.C1559260qg8;
import X.C197039127h;
import X.C20684815ws;
import X.C2277881EDy;
import X.C2344009Gk;
import X.C631230OpN;
import X.C632050Oqh;
import X.C632430OrJ;
import X.C723580SZw;
import X.C786410Ut5;
import X.C985403tE;
import X.InterfaceC633950Otl;
import android.content.Context;
import android.text.Html;
import android.view.View;
import android.widget.TextView;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.music.OriginMusicArg;
import com.ss.android.ugc.aweme.profile.IProfileAssemService;
import com.ss.android.ugc.aweme.profile.model.ClaimStatus;
import com.ss.android.ugc.aweme.profile.model.MusicTabClaimInfo;
import com.ss.android.ugc.aweme.profile.model.MusicTabInfo;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS375S0200000_9;
import kotlin.jvm.internal.AwS588S0100000_9;
import wh6.AbS326S0300000_9;
import wh6.AbS691S0100000_9;

/* JADX INFO: loaded from: classes10.dex */
public final class ClaimStatusMusicAssem extends UISlotAssem implements InterfaceC633950Otl {
    public static final C632430OrJ LLJJIJI = new Object() { // from class: X.0OrJ
    };
    public static final int LLJJIJIIJIL = 8;
    public final C1559260qg8 LLJJI = new C1559260qg8(new C723580SZw(this, OriginMusicArg.class, null), checkSupervisorPrepared());
    public User LLJJIII;

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public int Co() {
        return R.layout.ee3;
    }

    @Override // X.InterfaceC633950Otl, X.InterfaceC723730SaB
    public /* bridge */ /* synthetic */ String LIZ() {
        return null;
    }

    private final OriginMusicArg hp() {
        return (OriginMusicArg) this.LLJJI.getValue();
    }

    @Override // X.InterfaceC633950Otl
    public void LLLZ() {
        String strLIZJ;
        User user = this.LLJJIII;
        if (user == null || !C632050Oqh.LJFF(user)) {
            return;
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        String str = CardStruct.IStatusCode.DEFAULT;
        c2344009Gk.LJIIIIZZ("red_dot", CardStruct.IStatusCode.DEFAULT);
        User user2 = this.LLJJIII;
        if (user2 != null && (strLIZJ = C632050Oqh.LIZJ(user2)) != null) {
            str = strLIZJ;
        }
        c2344009Gk.LJIIIIZZ(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, str);
        c2344009Gk.LJIIIIZZ("tab_name", "ghost_music_tab");
        C20684815ws.LJIILLIIL("ghost_music_tab_show", c2344009Gk.LIZ);
    }

    @Override // X.InterfaceC633950Otl
    public void u0() {
        String strLIZJ;
        User user = this.LLJJIII;
        if (user == null || !C632050Oqh.LJFF(user)) {
            return;
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        String str = CardStruct.IStatusCode.DEFAULT;
        c2344009Gk.LJIIIIZZ("red_dot", CardStruct.IStatusCode.DEFAULT);
        User user2 = this.LLJJIII;
        if (user2 != null && (strLIZJ = C632050Oqh.LIZJ(user2)) != null) {
            str = strLIZJ;
        }
        c2344009Gk.LJIIIIZZ(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, str);
        c2344009Gk.LJIIIIZZ("tab_name", "ghost_music_tab");
        C20684815ws.LJIILLIIL("ghost_music_tab_click", c2344009Gk.LIZ);
    }

    public final void lp() {
        Context context = getContext();
        if (context != null) {
            C1397580mTM c1397580mTM = new C1397580mTM(context);
            c1397580mTM.LJFF(2131826691);
            c1397580mTM.LIZIZ(Html.fromHtml(context.getResources().getString(2131826690)));
            C985403tE.LIZ(c1397580mTM, new AwS588S0100000_9(this, 289));
            new C1397510mTF(c1397580mTM).LIZLLL();
        }
    }

    public final void ip(String str) {
        String strLIZJ;
        C2344009Gk c2344009Gk = new C2344009Gk();
        String str2 = CardStruct.IStatusCode.DEFAULT;
        c2344009Gk.LJIIIIZZ("red_dot", CardStruct.IStatusCode.DEFAULT);
        c2344009Gk.LJIIIIZZ("name", str);
        User user = this.LLJJIII;
        if (user != null && (strLIZJ = C632050Oqh.LIZJ(user)) != null) {
            str2 = strLIZJ;
        }
        c2344009Gk.LJIIIIZZ(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, str2);
        c2344009Gk.LJIIIIZZ("tab_name", "ghost_music_tab");
        C20684815ws.LJIILLIIL("ghost_button_click", c2344009Gk.LIZ);
    }

    public final void kp(String str) {
        String strLIZJ;
        C2344009Gk c2344009Gk = new C2344009Gk();
        String str2 = CardStruct.IStatusCode.DEFAULT;
        c2344009Gk.LJIIIIZZ("red_dot", CardStruct.IStatusCode.DEFAULT);
        c2344009Gk.LJIIIIZZ("name", str);
        User user = this.LLJJIII;
        if (user != null && (strLIZJ = C632050Oqh.LIZJ(user)) != null) {
            str2 = strLIZJ;
        }
        c2344009Gk.LJIIIIZZ(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, str2);
        c2344009Gk.LJIIIIZZ("tab_name", "ghost_music_tab");
        C20684815ws.LJIILLIIL("ghost_toast_click", c2344009Gk.LIZ);
    }

    public final void mp(View view) {
        MusicTabInfo musicTabInfo;
        MusicTabClaimInfo musicTabClaimInfo;
        MusicTabClaimInfo musicTabClaimInfo2;
        MusicTabClaimInfo musicTabClaimInfo3;
        String str;
        MusicTabClaimInfo musicTabClaimInfo4;
        MusicTabClaimInfo musicTabClaimInfo5;
        String str2;
        String str3;
        MusicTabClaimInfo musicTabClaimInfo6;
        boolean z;
        MusicTabClaimInfo musicTabClaimInfo7;
        User user = this.LLJJIII;
        if (user != null && C632050Oqh.LJFF(user)) {
            User user2 = this.LLJJIII;
            String str4 = null;
            if (user2 != null) {
                musicTabInfo = user2.getMusicTabInfo();
            } else {
                musicTabInfo = null;
            }
            C631230OpN.LIZJ(view);
            TuxIconView tuxIconView = (TuxIconView) view.findViewById(R.id.iv6);
            if (tuxIconView != null) {
                if (musicTabInfo != null && (musicTabClaimInfo7 = musicTabInfo.musicTabClaimInfo) != null && musicTabClaimInfo7.status == ClaimStatus.UNDER_REVIEW.getValue()) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    tuxIconView.setIconRes(R.raw.icon_2pt_clock);
                    tuxIconView.setTintColorRes(R.attr.a1p);
                } else {
                    tuxIconView.setIconRes(R.raw.icon_2pt_exclamation_mark_circle);
                    tuxIconView.setTintColorRes(R.attr.a1p);
                }
            }
            TextView textView = (TextView) view.findViewById(R.id.iv5);
            if (textView != null) {
                if (musicTabInfo != null && (musicTabClaimInfo5 = musicTabInfo.musicTabClaimInfo) != null && (str2 = musicTabClaimInfo5.desc) != null && str2.length() != 0) {
                    C631230OpN.LIZJ(textView);
                    if (musicTabInfo != null && (musicTabClaimInfo6 = musicTabInfo.musicTabClaimInfo) != null) {
                        str3 = musicTabClaimInfo6.title;
                    } else {
                        str3 = null;
                    }
                    textView.setText(str3);
                } else {
                    C631230OpN.LIZ(textView);
                }
            }
            TextView textView2 = (TextView) view.findViewById(R.id.iv7);
            if (textView2 != null) {
                if (musicTabInfo != null && (musicTabClaimInfo3 = musicTabInfo.musicTabClaimInfo) != null && (str = musicTabClaimInfo3.desc) != null && str.length() != 0) {
                    C631230OpN.LIZJ(textView2);
                    if (musicTabInfo != null && (musicTabClaimInfo4 = musicTabInfo.musicTabClaimInfo) != null) {
                        str4 = musicTabClaimInfo4.desc;
                    }
                    textView2.setText(str4);
                } else {
                    C631230OpN.LIZ(textView2);
                }
            }
            C197039127h c197039127h = (C197039127h) view.findViewById(R.id.p4j);
            if (c197039127h != null) {
                c197039127h.setButtonVariant(1);
                if (musicTabInfo != null && (musicTabClaimInfo2 = musicTabInfo.musicTabClaimInfo) != null && musicTabClaimInfo2.status == ClaimStatus.UNDER_REVIEW.getValue()) {
                    C631230OpN.LIZ(c197039127h);
                } else {
                    C631230OpN.LIZJ(c197039127h);
                    C786410Ut5.I7(new AbS691S0100000_9(this, 22, 42), c197039127h);
                }
            }
            TextView textView3 = (TextView) view.findViewById(R.id.rik);
            if (textView3 != null) {
                if (musicTabInfo != null && (musicTabClaimInfo = musicTabInfo.musicTabClaimInfo) != null && musicTabClaimInfo.status == ClaimStatus.UNDER_REVIEW.getValue()) {
                    textView3.setText(2131826698);
                    C786410Ut5.I7(new AbS326S0300000_9(view, musicTabInfo, this, 1), textView3);
                } else {
                    textView3.setText(2131826699);
                    C786410Ut5.I7(new AbS326S0300000_9(view, musicTabInfo, this, 2), textView3);
                }
            }
            view.requestLayout();
            return;
        }
        C631230OpN.LIZ(view);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public void onViewCreated(View view) {
        User user;
        super.onViewCreated(view);
        OriginMusicArg originMusicArgHp = hp();
        if (originMusicArgHp != null) {
            user = originMusicArgHp.getUser();
        } else {
            user = null;
        }
        this.LLJJIII = user;
        IProfileAssemService profileAssemService = C2277881EDy.LIZIZ.getProfileAssemService();
        if (profileAssemService != null) {
            profileAssemService.selectSubscribeProfileInfoServiceUserUpdateEvent(this, new AwS375S0200000_9(this, view, 63));
        }
    }
}
