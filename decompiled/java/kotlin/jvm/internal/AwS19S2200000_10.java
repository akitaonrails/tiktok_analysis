package kotlin.jvm.internal;

import X.C09AY;
import X.C123100dR;
import X.C13BV;
import X.C13LP;
import X.C676190Qfh;
import android.view.View;
import com.bytedance.assem.arch.core.Assembler;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.ecommerce.search.vision.PhotoSearchBaseVM;
import com.ss.android.ugc.aweme.fangroup.fragment.FanGroupListSelfFragment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.tako.ccl.model.api.BaseImage;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoBlockInfo;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoCertInfo;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoFollowInfo;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoMixFeed;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoPrivateInfo;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoRelationInfo;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoUserItem;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoVideoItem;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class AwS19S2200000_10 extends C09AY implements Function1 {
    public final int $t;
    public Object l2;
    public Object l3;
    public String s0;
    public String s1;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS19S2200000_10 awS19S2200000_10, Object obj) {
        Assembler assembler = (Assembler) obj;
        assembler.DQ2((FanGroupListSelfFragment) awS19S2200000_10.l2, new AwS18S2000000_19(awS19S2200000_10.s0, awS19S2200000_10.s1, 1));
        assembler.RQ2((FanGroupListSelfFragment) awS19S2200000_10.l2, AFwS241S0000000_10.get$arr$(89));
        assembler.RQ2((FanGroupListSelfFragment) awS19S2200000_10.l2, AFwS241S0000000_10.get$arr$(90));
        assembler.QQ2((FanGroupListSelfFragment) awS19S2200000_10.l2, new AwS589S0100000_10((View) awS19S2200000_10.l3, 101));
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS19S2200000_10 awS19S2200000_10, Object obj) {
        long diggCount;
        List<String> urlList;
        UrlModel cover;
        TakoMixFeed takoMixFeed = (TakoMixFeed) obj;
        String str = awS19S2200000_10.s0;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        takoMixFeed.text = str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String str3 = awS19S2200000_10.s1;
        if (C123100dR.LIZ(str3)) {
            linkedHashMap.put("multi_language_interfere_key", str3);
        }
        takoMixFeed.msgExt = linkedHashMap;
        Aweme aweme = (Aweme) awS19S2200000_10.l2;
        if (aweme != null) {
            String aid = aweme.getAid();
            if (aid != null) {
                str2 = aid;
            }
            AwemeStatistics statistics = aweme.getStatistics();
            if (statistics != null) {
                diggCount = statistics.getDiggCount();
            } else {
                diggCount = 0;
            }
            Video video = aweme.getVideo();
            if (video == null || (cover = video.getCover()) == null || (urlList = cover.getUrlList()) == null) {
                urlList = C13BV.INSTANCE;
            }
            takoMixFeed.videoList = Collections.singletonList(new TakoVideoItem(str2, diggCount, new BaseImage(null, null, urlList, null, 0, 0, null, null, null, null, null, null, null, null, null, 0, 0, null, 262139, null), new TakoUserItem(0L, "", "", new BaseImage(null, null, null, null, 0, 0, null, null, null, null, null, null, null, null, null, 0, 0, null, 262143, null), "", new TakoCertInfo(false, ""), new TakoRelationInfo(new TakoBlockInfo(false, false), new TakoFollowInfo(-1, -1, 0)), new TakoPrivateInfo(false)), "", 0L, Integer.valueOf(aweme.getAwemeType()), null, new LinkedHashMap(), aweme, null));
        }
        List<TakoVideoItem> list = (List) awS19S2200000_10.l3;
        if (list != null && (!list.isEmpty())) {
            takoMixFeed.videoList = list;
        }
        takoMixFeed.cardType = 1009;
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS19S2200000_10 awS19S2200000_10, Object obj) throws JSONException {
        boolean z;
        String strXQ2;
        List<String> list;
        JSONObject jSONObject = (JSONObject) obj;
        jSONObject.put("words_source", "photo_search");
        jSONObject.put("words_position", ((Integer) awS19S2200000_10.l2).intValue());
        jSONObject.put("entity_coord", awS19S2200000_10.s0);
        PhotoSearchBaseVM photoSearchBaseVM = ((C676190Qfh) awS19S2200000_10.l3).LLILZ;
        if (photoSearchBaseVM != null && (list = photoSearchBaseVM.LLJ) != null && C13LP.LJJJJ(awS19S2200000_10.s0, list)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            jSONObject.put("is_user_add", 0);
        } else {
            jSONObject.put("is_user_add", 1);
        }
        PhotoSearchBaseVM photoSearchBaseVM2 = ((C676190Qfh) awS19S2200000_10.l3).LLILZ;
        String str = null;
        if (photoSearchBaseVM2 != null) {
            strXQ2 = photoSearchBaseVM2.xQ2(null);
        } else {
            strXQ2 = null;
        }
        jSONObject.put("raw_pic", strXQ2);
        PhotoSearchBaseVM photoSearchBaseVM3 = ((C676190Qfh) awS19S2200000_10.l3).LLILZ;
        if (photoSearchBaseVM3 != null) {
            str = photoSearchBaseVM3.LLJJIJI;
        }
        jSONObject.put("first_photo_search_id", str);
        jSONObject.put("click_type", awS19S2200000_10.s1);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS19S2200000_10(FanGroupListSelfFragment fanGroupListSelfFragment, String str, String str2, View view, int i) {
        super(1);
        this.$t = i;
        this.l2 = fanGroupListSelfFragment;
        this.s0 = str;
        this.s1 = str2;
        this.l3 = view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS19S2200000_10(Aweme aweme, String str, String str2, List list, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l2 = aweme;
        this.l3 = list;
        this.s1 = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS19S2200000_10(Integer num, String str, C676190Qfh c676190Qfh, String str2, int i) {
        super(1);
        this.$t = i;
        this.l2 = num;
        this.s0 = str;
        this.l3 = c676190Qfh;
        this.s1 = str2;
    }
}
