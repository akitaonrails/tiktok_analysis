package kotlin.jvm.internal;

import X.C09AY;
import X.C20612815lG;
import X.C20622915mt;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.assem.arch.core.UIAssem;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.base.ui.assem.MentionContainerAssem;
import com.ss.android.ugc.aweme.discover.model.suggest.Word;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.search.model.SearchSugEntity;
import com.ss.android.ugc.aweme.tag.viewmodel.VideoTagFriendsListViewModel;
import com.ss.android.ugc.aweme.tag.viewmodel.VideoTagSearchListViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes32.dex */
public class AwS24S1201000_31 extends C09AY implements Function1 {
    public final int $t;
    public int i3;
    public Object l1;
    public Object l2;
    public String s0;

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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS24S1201000_31 awS24S1201000_31, Object obj) {
        MentionContainerAssem mentionContainerAssem = new MentionContainerAssem();
        mentionContainerAssem.LLJJI = (C20612815lG) awS24S1201000_31.l2;
        ((Assembler) obj).RQ2((UIAssem) awS24S1201000_31.l1, new C20622915mt(awS24S1201000_31.i3, mentionContainerAssem, awS24S1201000_31.s0));
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS24S1201000_31 awS24S1201000_31, Object obj) throws JSONException {
        String wordSource;
        JSONObject jSONObject = (JSONObject) obj;
        jSONObject.put("search_position", "tag_user");
        String str = "";
        jSONObject.put("new_sug_session_id", "");
        String str2 = awS24S1201000_31.s0;
        if (str2 != null) {
            str = str2;
        }
        jSONObject.put("impr_id", str);
        jSONObject.put("raw_query", ((VideoTagSearchListViewModel) awS24S1201000_31.l1).LLILZLL);
        jSONObject.put("sug_user_id", ((SearchSugEntity) awS24S1201000_31.l2).sugExtraInfo.getUserId());
        jSONObject.put("user_tag", ((SearchSugEntity) awS24S1201000_31.l2).sugExtraInfo.getUserRelationType());
        int i = awS24S1201000_31.i3;
        if (i < 0) {
            i = 0;
        }
        jSONObject.put("words_position", i);
        Word word = ((SearchSugEntity) awS24S1201000_31.l2).mWord;
        String id = null;
        if (word != null) {
            wordSource = word.getWordSource();
        } else {
            wordSource = null;
        }
        jSONObject.put("words_source", wordSource);
        Word word2 = ((SearchSugEntity) awS24S1201000_31.l2).mWord;
        if (word2 != null) {
            id = word2.getId();
        }
        jSONObject.put("group_id", id);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS24S1201000_31 awS24S1201000_31, Object obj) throws JSONException {
        String wordSource;
        JSONObject jSONObject = (JSONObject) obj;
        jSONObject.put("search_position", "tag_user");
        String str = "";
        jSONObject.put("new_sug_session_id", "");
        String str2 = awS24S1201000_31.s0;
        if (str2 != null) {
            str = str2;
        }
        jSONObject.put("impr_id", str);
        jSONObject.put("raw_query", ((VideoTagSearchListViewModel) awS24S1201000_31.l1).LLILZLL);
        jSONObject.put("sug_user_id", ((SearchSugEntity) awS24S1201000_31.l2).sugExtraInfo.getUserId());
        jSONObject.put("user_tag", ((SearchSugEntity) awS24S1201000_31.l2).sugExtraInfo.getUserRelationType());
        int i = awS24S1201000_31.i3;
        if (i < 0) {
            i = 0;
        }
        jSONObject.put("words_position", i);
        Word word = ((SearchSugEntity) awS24S1201000_31.l2).mWord;
        String id = null;
        if (word != null) {
            wordSource = word.getWordSource();
        } else {
            wordSource = null;
        }
        jSONObject.put("words_source", wordSource);
        Word word2 = ((SearchSugEntity) awS24S1201000_31.l2).mWord;
        if (word2 != null) {
            id = word2.getId();
        }
        jSONObject.put("group_id", id);
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS24S1201000_31 awS24S1201000_31, Object obj) throws JSONException {
        JSONObject jSONObject = (JSONObject) obj;
        jSONObject.put("previous_page", ((VideoTagFriendsListViewModel) awS24S1201000_31.l1).vQ2().getEnterFrom());
        jSONObject.put("to_user_id", ((IMUser) awS24S1201000_31.l2).getUid());
        jSONObject.put("click_type", awS24S1201000_31.s0);
        jSONObject.put("user_type", ((VideoTagFriendsListViewModel) awS24S1201000_31.l1).yQ2((IMUser) awS24S1201000_31.l2));
        jSONObject.put("search_keyword", "");
        jSONObject.put("function", "tag");
        jSONObject.put(Scene.SCENE_SERVICE, "video_tag");
        jSONObject.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, awS24S1201000_31.i3);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS24S1201000_31(int i, UIAssem uIAssem, C20612815lG c20612815lG, String str, int i2) {
        super(1);
        this.$t = i2;
        this.l1 = uIAssem;
        this.l2 = c20612815lG;
        this.i3 = i;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS24S1201000_31(VideoTagFriendsListViewModel videoTagFriendsListViewModel, IMUser iMUser, String str, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l1 = videoTagFriendsListViewModel;
        this.l2 = iMUser;
        this.s0 = str;
        this.i3 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS24S1201000_31(String str, VideoTagSearchListViewModel videoTagSearchListViewModel, SearchSugEntity searchSugEntity, int i, int i2) {
        super(1);
        this.$t = i2;
        this.s0 = str;
        this.l1 = videoTagSearchListViewModel;
        this.l2 = searchSugEntity;
        this.i3 = i;
    }
}
