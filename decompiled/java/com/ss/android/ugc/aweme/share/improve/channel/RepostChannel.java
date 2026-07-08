package com.ss.android.ugc.aweme.share.improve.channel;

import X.AbstractC1375550ltp;
import X.C01GW;
import X.C0M7Y;
import X.C0SUC;
import X.C1295960jpS;
import X.C1359720lUI;
import X.C1402380mb6;
import X.C1ER1;
import X.C20684815ws;
import X.C2211631BhB;
import X.C419910GdJ;
import X.C452501pT;
import X.C735370Ssx;
import X.InterfaceC1361560lXG;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.scene.Scene;
import com.bytedance.tux.widget.RadiusLayout;
import com.ss.android.ugc.aweme.channel.share.model.PureLogicChannel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.RecReasonEntry;
import com.ss.android.ugc.aweme.feed.model.RecReasonsStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.poi_api.service.IPoiService;
import com.ss.android.ugc.aweme.upvote.event.UpvotePublishExtraData;
import com.ss.android.ugc.aweme.upvote.event.UpvotePublishMobParam;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS209S0000000_21;

/* JADX INFO: loaded from: classes22.dex */
public final class RepostChannel extends PureLogicChannel {
    public final Aweme LL;
    public final Context LLILLJJLI;
    public final Bundle LLILLL;
    public boolean LLILZ;
    public final C01GW LLILZIL = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(550));

    @Override // X.InterfaceC1369790lkX
    public final boolean LJIILLIIL(Context context, AbstractC1375550ltp abstractC1375550ltp) {
        return true;
    }

    @Override // X.InterfaceC1369790lkX
    public final Drawable LJJII(Context context, boolean z) {
        return null;
    }

    @Override // X.InterfaceC1369790lkX
    public final String key() {
        return "repost";
    }

    public final int LIZ() {
        String aid = this.LL.getAid();
        if (aid == null) {
            return 1;
        }
        return LJ().LJIILIIL(aid);
    }

    public final InterfaceC1361560lXG LJ() {
        return (InterfaceC1361560lXG) this.LLILZIL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.channel.share.model.PureLogicChannel, X.InterfaceC1369790lkX
    public final boolean LIZJ() {
        return LIZ() == 1 || LIZ() == 3;
    }

    @Override // X.InterfaceC1369790lkX
    public final String label() {
        return this.LLILLJJLI.getString((LIZ() == 0 || LIZ() == 1) ? LJ().LJII() : LJ().LJIIJ());
    }

    @Override // com.ss.android.ugc.aweme.channel.share.model.PureLogicChannel, X.InterfaceC1369790lkX
    public final void LJJIIJZLJL(int i) {
        int i2;
        String str;
        if (!this.LLILZ) {
            String aid = this.LL.getAid();
            if (aid != null && (LIZ() == 0 || LIZ() == 2)) {
                Pair[] pairArr = new Pair[5];
                pairArr[0] = new Pair(this.LLILLL.getString("event_type", ""), "enter_from");
                if (LIZ() == 0) {
                    i2 = -1;
                } else {
                    i2 = 1;
                }
                pairArr[1] = new Pair(Integer.valueOf(i2), "reposted");
                pairArr[2] = new Pair(aid, "group_id");
                pairArr[3] = new Pair(this.LLILLL.getString("panel_source", ""), "panel_source");
                if (C1359720lUI.LJFF(this.LL)) {
                    str = "fifa_world_cup";
                } else {
                    str = "normal";
                }
                pairArr[4] = new Pair(str, Scene.SCENE_SERVICE);
                C20684815ws.LJIJI("repost_button_show", pairArr);
            }
            this.LLILZ = true;
        }
    }

    @Override // com.ss.android.ugc.aweme.channel.share.model.PureLogicChannel, X.InterfaceC1369790lkX
    public final void LJJIJIL(View view, boolean z) {
        C1295960jpS c1295960jpS;
        int i;
        if ((view instanceof ViewGroup) && view != null && (c1295960jpS = (C1295960jpS) view.findViewById(R.id.av1)) != null) {
            C2211631BhB.LIZJ(c1295960jpS, new C1402380mb6(this, 1));
            if (z) {
                i = R.dimen.az;
            } else {
                i = R.dimen.b4;
            }
            float dimensionPixelSize = this.LLILLJJLI.getResources().getDimensionPixelSize(i);
            RadiusLayout radiusLayout = (RadiusLayout) view.findViewById(R.id.kc7);
            if (radiusLayout != null) {
                radiusLayout.LIZ(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
            }
            if (LIZ() != 0 && LIZ() != 1) {
                C419910GdJ c419910GdJ = new C419910GdJ();
                c419910GdJ.LIZ = LJ().LJFF();
                c1295960jpS.setImageDrawable(c419910GdJ.LIZ(c1295960jpS.getContext()));
                return;
            }
            C419910GdJ c419910GdJ2 = new C419910GdJ();
            c419910GdJ2.LIZ = LJ().LIZIZ();
            c1295960jpS.setImageDrawable(c419910GdJ2.LIZ(c1295960jpS.getContext()));
            if (LJ().LJIILL()) {
                return;
            }
            c1295960jpS.setImageDrawable(null);
            c1295960jpS.setAnimation(LJ().LJIIJJI());
            c1295960jpS.setRepeatCount(LJ().LJIIIIZZ());
            c1295960jpS.playAnimation();
            LJ().LIZJ();
        }
    }

    public RepostChannel(Context context, Bundle bundle, Aweme aweme) {
        this.LL = aweme;
        this.LLILLJJLI = context;
        this.LLILLL = bundle;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC1369790lkX
    public final boolean LJJIIJ(AbstractC1375550ltp abstractC1375550ltp, Context context, C0M7Y c0m7y) {
        String aid = this.LL.getAid();
        if (aid == null) {
            return false;
        }
        String string = this.LLILLL.getString("event_type", "");
        String authorUid = AwemeExtKt.getAuthorUid(this.LL);
        String strLJIIJ = C735370Ssx.LJIIJ(this.LL);
        String string2 = this.LLILLL.getString("panel_source", "");
        String strValueOf = String.valueOf(this.LL.getAwemeType());
        boolean zLJJIIJ = C735370Ssx.LJJIIJ(this.LL);
        RecReasonEntry recReasonTag = this.LL.getRecReasonTag();
        RecReasonsStruct recReasonsStruct = this.LL.getRecReasonsStruct();
        String string3 = this.LLILLL.getString("from_page", "");
        String strLLIFFJFJJ = ((IPoiService) ServiceManager.get().getService(IPoiService.class)).LLIFFJFJJ(this.LL);
        String string4 = this.LLILLL.getString("tab_name", "");
        String homepageUid = C0SUC.LIZ(context).getHomepageUid();
        if (homepageUid == null) {
            homepageUid = "";
        }
        String homepageUid2 = C0SUC.LIZ(context).getHomepageUid();
        if (homepageUid2 == null) {
            homepageUid2 = "";
        }
        String requestId = this.LL.getRequestId();
        if (requestId == null) {
            requestId = "";
        }
        UpvotePublishMobParam upvotePublishMobParam = new UpvotePublishMobParam(string, null, aid, authorUid, strLJIIJ, 0 == true ? 1 : 0, string2, false, 0 == true ? 1 : 0, strValueOf, zLJJIIJ, recReasonTag, recReasonsStruct, string3, strLLIFFJFJJ, 0.0d, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, string4, 0 == true ? 1 : 0, homepageUid, homepageUid2, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, requestId, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, -1076949534, 64975);
        Map<String, String> mapI = C1ER1.LIZIZ.I(this.LL, this.LLILLL.getString("event_type", ""));
        if (!mapI.isEmpty()) {
            if (mapI.containsKey("search_keyword")) {
                upvotePublishMobParam.searchKeyword = mapI.get("search_keyword");
            }
            if (mapI.containsKey("search_type")) {
                upvotePublishMobParam.searchType = mapI.get("search_type");
            }
            if (mapI.containsKey("search_id")) {
                upvotePublishMobParam.searchId = mapI.get("search_id");
            }
            if (mapI.containsKey("search_result_id")) {
                upvotePublishMobParam.searchResultId = mapI.get("search_result_id");
            }
        }
        LJ().LJIIL(new UpvotePublishExtraData(this.LL, this.LLILLL.getInt("page_type", -1)), upvotePublishMobParam, aid, null);
        return true;
    }
}
