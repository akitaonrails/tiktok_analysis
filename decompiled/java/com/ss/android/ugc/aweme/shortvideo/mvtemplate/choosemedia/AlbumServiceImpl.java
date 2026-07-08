package com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia;

import X.C0L0F;
import X.C0L0G;
import X.C0L91;
import X.C0LGY;
import X.C0WZX;
import X.C13LP;
import X.C1701330uNH;
import X.C19EG;
import X.C20642515q3;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C2204961BRm;
import X.C299080Bnu;
import X.C523420Kfs;
import X.C786410Ut5;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.comment.services.CommentService;
import com.ss.android.ugc.aweme.external.IExternalAlbumService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.tools.integration.plugin.integration.api.CreativeToolsPluginService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes9.dex */
public final class AlbumServiceImpl implements IExternalAlbumService {
    @Override // com.ss.android.ugc.aweme.external.IExternalAlbumService
    public final boolean LIZIZ() {
        C0LGY c0lgy = C0LGY.LIZ;
        C0L91 c0l91 = C0L91.VIDEO;
        c0lgy.getClass();
        return C0LGY.LIZIZ(c0l91);
    }

    @Override // com.ss.android.ugc.aweme.external.IExternalAlbumService
    public final String LJ() {
        C0LGY.LIZ.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C2097608Jq.LJIILL(linkedHashMap, new Pair[]{C0LGY.LJIIIIZZ("android.permission.READ_EXTERNAL_STORAGE"), C0LGY.LJIIIIZZ("android.permission.WRITE_EXTERNAL_STORAGE")});
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            C2097608Jq.LJIILL(linkedHashMap, new Pair[]{C0LGY.LJIIIIZZ("android.permission.READ_MEDIA_VIDEO"), C0LGY.LJIIIIZZ("android.permission.READ_MEDIA_IMAGES")});
            if (i >= 34) {
                C2097608Jq.LJIILL(linkedHashMap, new Pair[]{C0LGY.LJIIIIZZ("android.permission.READ_MEDIA_VISUAL_USER_SELECTED")});
            }
        }
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append((String) entry.getKey());
            sbLIZ.append(':');
            sbLIZ.append(((Number) entry.getValue()).intValue());
            arrayList.add(C2188811AlT.LIZIZ(sbLIZ));
        }
        return C13LP.LJJLIIIJ(arrayList, null, null, null, 0, null, null, 63);
    }

    @Override // com.ss.android.ugc.aweme.external.IExternalAlbumService
    public final void LIZ(Activity activity) throws Throwable {
        if (activity != null) {
            Intent intent = new Intent(activity, (Class<?>) MvChoosePhotoActivity.class);
            Bundle bundle = new Bundle();
            bundle.putInt("key_video_select_max_count", 1);
            bundle.putInt("key_video_select_min_count", 1);
            bundle.putBoolean("Key_enable_multi_video", false);
            bundle.putInt("key_support_flag", 4);
            bundle.putInt("key_choose_scene", 58);
            bundle.putInt("key_max_selectable_video_duration", 600500);
            bundle.putInt("key_min_selectable_video_duration", 0);
            C786410Ut5.LJJJI("key_mv_hint_text", C20642515q3.LJI(2131855803), bundle);
            intent.putExtras(bundle);
            intent.putExtra("key_choose_request_code", 1);
            RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(activity, intent, "Activity_startActivityForResult_2");
            C1701330uNH.LIZ(intent, activity);
            C2204961BRm.LJIIZILJ(100, activity, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmgbI3ayjtq+wwhkdTRjIENBfvs0uavXjSXEDau27GyYrP+MdUeSK77bDBA4d4rxPT1", null));
        }
    }

    @Override // com.ss.android.ugc.aweme.external.IExternalAlbumService
    public final Intent LJFF(Context context, int i, int i2) {
        int i3;
        C0L0G c0l0g = new C0L0G(255, 255, SpeechEngineDefines.TTS_WORK_MODE_BOTH, SpeechEngineDefines.TTS_WORK_MODE_BOTH, 20480000);
        Bundle bundle = new Bundle();
        bundle.putInt("key_choose_scene", 35);
        bundle.putBoolean("key_support_edit_after_choose", false);
        CommentService.LIZ.getClass();
        if (C523420Kfs.LIZ().isLivePhotoEnabled()) {
            i3 = 9;
        } else {
            i3 = 1;
        }
        bundle.putInt("key_support_flag", i3);
        bundle.putInt("key_photo_select_max_count", 1);
        bundle.putInt("result_code", -1);
        bundle.putInt("key_sub_emote_show_type", 0);
        bundle.putInt("key_choose_request_code", i2);
        C786410Ut5.LJJIZ(bundle, "key_sub_image_params", c0l0g);
        String str = MvChoosePhotoActivity._pnsPageId;
        Intent intent = new Intent(context, (Class<?>) MvChoosePhotoActivity.class);
        intent.putExtras(bundle);
        intent.putExtra("key_choose_request_code", i);
        intent.putExtra("key_start_activity_request_code", i2);
        return intent;
    }

    @Override // com.ss.android.ugc.aweme.external.IExternalAlbumService
    public final void LIZJ(Activity activity, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, Map<String, ? extends Object> map, int i10, int i11, int i12) throws Throwable {
        HashMap map2 = new HashMap();
        map2.putAll(map);
        C0L0G c0l0g = new C0L0G(i5, i6, i7, i8, i9);
        Bundle bundle = new Bundle();
        bundle.putInt("key_choose_scene", 16);
        bundle.putBoolean("key_support_edit_after_choose", false);
        bundle.putInt("key_support_flag", i10);
        bundle.putInt("key_photo_select_max_count", i3);
        C786410Ut5.LJJJI("key_mv_hint_text", activity.getString(2131837606), bundle);
        if (i12 > 0) {
            bundle.putInt("key_set_peek_height", i12);
            bundle.putBoolean("key_set_big_send_button_hide_mixed_view", true);
        }
        bundle.putInt("result_code", i2);
        bundle.putInt("key_sub_emote_show_type", i4);
        C786410Ut5.LJJIZ(bundle, "key_sub_log_info", map2);
        C786410Ut5.LJJIZ(bundle, "key_sub_image_params", c0l0g);
        bundle.putInt("key_choose_photo_page_size", i11);
        String str = MvChoosePhotoActivity._pnsPageId;
        C0L0F.LJI(activity, bundle, -1, i);
    }

    @Override // com.ss.android.ugc.aweme.external.IExternalAlbumService
    public final void LIZLLL(Fragment fragment, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, Map<String, ? extends Object> map, int i10, int i11, int i12) throws Throwable {
        String string;
        String str;
        ShortVideoContext shortVideoContext;
        C19EG activity;
        HashMap map2 = new HashMap();
        map2.putAll(map);
        C0L0G c0l0g = new C0L0G(i5, i6, i7, i8, i9);
        Bundle bundle = new Bundle();
        bundle.putInt("key_choose_scene", 16);
        bundle.putBoolean("key_support_edit_after_choose", false);
        bundle.putInt("key_support_flag", i10);
        bundle.putInt("key_photo_select_max_count", i3);
        if (fragment != null && (activity = fragment.getActivity()) != null) {
            string = activity.getString(2131837606);
        } else {
            string = null;
        }
        C786410Ut5.LJJJI("key_mv_hint_text", string, bundle);
        if (i12 > 0) {
            bundle.putInt("key_set_peek_height", i12);
            bundle.putBoolean("key_set_big_send_button_hide_mixed_view", true);
        }
        bundle.putInt("result_code", i2);
        bundle.putInt("key_sub_emote_show_type", i4);
        C786410Ut5.LJJIZ(bundle, "key_sub_log_info", map2);
        C786410Ut5.LJJIZ(bundle, "key_sub_image_params", c0l0g);
        bundle.putInt("key_choose_photo_page_size", i11);
        if (fragment != null) {
            String str2 = MvChoosePhotoActivity._pnsPageId;
            if (C299080Bnu.LIZ()) {
                Parcelable parcelable = bundle.getParcelable("key_short_video_context");
                if (!(parcelable instanceof ShortVideoContext) || (shortVideoContext = (ShortVideoContext) parcelable) == null || (str = shortVideoContext.shootWay) == null) {
                    str = "unknown";
                }
                CreativeToolsPluginService creativeToolsPluginService = (CreativeToolsPluginService) PluggableExtentionKt.pluggableSpi$default(CreativeToolsPluginService.class, false, false, false, 14, null);
                if (creativeToolsPluginService != null) {
                    Context context = fragment.getContext();
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("album_legacy4_");
                    sbLIZ.append(str);
                    sbLIZ.append('_');
                    sbLIZ.append(i);
                    if (!creativeToolsPluginService.LIZJ(context, C2188811AlT.LIZIZ(sbLIZ), true)) {
                        return;
                    }
                } else {
                    return;
                }
            }
            Intent intent = new Intent(fragment.requireContext(), (Class<?>) MvChoosePhotoActivity.class);
            intent.putExtras(bundle);
            intent.putExtra("key_choose_request_code", -1);
            intent.putExtra("key_start_activity_request_code", i);
            C1701330uNH.LIZ(intent, fragment);
            C2204961BRm.LLJL(fragment, intent, i, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmgbI3ayjtq+wwhkdTRjIENBfvs0uavXjSXEDau27GyYrPyK/QDSg9KKzkenDPbXFeSF3RS6so=", null));
        }
    }
}
