package com.ss.android.ugc.aweme.feed.landscape.cell.assem.avatar;

import X.AbstractC1386130mAt;
import X.C01GW;
import X.C0JBR;
import X.C0O3Q;
import X.C0PSR;
import X.C0SXF;
import X.C1057880ddS;
import X.C1260910iuv;
import X.C1360540lVc;
import X.C1365450ldX;
import X.C1370890lmJ;
import X.C1388190mED;
import X.C1440005kM;
import X.C19651011uW;
import X.C1ER1;
import X.C20684815ws;
import X.C2189821An6;
import X.C328640CuU;
import X.C328650CuV;
import X.C452501pT;
import X.C584760Mwc;
import X.C666580QCq;
import X.C692450REd;
import X.C708600Rqs;
import X.C723180SYi;
import X.C734630Srl;
import X.C735340Ssu;
import X.C735350Ssv;
import X.C735370Ssx;
import X.C735610StL;
import X.C735840Sti;
import X.C737030Svd;
import X.C786410Ut5;
import X.EnumC1260920iuw;
import X.EnumC1260930iux;
import X.InterfaceC1554640qYg;
import X.InterfaceC494301wD;
import X.InterfaceC723190SYj;
import Y.ACListenerS146S0100000_11;
import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.assem.avatar.FeedAvatarAssemWrap;
import com.ss.android.ugc.aweme.feed.landscape.component.ability.LandscapeFeedVideoEventDispatcherAbility;
import com.ss.android.ugc.aweme.feed.landscape.component.ability.LandscapeFeedViewPagerAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.AwS590S0100000_11;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public class LandscapeAvatarAssem extends FeedAvatarAssemWrap implements InterfaceC723190SYj, InterfaceC1554640qYg {
    public TextView LLLII;
    public final C01GW LLLIIII = C452501pT.LIZIZ(new AwS555S0100000_11(this, 395));
    public final C01GW LLLIIIIL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 390));
    public final C01GW LLLIIIL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 394));
    public final C01GW LLLIIL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 391));
    public final C01GW LLLIILIL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 393));
    public final C01GW LLLIL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 392));

    @Override // X.InterfaceC1554640qYg
    public InterfaceC494301wD provideAbility(String str) {
        str.getClass();
        return null;
    }

    @Override // X.InterfaceC723190SYj
    public final void uc1(FollowStatus followStatus) {
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.avatar.FeedAvatarAssemWrap, com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public int Oo() {
        boolean z = C692450REd.LIZ;
        return C692450REd.LIZ ^ true ? R.layout.d0e : super.Oo();
    }

    public final String getEventType() {
        return (String) this.LLLIIL.getValue();
    }

    public final int getPageType() {
        return ((Number) this.LLLIILIL.getValue()).intValue();
    }

    public final C2189821An6 getParam() {
        return (C2189821An6) this.LLLIIIL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.avatar.FeedAvatarAssemWrap
    /* JADX INFO: renamed from: Ip */
    public final void tp(VideoItemParams videoItemParams) {
        super.tp(videoItemParams);
        TextView textView = this.LLLII;
        if (textView != null) {
            textView.setText(C1057880ddS.LIZIZ(videoItemParams.mEventType, null, videoItemParams.getAweme()));
        }
    }

    @Override // X.InterfaceC723190SYj
    public final void Uo(FollowStatus followStatus) {
        Aweme awemeLLLLLJLJLL;
        User author;
        LandscapeFeedViewPagerAbility landscapeFeedViewPagerAbility = (LandscapeFeedViewPagerAbility) this.LLLIIII.getValue();
        if (landscapeFeedViewPagerAbility != null && (awemeLLLLLJLJLL = landscapeFeedViewPagerAbility.LLLLLJLJLL()) != null && (author = awemeLLLLLJLJLL.getAuthor()) != null && author.getUid() != null) {
            if (Intrinsics.LJFF(author.getUid(), followStatus.getUserId())) {
                author.setFollowStatus(followStatus.getFollowStatus());
            }
            C1440005kM.LIZ(new C0PSR(followStatus.getFollowStatus(), author));
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.avatar.FeedAvatarAssemWrap, com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public void onViewCreated(View view) {
        super.onViewCreated(view);
        TextView textView = (TextView) view.findViewById(R.id.tvw_user_nick);
        this.LLLII = textView;
        if (textView != null) {
            C786410Ut5.T7(textView, new ACListenerS146S0100000_11(view, 16));
        }
        LandscapeFeedVideoEventDispatcherAbility landscapeFeedVideoEventDispatcherAbility = (LandscapeFeedVideoEventDispatcherAbility) this.LLLIIIIL.getValue();
        if (landscapeFeedVideoEventDispatcherAbility != null) {
            landscapeFeedVideoEventDispatcherAbility.Qu1(this, new AwS590S0100000_11(this, 141));
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.avatar.FeedAvatarAssemWrap, X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final /* bridge */ /* synthetic */ void up(VideoItemParams videoItemParams) {
        tp(videoItemParams);
    }

    @Override // X.InterfaceC723190SYj
    public final void th(Exception exc) {
        Activity activityLIZ;
        Context context = getContext();
        if (context != null) {
            activityLIZ = C1388190mED.LIZ(context);
        } else {
            activityLIZ = null;
        }
        C0O3Q.LIZ(activityLIZ, exc);
    }

    @Override // X.InterfaceC723190SYj
    public final void u41(Exception exc) {
        C723180SYi.LIZ(this, exc);
    }

    public void Jp(Aweme aweme, String str, boolean z, int i, C737030Svd c737030Svd) {
        String previousPage;
        String previousPagePosition;
        String str2;
        User author;
        boolean z2;
        String str3;
        String previousPage2;
        String str4;
        if (z && !TextUtils.isEmpty(getEventType()) && aweme != null && !TextUtils.isEmpty(aweme.getAid())) {
            C328650CuV c328650CuV = new C328650CuV(4, aweme.getAid(), System.currentTimeMillis(), getEventType());
            c328650CuV.LJ = AwemeExtKt.getAuthorUid(aweme);
            C328640CuU.LIZ(c328650CuV);
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("author_id", AwemeExtKt.getAuthorUid(aweme));
            jSONObject.put("group_id", aweme.getAid());
            jSONObject.put("enter_from", getEventType());
            jSONObject.put("impr_type", C735370Ssx.LJI(aweme));
            jSONObject.put("compilation_id", AwemeExtKt.getMixId(aweme));
            jSONObject.put("request_id", C708600Rqs.LIZ(getPageType(), aweme, "", getEventType()).optString("request_id"));
            jSONObject.put("enter_type", "normal_way");
            jSONObject.put("is_landscape_screen", String.valueOf(C0SXF.LJJIII(getContext(), aweme)));
            if (!Intrinsics.LJFF("homepage_hot", getEventType())) {
                jSONObject.put("previous_page", getParam().getEnterMethodValue());
            }
            jSONObject.put("request_id", C735370Ssx.LJIJ(getPageType(), aweme));
            jSONObject.put("is_photo", C735370Ssx.LJ(aweme));
            if (aweme.isAd()) {
                str4 = "1";
            } else {
                str4 = CardStruct.IStatusCode.DEFAULT;
            }
            jSONObject.put("is_ad", str4);
            C1370890lmJ c1370890lmJ = C1370890lmJ.LIZ;
            C735840Sti c735840Sti = C735840Sti.LIZ;
            Object objLJIIIZ = C19651011uW.LIZIZ.LJIIIZ(aweme, jSONObject);
            c735840Sti.getClass();
            C735840Sti.LIZIZ(aweme, objLJIIIZ);
            c1370890lmJ.appendCreationParams(objLJIIIZ, aweme);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        getContext();
        C20684815ws.LJIILIIL("follow", getEventType(), str, C735370Ssx.LIZJ(aweme), jSONObject);
        String previousPagePosition2 = "follow_button";
        if (z) {
            if (c737030Svd != null && !TextUtils.isEmpty(c737030Svd.LJIIJ) && (Intrinsics.LJFF("card_button", c737030Svd.LJIIJ) || Intrinsics.LJFF("expand_card", c737030Svd.LJIIJ) || Intrinsics.LJFF("small_card", c737030Svd.LJIIJ))) {
                str2 = c737030Svd.LJIIJ;
            } else {
                str2 = "main_head";
            }
            String searchResultId = getParam().getSearchResultId();
            if (aweme != null) {
                author = aweme.getAuthor();
            } else {
                author = null;
            }
            if (TextUtils.isEmpty(searchResultId)) {
                searchResultId = aweme.getAid();
            }
            if (!getParam().isCard()) {
                C1360540lVc c1360540lVc = C1360540lVc.LIZIZ;
                C735840Sti c735840Sti2 = C735840Sti.LIZ;
                C19651011uW c19651011uW = C19651011uW.LIZIZ;
                C1260910iuv c1260910iuv = new C1260910iuv(0);
                c1260910iuv.LJJIJLIJ(getEventType());
                c1260910iuv.LJJLIIIJILLIZJL = EnumC1260920iuw.ITEM;
                c1260910iuv.LJJJJLL();
                c1260910iuv.LJJLIIIJJI = EnumC1260930iux.FOLLOW;
                c1260910iuv.LJJIL(str2);
                c1260910iuv.LJIJI(aweme);
                c1260910iuv.LJJJJZI(author);
                c1260910iuv.LJLL = C0SXF.LJJIII(getContext(), aweme);
                Object objLJIIIZ2 = c19651011uW.LJIIIZ(aweme, c1260910iuv);
                c735840Sti2.getClass();
                C735840Sti.LIZIZ(aweme, objLJIIIZ2);
                ((C1260910iuv) c1360540lVc.LIZ(aweme, objLJIIIZ2)).LJJJJI();
            }
            if (aweme != null && aweme.getBottomBarModel() != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (author != null && author.getFollowerStatus() == 1) {
                str3 = "mutual";
            } else {
                str3 = "single";
            }
            Map<String, String> mapFetchSearchParams = C1ER1.LIZIZ.fetchSearchParams(getEventType(), getParam().getPreviousPage());
            C735840Sti c735840Sti3 = C735840Sti.LIZ;
            C19651011uW c19651011uW2 = C19651011uW.LIZIZ;
            C735350Ssv c735350Ssv = new C735350Ssv();
            c735350Ssv.LIZLLL = C735610StL.LIZ(getPageType(), getEventType(), true);
            if (TextUtils.isEmpty(getParam().getPreviousPage())) {
                previousPage2 = getEventType();
            } else {
                previousPage2 = getParam().getPreviousPage();
            }
            c735350Ssv.LJJLIIIJ = previousPage2;
            if (!TextUtils.isEmpty(getParam().getPreviousPage())) {
                previousPagePosition2 = getParam().getPreviousPagePosition();
            }
            c735350Ssv.LJJLIIIJILLIZJL = previousPagePosition2;
            c735350Ssv.LJJLIIIJJI = z2;
            c735350Ssv.LJJLIIJ = str2;
            c735350Ssv.LJJLIIIJJIZ = str;
            c735350Ssv.LJJIJIL(getPageType(), aweme);
            c735350Ssv.LJJIJLIJ = getParam().getSearchId();
            c735350Ssv.LJJII = searchResultId;
            c735350Ssv.LJLIIIL = i;
            c735350Ssv.LJJZZI = getParam().getChallengeId();
            c735350Ssv.LJJZZIII = getParam().getParentTagId();
            c735350Ssv.LJLJI = AwemeBizExtKt.isHighlighted(aweme);
            c735350Ssv.LJLJJI = AwemeBizExtKt.getOriginalPos(aweme);
            c735350Ssv.LJLJJLL = getParam().getCategoryName();
            C1365450ldX.LIZLLL(c735350Ssv, aweme.getAuthor());
            User author2 = aweme.getAuthor();
            c735840Sti3.getClass();
            c735350Ssv.LJJJLL = C735840Sti.LJIIIIZZ(author2);
            c735350Ssv.LJJZ = str3;
            c735350Ssv.LJJLIIIIJ = C584760Mwc.LIZ(getParam().getPreviousPage(), getParam().getFromGroupId());
            c735350Ssv.LJJII(C0JBR.LIZ(aweme, mapFetchSearchParams));
            c735350Ssv.LJLJLJ = C0SXF.LJJIII(getContext(), aweme);
            c735350Ssv.LIZIZ(C666580QCq.LIZIZ(aweme, "follow", getEventType(), null));
            Object objLJIIIZ3 = c19651011uW2.LJIIIZ(aweme, c735350Ssv);
            C735840Sti.LIZIZ(aweme, objLJIIIZ3);
            AbstractC1386130mAt abstractC1386130mAt = (AbstractC1386130mAt) objLJIIIZ3;
            C0SXF.LJIIIIZZ(abstractC1386130mAt, aweme, getContext(), false);
            C734630Srl.LIZIZ(abstractC1386130mAt, getParam());
            abstractC1386130mAt.LJIILJJIL();
            return;
        }
        C735340Ssu c735340Ssu = new C735340Ssu();
        c735340Ssu.LIZLLL = C735610StL.LIZ(getPageType(), getEventType(), true);
        if (TextUtils.isEmpty(getParam().getPreviousPage())) {
            previousPage = getEventType();
        } else {
            previousPage = getParam().getPreviousPage();
        }
        c735340Ssu.LJJLIIIJ = previousPage;
        if (TextUtils.isEmpty(getParam().getPreviousPage())) {
            previousPagePosition = "follow_button";
        } else {
            previousPagePosition = getParam().getPreviousPagePosition();
        }
        c735340Ssu.LJJLIIIJILLIZJL = previousPagePosition;
        c735340Ssu.LJJLIIIJLJLI = "follow_button";
        c735340Ssu.LJJLIIIJJI = str;
        c735340Ssu.LJJIJIL(getPageType(), aweme);
        c735340Ssu.LJIILJJIL();
    }
}
