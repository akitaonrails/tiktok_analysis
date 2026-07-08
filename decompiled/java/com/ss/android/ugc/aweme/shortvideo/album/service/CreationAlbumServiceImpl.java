package com.ss.android.ugc.aweme.shortvideo.album.service;

import X.C0L9G;
import X.C1954807lC;
import X.C272070AlR;
import X.C523440Kfu;
import X.C523960Kgk;
import X.C523970Kgl;
import X.C524310KhJ;
import X.C578570Mmd;
import X.C786410Ut5;
import android.os.Bundle;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.shortvideo.album.api.config.AlbumSelectionMode;
import com.ss.android.ugc.aweme.shortvideo.album.api.config.AlbumSupportTab;
import com.ss.android.ugc.aweme.shortvideo.album.api.config.builtin.AlbumDefaultBottomActionBarConfig;
import com.ss.android.ugc.aweme.shortvideo.mediaselector.aicontentprotocol.AlbumAiContentService;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes9.dex */
public final class CreationAlbumServiceImpl implements CreationAlbumService {
    @Override // com.ss.android.ugc.aweme.shortvideo.album.service.CreationAlbumService
    public final C524310KhJ LIZ(String str, Function1 function1) {
        int i;
        C523970Kgl c523970Kgl = new C523970Kgl();
        function1.invoke(c523970Kgl);
        Bundle bundle = new Bundle();
        C786410Ut5.LJJJI("_album_bottom_action_bar_type", c523970Kgl.LIZ.getKey(), bundle);
        C786410Ut5.LJJIJL(bundle, "_album_bottom_action_bar_config", c523970Kgl.LIZIZ);
        C786410Ut5.LJJIJL(bundle, "_album_media_config", c523970Kgl.LIZJ);
        C786410Ut5.LJJIJL(bundle, "_album_selection_config", c523970Kgl.LIZLLL);
        C786410Ut5.LJJIJL(bundle, "_album_ui_config", c523970Kgl.LJFF);
        C786410Ut5.LJJIJL(bundle, "_album_output_config", c523970Kgl.LJI);
        C786410Ut5.LJJIJL(bundle, "_album_event_tracking_config", c523970Kgl.LJ);
        AlbumSelectionMode albumSelectionMode = c523970Kgl.LIZLLL.mode;
        boolean z = false;
        if (albumSelectionMode instanceof AlbumSelectionMode.Single) {
            bundle.putBoolean("Key_enable_single_select_mode", true);
            bundle.putInt("key_photo_select_min_count", 1);
            bundle.putInt("key_photo_select_max_count", 1);
            bundle.putInt("key_video_select_min_count", 1);
            bundle.putInt("key_video_select_max_count", 1);
        } else if (albumSelectionMode instanceof AlbumSelectionMode.Multiple) {
            bundle.putBoolean("Key_enable_single_select_mode", false);
            AlbumSelectionMode.Multiple multiple = (AlbumSelectionMode.Multiple) albumSelectionMode;
            bundle.putInt("key_photo_select_min_count", multiple.minPhotoCount);
            bundle.putInt("key_photo_select_max_count", multiple.maxPhotoCount);
            bundle.putInt("key_video_select_min_count", multiple.minVideoCount);
            bundle.putInt("key_video_select_max_count", multiple.maxVideoCount);
        } else {
            throw new C1954807lC();
        }
        float f = c523970Kgl.LIZLLL.videoMaxSeconds;
        float f2 = LSPassThroughRecordSizeConfig.DEFAULT;
        bundle.putInt("key_max_selectable_video_duration", (int) (f * f2));
        bundle.putInt("key_min_selectable_video_duration", (int) (c523970Kgl.LIZLLL.videoMinSeconds * f2));
        AlbumSupportTab albumSupportTabLIZIZ = c523970Kgl.LIZJ.supportMediaTab;
        if (albumSupportTabLIZIZ.flag == 0) {
            AlbumSupportTab.Companion.getClass();
            albumSupportTabLIZIZ = AlbumSupportTab.PHOTO.LIZIZ(AlbumSupportTab.VIDEO);
            C578570Mmd.LIZ.getClass();
            if (C578570Mmd.LIZ()) {
                albumSupportTabLIZIZ = albumSupportTabLIZIZ.LIZIZ(AlbumSupportTab.LIVE_PHOTO);
            }
            AlbumAiContentService.LIZ.getClass();
            AlbumAiContentService albumAiContentServiceLIZ = C523440Kfu.LIZ();
            if (albumAiContentServiceLIZ != null && albumAiContentServiceLIZ.isEnable()) {
                albumSupportTabLIZIZ = albumSupportTabLIZIZ.LIZIZ(AlbumSupportTab.AI_CONTENT);
            }
        }
        bundle.putInt("key_support_flag", albumSupportTabLIZIZ.flag);
        bundle.putBoolean("show_private_album", c523970Kgl.LIZJ.enableSystemAlbum);
        C786410Ut5.LJJJI("shoot_way", c523970Kgl.LJ.shootWay, bundle);
        C786410Ut5.LJJJI("enter_from", c523970Kgl.LJ.enterFrom, bundle);
        C786410Ut5.LJJJI("enter_method", c523970Kgl.LJ.enterMethod, bundle);
        bundle.putInt("key_set_column_count", c523970Kgl.LJFF.mediaListColumns);
        if (c523970Kgl.LJFF.themeStyle == C0L9G.DARK) {
            z = true;
        }
        bundle.putBoolean("album_dark_mode", z);
        bundle.putBoolean("key_hide_header_close_button", !c523970Kgl.LJFF.enableCloseButton);
        if (c523970Kgl.LJFF.enablePageSheet) {
            i = 75;
        } else {
            i = 100;
        }
        bundle.putInt("key_set_peek_height", i);
        if (c523970Kgl.LIZ instanceof C523960Kgk) {
            AlbumDefaultBottomActionBarConfig albumDefaultBottomActionBarConfig = c523970Kgl.LIZIZ;
            String str2 = null;
            if ((albumDefaultBottomActionBarConfig instanceof AlbumDefaultBottomActionBarConfig) && albumDefaultBottomActionBarConfig != null) {
                str2 = albumDefaultBottomActionBarConfig.hintText;
            }
            C786410Ut5.LJJJI("key_mv_hint_text", str2, bundle);
        }
        bundle.putInt("key_choose_scene", 66);
        bundle.putBoolean("creative_saa_window_translucent", true);
        bundle.putBoolean("key_set_dim_overlay_config", true);
        bundle.putBoolean("start_saa_with_single_top", !((Boolean) C272070AlR.LIZ.getValue()).booleanValue());
        return new C524310KhJ(str, c523970Kgl, bundle);
    }
}
