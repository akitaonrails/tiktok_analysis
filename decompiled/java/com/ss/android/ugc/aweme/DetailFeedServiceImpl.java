package com.ss.android.ugc.aweme;

import X.C0SZ8;
import X.C0T0K;
import X.C0WZX;
import X.C1177190gjt;
import X.C1600700rky;
import X.C1606420ruC;
import X.C1607950rwf;
import X.C1701330uNH;
import X.C19EG;
import X.C2097608Jq;
import X.C2189821An6;
import X.C2189831An7;
import X.C2204961BRm;
import X.C276520Asc;
import X.C603820NmG;
import X.C638660P3g;
import X.C786410Ut5;
import X.C838410Wul;
import X.InterfaceC665370Q7z;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.detail.api.DetailApi;
import com.ss.android.ugc.aweme.detail.model.BatchDetailList;
import com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel;
import com.ss.android.ugc.aweme.detail.platform.IDetailPageAbility;
import com.ss.android.ugc.aweme.detail.ui.DetailActivity;
import com.ss.android.ugc.aweme.detail.ui.DetailFragment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes25.dex */
public class DetailFeedServiceImpl implements DetailFeedService {
    @Override // com.ss.android.ugc.aweme.DetailFeedService
    public final boolean LJIJ() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.DetailFeedService
    public final void LJIJJ() {
        if (C1177190gjt.LIZ && C276520Asc.LIZ()) {
            ((C603820NmG) C1177190gjt.LIZIZ.getValue()).LJIIIZ(-1);
            C1177190gjt.LIZ = false;
        }
    }

    @Override // com.ss.android.ugc.aweme.DetailFeedService
    public final boolean LJIILLIIL() {
        return C276520Asc.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.DetailFeedService
    public final Class<? extends Activity> LJIJJLI() {
        return DetailActivity.class;
    }

    @Override // com.ss.android.ugc.aweme.DetailFeedService
    public final boolean LIZ(Context context) {
        return context instanceof DetailActivity;
    }

    @Override // com.ss.android.ugc.aweme.DetailFeedService
    public final Aweme LIZLLL(String str) {
        return DetailApi.LIZ(1, 0, str, "");
    }

    @Override // com.ss.android.ugc.aweme.DetailFeedService
    public final Aweme LJ(String str) {
        String str2 = DetailApi.LIZ;
        boolean zLJI = MethodIDManager.LJI(137886);
        Aweme awemeLIZ = DetailApi.LIZ(0, 1, str, "");
        if (zLJI) {
            MethodIDManager.LJ();
        }
        return awemeLIZ;
    }

    @Override // com.ss.android.ugc.aweme.DetailFeedService
    public final Fragment LJFF(Object obj) {
        if (obj instanceof DetailActivity) {
            return ((DetailActivity) obj).Bc();
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.DetailFeedService
    public final Long LJI(Fragment fragment) {
        IDetailPageAbility iDetailPageAbilityLIZ;
        if (fragment != null && (iDetailPageAbilityLIZ = C1600700rky.LIZ(fragment)) != null) {
            return Long.valueOf(iDetailPageAbilityLIZ.VN1());
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.DetailFeedService
    public final C2189821An6 LJII(C19EG c19eg) {
        return C2189831An7.LIZLLL(c19eg, c19eg.getIntent());
    }

    @Override // com.ss.android.ugc.aweme.DetailFeedService
    public final Map<String, View> LJIIIIZZ(View view) {
        View viewFindViewById = view.findViewById(R.id.ltz);
        View viewFindViewById2 = view.findViewById(R.id.vsb_search_bar);
        Map<String, View> mapLJIIJ = C2097608Jq.LJIIJ(new Pair("search_icon_in_feed", viewFindViewById));
        if (viewFindViewById2 != null) {
            mapLJIIJ.put("search_bar_in_feed", viewFindViewById2);
        }
        return mapLJIIJ;
    }

    @Override // com.ss.android.ugc.aweme.DetailFeedService
    public final InterfaceC665370Q7z LJIIIZ(Fragment fragment) {
        IDetailPageAbility iDetailPageAbilityLIZ;
        DetailFragmentPanel detailFragmentPanelJQ;
        C0SZ8 c0sz8LJLIL;
        if (fragment != null && (iDetailPageAbilityLIZ = C1600700rky.LIZ(fragment)) != null && (detailFragmentPanelJQ = iDetailPageAbilityLIZ.JQ()) != null && (c0sz8LJLIL = detailFragmentPanelJQ.LJLIL()) != null) {
            return C0T0K.LIZ(c0sz8LJLIL);
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.DetailFeedService
    public final Fragment LJIILL(Activity activity) {
        C2189821An6 c2189821An6LIZLLL = C2189831An7.LIZLLL(activity, activity.getIntent());
        Bundle bundle = new Bundle();
        C786410Ut5.LJJIZ(bundle, "feed_param", c2189821An6LIZLLL);
        DetailFragment detailFragment = new DetailFragment();
        detailFragment.setArguments(bundle);
        return detailFragment;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [X.0ru9, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment] */
    @Override // com.ss.android.ugc.aweme.DetailFeedService
    public final String LJIIZILJ(Object obj) {
        ?? r0;
        Aweme awemeLJIIIIZZ;
        String groupId;
        if (obj instanceof DetailActivity) {
            DetailActivity detailActivity = (DetailActivity) obj;
            if (detailActivity.LLLLZIL() == null || (r0 = detailActivity.LLLLZIL().LLJJ) == 0 || (awemeLJIIIIZZ = r0.LJIIIIZZ()) == null || (groupId = awemeLJIIIIZZ.getGroupId()) == null) {
                return "";
            }
            return groupId;
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.DetailFeedService
    public final View LJIJI(View view) {
        if (view == null) {
            return null;
        }
        return view.findViewById(R.id.ija);
    }

    @Override // com.ss.android.ugc.aweme.DetailFeedService
    public final BatchDetailList LIZJ(String str, String str2) {
        return DetailApi.LIZJ(0, str, 0, null, str2, 0, null);
    }

    @Override // com.ss.android.ugc.aweme.DetailFeedService
    public final Aweme LJIIJ(String str, String str2) {
        return DetailApi.LIZ(0, 0, str, str2);
    }

    @Override // com.ss.android.ugc.aweme.DetailFeedService
    public final void LJIIJJI(C19EG c19eg, boolean z) {
        if (c19eg != null) {
            C638660P3g.LIZ(c19eg).LL.setValue(Boolean.valueOf(z));
        }
    }

    @Override // com.ss.android.ugc.aweme.DetailFeedService
    public final BatchDetailList LJIILIIL(int i, String str) {
        return DetailApi.LIZJ(i, str, 0, null, null, 0, null);
    }

    @Override // com.ss.android.ugc.aweme.DetailFeedService
    public final String LJIILJJIL(String str, String str2, String str3) {
        return C2189831An7.LIZJ(str, str2, str3);
    }

    @Override // com.ss.android.ugc.aweme.DetailFeedService
    public final BatchDetailList LIZIZ(int i, String str, String str2, String str3, String str4) {
        return DetailApi.LIZJ(0, str, i, str2, str3, 1, str4);
    }

    @Override // com.ss.android.ugc.aweme.DetailFeedService
    public final void LJIIL(Context context, String str, String str2, String str3, int i, String str4, View view, Bundle bundle) throws Throwable {
        C1606420ruC c1606420ruCLIZ;
        String str5 = DetailActivity._pnsPageId;
        if (context != null) {
            Intent intent = new Intent(context, (Class<?>) DetailActivity.class);
            intent.putExtra(FollowStatusChangeMethod.PARAM_UID, str);
            intent.putExtra("refer", str2);
            intent.putExtra("video_from", str3);
            intent.putExtra("profile_enterprise_type", i);
            intent.putExtra("page_type", 7000);
            intent.putExtra("enter_method", bundle.getString("enter_method", null));
            intent.putExtra("userid", str4);
            intent.putExtra("im_chat_to_detail_saf", bundle.getBoolean("im_chat_to_detail_saf", false));
            intent.putExtra("key_from_chat_room_playing", bundle.getBoolean("key_from_chat_room_playing"));
            intent.putExtra("key_from_chat_room_real_aid", bundle.getString("key_from_chat_room_real_aid"));
            intent.putExtra("is_from_auto_message", bundle.getInt("is_from_auto_message"));
            intent.putExtra("message", bundle.getSerializable("message"));
            intent.putExtra("conversation_id", bundle.getString("conversation_id"));
            intent.putExtra("chatroom_session_uuid", bundle.getString("chatroom_session_uuid"));
            if (bundle.getString("channel_id") != null) {
                intent.putExtra("channel_id", bundle.getString("channel_id"));
            }
            if (bundle.getBoolean("key_from_quoted_video")) {
                intent.putExtra("key_from_quoted_video", bundle.getBoolean("key_from_quoted_video"));
                intent.putExtra("message_id", bundle.getLong("message_id"));
            } else {
                intent.putExtra("message_id", bundle.getString("message_id"));
            }
            intent.putExtra("process_id", bundle.getString("process_id"));
            intent.putExtra("search_id", bundle.getString("search_id"));
            String string = bundle.getString("cid");
            if (!TextUtils.isEmpty(string)) {
                intent.putExtra("cid", string);
                intent.putExtra(FollowStatusChangeMethod.PARAM_UID, bundle.getString("realItemId"));
            }
            intent.putExtra("chat_type", bundle.getInt("chat_type", -1));
            intent.putExtra("chat_type_str", bundle.getString("chat_type_str"));
            intent.putExtra("group_type", bundle.getString("group_type"));
            intent.putExtra("source_btm_token", bundle.getString("source_btm_token"));
            intent.putExtra("enter_chat_param", bundle.getSerializable("enter_chat_param"));
            intent.putExtra("sub_process_id", bundle.getString("sub_process_id", ""));
            intent.putExtra("action_item_id", bundle.getLong("action_item_id", 0L));
            intent.putExtra("previous_page", bundle.getString("previous_page"));
            intent.putExtra("show_reply_panel", bundle.getBoolean("show_reply_panel", true));
            intent.putExtra("key_chat_from_user_id", bundle.getString("key_chat_from_user_id"));
            intent.putExtra("key_chat_from_user_nickname", bundle.getString("key_chat_from_user_nickname"));
            intent.putExtra("key_im_aweme_open_from", bundle.getString("key_im_aweme_open_from"));
            intent.putExtra("tab_name", bundle.getString("tab_name"));
            intent.putExtra("msg_type", bundle.getInt("msg_type"));
            intent.putExtra("enter_position", bundle.getString("enter_position"));
            try {
                if (view == null) {
                    RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(context, intent, "Context_startActivity_1");
                    C1701330uNH.LIZ(intent, context);
                    C2204961BRm.LJJJJJL(context, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KO6td57H0HxzkXZEXSFj9H/190hIvdxeng==", null));
                    return;
                }
                if (intent.getBooleanExtra("im_chat_to_detail_saf", false)) {
                    c1606420ruCLIZ = DetailActivity.LLLLLZL(view);
                    intent.putExtra("activity_has_activity_options", true);
                } else {
                    c1606420ruCLIZ = C1607950rwf.LIZ(view, view.getWidth(), view.getHeight());
                }
                Bundle bundleLJFF = c1606420ruCLIZ.LJFF();
                C1701330uNH.LIZ(intent, context);
                C838410Wul.LJIIIIZZ(context, intent, bundleLJFF);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(context, intent, "Context_startActivity_1");
                C1701330uNH.LIZ(intent, context);
                C2204961BRm.LJJJJJL(context, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KO6td57H0HxzkXZEXSFj9H/190hIvdxeng==", null));
            }
        }
    }
}
