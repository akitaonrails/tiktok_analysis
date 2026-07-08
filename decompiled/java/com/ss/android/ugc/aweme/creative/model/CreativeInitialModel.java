package com.ss.android.ugc.aweme.creative.model;

import X.C040H;
import X.C09CT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.CapCutTemplateMusic;
import com.ss.android.ugc.aweme.creative.model.CollectMusicModel;
import com.ss.android.ugc.aweme.creative.model.CreativeInitialModel;
import com.ss.android.ugc.aweme.creative.model.DMCameraModel;
import com.ss.android.ugc.aweme.creative.model.ECommerceCreativeVideoParams;
import com.ss.android.ugc.aweme.creative.model.EditCapCutReuseModel;
import com.ss.android.ugc.aweme.creative.model.HashtagsModel;
import com.ss.android.ugc.aweme.creative.model.HighLightVideoParametersModel;
import com.ss.android.ugc.aweme.creative.model.InitialFilterConfig;
import com.ss.android.ugc.aweme.creative.model.InitialMobParams;
import com.ss.android.ugc.aweme.creative.model.PhotoPublishConfigurationModel;
import com.ss.android.ugc.aweme.creative.model.ProfileParametersModel;
import com.ss.android.ugc.aweme.creative.model.WWAModel;
import com.ss.android.ugc.aweme.creative.model.defaultcontent.DefaultPostContentModel;
import com.ss.android.ugc.aweme.creative.model.photomode.PhotoModeAfterCreationFeedbackMobParams;
import com.ss.android.ugc.aweme.creative.model.photomode.PhotoModeBannerMobParams;
import com.ss.android.ugc.aweme.creative.model.photomode.PhotoModePostContentModel;
import com.ss.android.ugc.aweme.creative.model.photomode.PhotoModePostMobParams;
import com.ss.android.ugc.aweme.shortvideo.jsbopenrecord.RecordPageOptionalConfig;
import com.ss.android.ugc.aweme.shortvideo.model.ArticlePostModel;
import com.ss.android.ugc.aweme.shortvideo.model.DuetAndStitchRouterConfig;
import com.ss.android.ugc.aweme.shortvideo.model.ExtraMentionUserModel;
import com.ss.android.ugc.aweme.shortvideo.model.VQEvaluationConfig;

/* JADX INFO: loaded from: classes23.dex */
public final class CreativeInitialModel implements Parcelable {
    public static final Parcelable.Creator<CreativeInitialModel> CREATOR = new Parcelable.Creator<CreativeInitialModel>() { // from class: X.0nXn
        @Override // android.os.Parcelable.Creator
        public final CreativeInitialModel createFromParcel(Parcel parcel) {
            InitialMobParams initialMobParamsCreateFromParcel;
            EditCapCutReuseModel editCapCutReuseModelCreateFromParcel;
            ECommerceCreativeVideoParams eCommerceCreativeVideoParamsCreateFromParcel;
            CapCutTemplateMusic capCutTemplateMusicCreateFromParcel;
            RecordPageOptionalConfig recordPageOptionalConfigCreateFromParcel;
            DefaultPostContentModel defaultPostContentModelCreateFromParcel;
            WWAModel wWAModelCreateFromParcel;
            HashtagsModel hashtagsModelCreateFromParcel;
            PhotoModePostContentModel photoModePostContentModelCreateFromParcel;
            PhotoModePostMobParams photoModePostMobParamsCreateFromParcel;
            PhotoModeBannerMobParams photoModeBannerMobParamsCreateFromParcel;
            PhotoModeAfterCreationFeedbackMobParams photoModeAfterCreationFeedbackMobParamsCreateFromParcel;
            PhotoPublishConfigurationModel photoPublishConfigurationModelCreateFromParcel;
            ProfileParametersModel profileParametersModelCreateFromParcel = ProfileParametersModel.CREATOR.createFromParcel(parcel);
            DMCameraModel dMCameraModelCreateFromParcel = DMCameraModel.CREATOR.createFromParcel(parcel);
            InitialFilterConfig initialFilterConfigCreateFromParcel = null;
            if (parcel.readInt() == 0) {
                initialMobParamsCreateFromParcel = null;
            } else {
                initialMobParamsCreateFromParcel = InitialMobParams.CREATOR.createFromParcel(parcel);
            }
            InitialMobParams initialMobParams = initialMobParamsCreateFromParcel;
            if (parcel.readInt() == 0) {
                editCapCutReuseModelCreateFromParcel = null;
            } else {
                editCapCutReuseModelCreateFromParcel = EditCapCutReuseModel.CREATOR.createFromParcel(parcel);
            }
            EditCapCutReuseModel editCapCutReuseModel = editCapCutReuseModelCreateFromParcel;
            VQEvaluationConfig vQEvaluationConfig = (VQEvaluationConfig) parcel.readParcelable(CreativeInitialModel.class.getClassLoader());
            if (parcel.readInt() == 0) {
                eCommerceCreativeVideoParamsCreateFromParcel = null;
            } else {
                eCommerceCreativeVideoParamsCreateFromParcel = ECommerceCreativeVideoParams.CREATOR.createFromParcel(parcel);
            }
            ECommerceCreativeVideoParams eCommerceCreativeVideoParams = eCommerceCreativeVideoParamsCreateFromParcel;
            DuetAndStitchRouterConfig duetAndStitchRouterConfig = (DuetAndStitchRouterConfig) parcel.readParcelable(CreativeInitialModel.class.getClassLoader());
            if (parcel.readInt() == 0) {
                capCutTemplateMusicCreateFromParcel = null;
            } else {
                capCutTemplateMusicCreateFromParcel = CapCutTemplateMusic.CREATOR.createFromParcel(parcel);
            }
            CapCutTemplateMusic capCutTemplateMusic = capCutTemplateMusicCreateFromParcel;
            HighLightVideoParametersModel highLightVideoParametersModelCreateFromParcel = HighLightVideoParametersModel.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                recordPageOptionalConfigCreateFromParcel = null;
            } else {
                recordPageOptionalConfigCreateFromParcel = RecordPageOptionalConfig.CREATOR.createFromParcel(parcel);
            }
            RecordPageOptionalConfig recordPageOptionalConfig = recordPageOptionalConfigCreateFromParcel;
            if (parcel.readInt() == 0) {
                defaultPostContentModelCreateFromParcel = null;
            } else {
                defaultPostContentModelCreateFromParcel = DefaultPostContentModel.CREATOR.createFromParcel(parcel);
            }
            DefaultPostContentModel defaultPostContentModel = defaultPostContentModelCreateFromParcel;
            ArticlePostModel articlePostModel = (ArticlePostModel) parcel.readParcelable(CreativeInitialModel.class.getClassLoader());
            if (parcel.readInt() == 0) {
                wWAModelCreateFromParcel = null;
            } else {
                wWAModelCreateFromParcel = WWAModel.CREATOR.createFromParcel(parcel);
            }
            WWAModel wWAModel = wWAModelCreateFromParcel;
            if (parcel.readInt() == 0) {
                hashtagsModelCreateFromParcel = null;
            } else {
                hashtagsModelCreateFromParcel = HashtagsModel.CREATOR.createFromParcel(parcel);
            }
            HashtagsModel hashtagsModel = hashtagsModelCreateFromParcel;
            if (parcel.readInt() == 0) {
                photoModePostContentModelCreateFromParcel = null;
            } else {
                photoModePostContentModelCreateFromParcel = PhotoModePostContentModel.CREATOR.createFromParcel(parcel);
            }
            PhotoModePostContentModel photoModePostContentModel = photoModePostContentModelCreateFromParcel;
            if (parcel.readInt() == 0) {
                photoModePostMobParamsCreateFromParcel = null;
            } else {
                photoModePostMobParamsCreateFromParcel = PhotoModePostMobParams.CREATOR.createFromParcel(parcel);
            }
            PhotoModePostMobParams photoModePostMobParams = photoModePostMobParamsCreateFromParcel;
            if (parcel.readInt() == 0) {
                photoModeBannerMobParamsCreateFromParcel = null;
            } else {
                photoModeBannerMobParamsCreateFromParcel = PhotoModeBannerMobParams.CREATOR.createFromParcel(parcel);
            }
            PhotoModeBannerMobParams photoModeBannerMobParams = photoModeBannerMobParamsCreateFromParcel;
            if (parcel.readInt() == 0) {
                photoModeAfterCreationFeedbackMobParamsCreateFromParcel = null;
            } else {
                photoModeAfterCreationFeedbackMobParamsCreateFromParcel = PhotoModeAfterCreationFeedbackMobParams.CREATOR.createFromParcel(parcel);
            }
            PhotoModeAfterCreationFeedbackMobParams photoModeAfterCreationFeedbackMobParams = photoModeAfterCreationFeedbackMobParamsCreateFromParcel;
            ExtraMentionUserModel extraMentionUserModel = (ExtraMentionUserModel) parcel.readSerializable();
            if (parcel.readInt() == 0) {
                photoPublishConfigurationModelCreateFromParcel = null;
            } else {
                photoPublishConfigurationModelCreateFromParcel = PhotoPublishConfigurationModel.CREATOR.createFromParcel(parcel);
            }
            PhotoPublishConfigurationModel photoPublishConfigurationModel = photoPublishConfigurationModelCreateFromParcel;
            if (parcel.readInt() != 0) {
                initialFilterConfigCreateFromParcel = InitialFilterConfig.CREATOR.createFromParcel(parcel);
            }
            return new CreativeInitialModel(profileParametersModelCreateFromParcel, dMCameraModelCreateFromParcel, initialMobParams, editCapCutReuseModel, vQEvaluationConfig, eCommerceCreativeVideoParams, duetAndStitchRouterConfig, capCutTemplateMusic, highLightVideoParametersModelCreateFromParcel, recordPageOptionalConfig, defaultPostContentModel, articlePostModel, wWAModel, hashtagsModel, photoModePostContentModel, photoModePostMobParams, photoModeBannerMobParams, photoModeAfterCreationFeedbackMobParams, extraMentionUserModel, photoPublishConfigurationModel, initialFilterConfigCreateFromParcel, CollectMusicModel.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final CreativeInitialModel[] newArray(int i) {
            return new CreativeInitialModel[i];
        }
    };

    @C09CT("article_post_model")
    public ArticlePostModel articlePostModel;

    @C09CT("cap_cut_reuse_model")
    public final EditCapCutReuseModel capCutReuseModel;

    @C040H
    @C09CT("cap_cut_template_music")
    public final CapCutTemplateMusic capCutTemplateMusic;

    @C040H
    public CollectMusicModel collectMusicModel;

    @C09CT("ec_creative_video_params")
    public final ECommerceCreativeVideoParams creativeVideoParams;

    @C09CT("default_post_content_model")
    public DefaultPostContentModel defaultPostContentModel;

    @C09CT("dm_camera_model")
    public DMCameraModel dmCameraModel;

    @C09CT("duet_and_stitch_router_config")
    public DuetAndStitchRouterConfig duetAndStitchRouterConfig;

    @C040H
    public InitialFilterConfig filterConfig;

    @C040H
    public HashtagsModel hashtagsModel;

    @C09CT("high_light_video_parameters_model")
    public final HighLightVideoParametersModel highLightVideoParametersModel;

    @C040H
    public ExtraMentionUserModel mentionUserModel;

    @C09CT("mob_params")
    public final InitialMobParams mobParams;

    @C09CT("photo_mode_after_creation_feedback_mob_params")
    public PhotoModeAfterCreationFeedbackMobParams photoModeAfterFeedbackMobParams;

    @C09CT("photo_mode_banner_mob_params")
    public PhotoModeBannerMobParams photoModeBannerMobParams;

    @C09CT("photo_mode_post_content_model")
    public PhotoModePostContentModel photoModePostContentModel;

    @C09CT("photo_mode_post_mob_params")
    public PhotoModePostMobParams photoModePostMobParams;

    @C09CT("photo_publish_configuration_model")
    public PhotoPublishConfigurationModel photoPublishConfigurationModel;

    @C09CT("profile_paramters_model")
    public ProfileParametersModel profileParametersModel;

    @C040H
    public RecordPageOptionalConfig recordPageOptionalConfig;

    @C040H
    @C09CT("vq_evaluation_config")
    public VQEvaluationConfig vqEvaluationConfig;

    @C09CT("wwa_model")
    public WWAModel wwaModel;

    public CreativeInitialModel() {
        this(new ProfileParametersModel(""), new DMCameraModel(false, null, "", false, false, false, "", null, -1, false, 0, "", -1, "", "", false, false, null, false, null, null, null, null, null, null, null, false, false, false, null, null, null, false, null, true, false, "", null, null, 0L, false, null, null, null, null), null, null, null, null, null, null, new HighLightVideoParametersModel(null, null, null, null, false, null, null, false, null, null, null, null, null, null, null, null, false, null, null, false, false, 2097151, null), null, null, null, null, null, null, null, null, null, null, null, null, new CollectMusicModel(null, false, false, false, false, null));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.profileParametersModel.guideWording);
        this.dmCameraModel.writeToParcel(parcel, i);
        InitialMobParams initialMobParams = this.mobParams;
        if (initialMobParams == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            initialMobParams.writeToParcel(parcel, i);
        }
        EditCapCutReuseModel editCapCutReuseModel = this.capCutReuseModel;
        if (editCapCutReuseModel == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            editCapCutReuseModel.writeToParcel(parcel, i);
        }
        parcel.writeParcelable(this.vqEvaluationConfig, i);
        ECommerceCreativeVideoParams eCommerceCreativeVideoParams = this.creativeVideoParams;
        if (eCommerceCreativeVideoParams == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(eCommerceCreativeVideoParams.musicId);
        }
        parcel.writeParcelable(this.duetAndStitchRouterConfig, i);
        CapCutTemplateMusic capCutTemplateMusic = this.capCutTemplateMusic;
        if (capCutTemplateMusic == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(capCutTemplateMusic.templateId);
        }
        this.highLightVideoParametersModel.writeToParcel(parcel, i);
        RecordPageOptionalConfig recordPageOptionalConfig = this.recordPageOptionalConfig;
        if (recordPageOptionalConfig == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            recordPageOptionalConfig.writeToParcel(parcel, i);
        }
        DefaultPostContentModel defaultPostContentModel = this.defaultPostContentModel;
        if (defaultPostContentModel == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            defaultPostContentModel.writeToParcel(parcel, i);
        }
        parcel.writeParcelable(this.articlePostModel, i);
        WWAModel wWAModel = this.wwaModel;
        if (wWAModel == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            wWAModel.writeToParcel(parcel, i);
        }
        HashtagsModel hashtagsModel = this.hashtagsModel;
        if (hashtagsModel == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            hashtagsModel.writeToParcel(parcel, i);
        }
        PhotoModePostContentModel photoModePostContentModel = this.photoModePostContentModel;
        if (photoModePostContentModel == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            photoModePostContentModel.writeToParcel(parcel, i);
        }
        PhotoModePostMobParams photoModePostMobParams = this.photoModePostMobParams;
        if (photoModePostMobParams == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            photoModePostMobParams.writeToParcel(parcel, i);
        }
        PhotoModeBannerMobParams photoModeBannerMobParams = this.photoModeBannerMobParams;
        if (photoModeBannerMobParams == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            photoModeBannerMobParams.writeToParcel(parcel, i);
        }
        PhotoModeAfterCreationFeedbackMobParams photoModeAfterCreationFeedbackMobParams = this.photoModeAfterFeedbackMobParams;
        if (photoModeAfterCreationFeedbackMobParams == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            photoModeAfterCreationFeedbackMobParams.writeToParcel(parcel, i);
        }
        parcel.writeSerializable(this.mentionUserModel);
        PhotoPublishConfigurationModel photoPublishConfigurationModel = this.photoPublishConfigurationModel;
        if (photoPublishConfigurationModel == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            photoPublishConfigurationModel.writeToParcel(parcel, i);
        }
        InitialFilterConfig initialFilterConfig = this.filterConfig;
        if (initialFilterConfig == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            initialFilterConfig.writeToParcel(parcel, i);
        }
        this.collectMusicModel.writeToParcel(parcel, i);
    }

    public CreativeInitialModel(ProfileParametersModel profileParametersModel, DMCameraModel dMCameraModel, InitialMobParams initialMobParams, EditCapCutReuseModel editCapCutReuseModel, VQEvaluationConfig vQEvaluationConfig, ECommerceCreativeVideoParams eCommerceCreativeVideoParams, DuetAndStitchRouterConfig duetAndStitchRouterConfig, CapCutTemplateMusic capCutTemplateMusic, HighLightVideoParametersModel highLightVideoParametersModel, RecordPageOptionalConfig recordPageOptionalConfig, DefaultPostContentModel defaultPostContentModel, ArticlePostModel articlePostModel, WWAModel wWAModel, HashtagsModel hashtagsModel, PhotoModePostContentModel photoModePostContentModel, PhotoModePostMobParams photoModePostMobParams, PhotoModeBannerMobParams photoModeBannerMobParams, PhotoModeAfterCreationFeedbackMobParams photoModeAfterCreationFeedbackMobParams, ExtraMentionUserModel extraMentionUserModel, PhotoPublishConfigurationModel photoPublishConfigurationModel, InitialFilterConfig initialFilterConfig, CollectMusicModel collectMusicModel) {
        this.profileParametersModel = profileParametersModel;
        this.dmCameraModel = dMCameraModel;
        this.mobParams = initialMobParams;
        this.capCutReuseModel = editCapCutReuseModel;
        this.vqEvaluationConfig = vQEvaluationConfig;
        this.creativeVideoParams = eCommerceCreativeVideoParams;
        this.duetAndStitchRouterConfig = duetAndStitchRouterConfig;
        this.capCutTemplateMusic = capCutTemplateMusic;
        this.highLightVideoParametersModel = highLightVideoParametersModel;
        this.recordPageOptionalConfig = recordPageOptionalConfig;
        this.defaultPostContentModel = defaultPostContentModel;
        this.articlePostModel = articlePostModel;
        this.wwaModel = wWAModel;
        this.hashtagsModel = hashtagsModel;
        this.photoModePostContentModel = photoModePostContentModel;
        this.photoModePostMobParams = photoModePostMobParams;
        this.photoModeBannerMobParams = photoModeBannerMobParams;
        this.photoModeAfterFeedbackMobParams = photoModeAfterCreationFeedbackMobParams;
        this.mentionUserModel = extraMentionUserModel;
        this.photoPublishConfigurationModel = photoPublishConfigurationModel;
        this.filterConfig = initialFilterConfig;
        this.collectMusicModel = collectMusicModel;
    }
}
