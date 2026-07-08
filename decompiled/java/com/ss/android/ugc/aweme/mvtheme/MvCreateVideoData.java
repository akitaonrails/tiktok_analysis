package com.ss.android.ugc.aweme.mvtheme;

import X.C09CT;
import X.C0MY0;
import X.C2401009ay;
import X.InterfaceC2270908v5;
import android.os.Parcel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class MvCreateVideoData implements Serializable {

    @C09CT("beat_mv_bit_info")
    public BeatMvInfo beatMvInfo;

    @C09CT("birthday_bless_mv_param")
    public BirthdayBlessMvParam birthdayBlessMvParam;

    @C09CT("mv_contact_video_path")
    @C0MY0
    public String contactVideoPath;

    @C09CT("enable_mv_origin_audio")
    public boolean enableOriginAudio;

    @C09CT("is_beat_mv")
    public boolean isBeatMv;

    @C09CT("is_mv_rs_1080p")
    public boolean isMVRes1080p;

    @C09CT("is_media_template")
    public boolean isMediaTemplate;

    @C09CT("is_mixed_template")
    public boolean isMixedTemPlate;

    @C09CT("is_red_packet_mv")
    public boolean isRedPacketMv;

    @C09CT("is_upload_sticker")
    public boolean isUploadSticker;

    @C09CT("is_use_rgba_mode")
    public boolean isUseRGBAMode;

    @C09CT("ktv_audio_durations")
    public int[] ktvAudioDurations;

    @C09CT("ktv_audio_paths")
    public String[] ktvAudioPaths;

    @C09CT("ktv_mode")
    public int mode;

    @C09CT("mv_video_music_ids")
    public List<String> musicIds;

    @C09CT("mv_auto_save_toast")
    public String mvAutoSaveToast;

    @C09CT("mv_durations")
    public ArrayList<Integer> mvDurations;

    @C09CT("mv_id")
    public String mvId;

    @InterfaceC2270908v5
    @C09CT("mv_video_res_unzippath")
    public String mvResUnzipPath;

    @C09CT("mv_transition_param")
    public MVTransitionParam mvTransitionParam;

    @C09CT("mv_type")
    public int mvType;

    @C09CT("origin_mv_id")
    public String originMvId;

    @C09CT("rgba_mode_res_ratio")
    public int resRatio;

    @C09CT("mv_video_cover")
    @C0MY0
    public String videoCoverImgPath;

    @C09CT("mv_video_cover_starttime")
    public int videoCoverStartTime;

    @C09CT("source_item_list")
    public ArrayList<MvSourceItemInfo> sourceItemList = new ArrayList<>();

    @C09CT("select_media_list")
    @C0MY0(blockCreative = true)
    public ArrayList<String> selectMediaList = new ArrayList<>();

    @C09CT("select_src_media_list")
    public ArrayList<String> srcSelectMediaList = new ArrayList<>();

    @C09CT("select_src_media_types")
    public ArrayList<String> srcSelectMediaListTypes = new ArrayList<>();

    @C09CT("local_algorithm_materials")
    public ArrayList<String> localAlgorithmMaterials = new ArrayList<>();

    @C09CT("mask_file_data")
    public ArrayList<Object> maskFileData = new ArrayList<>();

    @C09CT("new_mask_file_data")
    public ArrayList<MvNetFileBean> newMaskFileData = new ArrayList<>();

    @C09CT("photo_to_save")
    @C0MY0
    public ArrayList<String> photoToSave = new ArrayList<>();

    @C09CT("is_slideshow_mode")
    public boolean isSlideshowMode = false;

    @C09CT("is_new_year_wish")
    public boolean isNewYearWish = false;

    @C09CT("res_fill_mode")
    public int resFillMode = 0;

    @C09CT("res_dest_width")
    public int resDestWidth = 0;

    @C09CT("res_dest_height")
    public int resDestHeight = 0;

    public int getImageCount() {
        if (!C2401009ay.LIZ(this.selectMediaList)) {
            return this.selectMediaList.size();
        }
        if (C2401009ay.LIZ(this.sourceItemList)) {
            return 0;
        }
        return this.sourceItemList.size();
    }

    public boolean isBeatMvValidate() {
        return this.isBeatMv && this.beatMvInfo != null;
    }

    public boolean isBirthdayBlessMv() {
        return this.birthdayBlessMvParam != null;
    }

    public MvCreateVideoData copy() {
        MvCreateVideoData mvCreateVideoData;
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeSerializable(this);
            parcelObtain.setDataPosition(0);
            mvCreateVideoData = (MvCreateVideoData) parcelObtain.readSerializable();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            mvCreateVideoData = null;
        }
        parcelObtain.recycle();
        return mvCreateVideoData;
    }
}
