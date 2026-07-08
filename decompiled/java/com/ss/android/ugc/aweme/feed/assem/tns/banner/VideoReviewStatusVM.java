package com.ss.android.ugc.aweme.feed.assem.tns.banner;

import X.C01GW;
import X.C0IE5;
import X.C10IS;
import X.C10IT;
import X.C10IU;
import X.C1308910kAL;
import X.C1453970nwJ;
import X.C1697810uHb;
import X.C1865950yen;
import X.C19336710kv;
import X.C2188811AlT;
import X.C2214201BlK;
import X.C2241008qG;
import X.C2344809Gs;
import X.C280420Ayu;
import X.C291190BbB;
import X.C452501pT;
import X.C735280Sso;
import X.C786410Ut5;
import X.C794420VEi;
import X.C844470XAv;
import X.InterfaceC0148002o;
import X.InterfaceC1631620sYq;
import android.app.Activity;
import android.content.Context;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.feed.assem.base.FeedBaseViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeStatus;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.port.in.IReplaceMusicDownloadService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.services.edit.IReplaceMusicService;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS217S0000000_28;
import kotlin.jvm.internal.AwS372S0200000_6;
import kotlin.jvm.internal.AwS394S0200000_28;
import kotlin.jvm.internal.AwS463S0200000_28;
import kotlin.jvm.internal.AwS585S0100000_6;
import kotlin.jvm.internal.AwS677S0100000_28;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes29.dex */
public final class VideoReviewStatusVM extends FeedBaseViewModel<C10IU> {
    public static final List<Integer> LLIZLLLIL;
    public boolean LL;
    public int LLILLJJLI;
    public boolean LLILLL;
    public WeakReference<VideoItemParams> LLILZIL;
    public WeakReference<Aweme> LLILZLL;
    public final C01GW LLILZ = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(185));
    public final WeakReference<InterfaceC1631620sYq<String, Integer, Integer, Unit>> LLIZ = new WeakReference<>(new AwS677S0100000_28(this, 0));

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C10IU(0);
    }

    static {
        LLIZLLLIL = C291190BbB.LIZ() ? C1697810uHb.LJIIJJI(2, 3, 4) : C1697810uHb.LJIILJJIL(1, 2, 3, 4);
    }

    public static CharSequence vQ2(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(' ');
        sbLIZ.append(str);
        SpannableString spannableString = new SpannableString(C2188811AlT.LIZIZ(sbLIZ));
        C844470XAv.LIZ.getClass();
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1r, C844470XAv.LIZ());
        if (numLIZJ != null) {
            C786410Ut5.p2(spannableString, new ForegroundColorSpan(numLIZJ.intValue()), 0, spannableString.length(), 33);
        }
        return spannableString;
    }

    public static boolean yQ2(Aweme aweme) {
        AwemeStatus.MappedMuteStripStatus mappedMuteStripStatus;
        AwemeStatus.MappedMuteStripStatus mappedMuteStripStatus2;
        IReplaceMusicService iReplaceMusicService;
        AwemeStatus statusSafety;
        AwemeStatus statusSafety2;
        AwemeStatus statusSafety3;
        AwemeStatus.MappedMuteStripStatus mappedMuteStripStatus3 = null;
        if (aweme != null && (statusSafety3 = AwemeExtKt.getStatusSafety(aweme)) != null) {
            mappedMuteStripStatus = statusSafety3.getMappedMuteStripStatus();
        } else {
            mappedMuteStripStatus = null;
        }
        if (mappedMuteStripStatus != AwemeStatus.MappedMuteStripStatus.MUTE_STRIP_STATUS_REMOVING) {
            if (aweme != null && (statusSafety2 = AwemeExtKt.getStatusSafety(aweme)) != null) {
                mappedMuteStripStatus2 = statusSafety2.getMappedMuteStripStatus();
            } else {
                mappedMuteStripStatus2 = null;
            }
            if (mappedMuteStripStatus2 != AwemeStatus.MappedMuteStripStatus.MUTE_STRIP_STATUS_UPDATING) {
                if (aweme != null && (statusSafety = AwemeExtKt.getStatusSafety(aweme)) != null) {
                    mappedMuteStripStatus3 = statusSafety.getMappedMuteStripStatus();
                }
                if (mappedMuteStripStatus3 != AwemeStatus.MappedMuteStripStatus.MUTE_STRIP_STATUS_PENDING_FOR_CONFIRM || (iReplaceMusicService = (IReplaceMusicService) PluggableExtentionKt.pluggableSpi$default(IReplaceMusicService.class, false, false, false, 14, null)) == null || !iReplaceMusicService.getUploadingStatus()) {
                    return false;
                }
            }
        }
        return true;
    }

    public final boolean xQ2(Aweme aweme) {
        AwemeStatus statusSafety;
        AwemeStatus.VideoMuteInfo videoMuteInfo;
        AwemeStatus.MappedMuteStripStatus mappedMuteStripStatus;
        VideoItemParams item;
        Aweme aweme2;
        AwemeStatus statusSafety2;
        if (aweme == null || (statusSafety = AwemeExtKt.getStatusSafety(aweme)) == null || (videoMuteInfo = statusSafety.getVideoMuteInfo()) == null || !videoMuteInfo.isMute()) {
            return false;
        }
        AwemeStatus statusSafety3 = AwemeExtKt.getStatusSafety(aweme);
        AwemeStatus.MappedMuteStripStatus mappedMuteStripStatus2 = null;
        if (statusSafety3 != null) {
            mappedMuteStripStatus = statusSafety3.getMappedMuteStripStatus();
        } else {
            mappedMuteStripStatus = null;
        }
        if (mappedMuteStripStatus != AwemeStatus.MappedMuteStripStatus.MUTE_STRIP_STATUS_WAIT_FOR_TRIGGER) {
            AwemeStatus statusSafety4 = AwemeExtKt.getStatusSafety(aweme);
            if (statusSafety4 != null) {
                mappedMuteStripStatus2 = statusSafety4.getMappedMuteStripStatus();
            }
            if (mappedMuteStripStatus2 != AwemeStatus.MappedMuteStripStatus.MUTE_STRIP_STATUS_PENDING_FOR_CONFIRM && ((item = getItem()) == null || (aweme2 = item.getAweme()) == null || (statusSafety2 = AwemeExtKt.getStatusSafety(aweme2)) == null || statusSafety2.getMuteStripStatus() != 11)) {
                return false;
            }
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.base.FeedBaseViewModel
    public final InterfaceC0148002o paramSync2StateAccept(InterfaceC0148002o interfaceC0148002o, VideoItemParams videoItemParams) {
        boolean z;
        Activity activityLJFF;
        CharSequence quantityString;
        AwemeStatus statusSafety;
        AwemeStatus.VideoMuteInfo videoMuteInfo;
        String muteDetailUrl;
        String uid;
        AwemeStatus statusSafety2;
        AwemeStatus.VideoMuteInfo videoMuteInfo2;
        int i;
        Animation animationLoadAnimation;
        String string;
        int i2;
        String string2;
        AwemeStatus statusSafety3;
        String reviewDetailUrl;
        C10IU c10iu = (C10IU) interfaceC0148002o;
        String str = "";
        if (C10IS.LIZJ(videoItemParams)) {
            if (C280420Ayu.LIZ()) {
                ((IReplaceMusicDownloadService) ServiceManager.get().getService(IReplaceMusicDownloadService.class)).LJ(this.LLIZ);
            }
            String videoDetailNoticeBottom = AwemeExtKt.getVideoDetailNoticeBottom(videoItemParams.getAweme());
            if (TextUtils.isEmpty(videoDetailNoticeBottom)) {
                VideoItemParams item = getItem();
                if (item != null) {
                    C2241008qG c2241008qG = new C2241008qG();
                    c2241008qG.LIZ.put("type", "video_detail_notice_bottom");
                    c2241008qG.LIZ.put("log_id", item.getAweme().getRequestId());
                    c2241008qG.LIZ.put("item_id", item.getAweme().getAid());
                    C794420VEi.LIZIZ("notice_content_empty", "", c2241008qG.LJ());
                }
                Activity activityLJFF2 = C2214201BlK.LJFF();
                if (activityLJFF2 == null || (videoDetailNoticeBottom = activityLJFF2.getString(2131858125)) == null) {
                    videoDetailNoticeBottom = "";
                }
            }
            Aweme aweme = videoItemParams.getAweme();
            if (aweme != null && (reviewDetailUrl = AwemeExtKt.getReviewDetailUrl(aweme)) != null) {
                str = reviewDetailUrl;
            }
            return C10IU.LIZ(c10iu, 1, R.attr.zs, R.raw.icon_exclamation_mark_circle_fill, videoDetailNoticeBottom, str, new AwS372S0200000_6(this, videoItemParams, 3), new C0IE5(this, 0), null, null, null, null, 1920);
        }
        if (!C10IS.LIZJ(videoItemParams) && C10IT.LJIIIZ(videoItemParams.getAweme()) && !C10IS.LJ(videoItemParams)) {
            if (C280420Ayu.LIZ()) {
                ((IReplaceMusicDownloadService) ServiceManager.get().getService(IReplaceMusicDownloadService.class)).LJ(this.LLIZ);
            }
            Aweme aweme2 = videoItemParams.getAweme();
            if (aweme2 != null && (statusSafety3 = AwemeExtKt.getStatusSafety(aweme2)) != null && statusSafety3.getMusicEditStatus() == 2) {
                z = true;
            } else {
                z = false;
            }
            int i3 = R.attr.im;
            String uid2 = null;
            if (z) {
                if (C10IT.LJII(videoItemParams.getAweme())) {
                    Activity activityLJFF3 = C2214201BlK.LJFF();
                    if (activityLJFF3 != null && (string2 = activityLJFF3.getString(2131848631)) != null) {
                        str = string2;
                    }
                    C844470XAv.LIZ.getClass();
                    animationLoadAnimation = AnimationUtils.loadAnimation(C844470XAv.LIZ(), R.anim.f481io);
                    i = R.raw.icon_spinner_normal;
                } else {
                    Activity activityLJFF4 = C2214201BlK.LJFF();
                    if (activityLJFF4 != null && (string = activityLJFF4.getString(2131846366)) != null) {
                        str = string;
                    }
                    i = -1;
                    animationLoadAnimation = null;
                }
                if (C1865950yen.LIZ()) {
                    i2 = R.attr.il;
                } else if (C1865950yen.LIZIZ()) {
                    i2 = R.attr.im;
                } else {
                    i2 = R.attr.e4;
                }
                return C10IU.LIZ(c10iu, 2, i2, i, str, null, null, null, animationLoadAnimation, null, null, null, 1904);
            }
            Aweme aweme3 = videoItemParams.getAweme();
            if ((aweme3 == null || (statusSafety2 = AwemeExtKt.getStatusSafety(aweme3)) == null || (videoMuteInfo2 = statusSafety2.getVideoMuteInfo()) == null || (quantityString = videoMuteInfo2.getMuteDetailNotice()) == null) && ((activityLJFF = C2214201BlK.LJFF()) == null || (quantityString = activityLJFF.getResources().getQuantityString(2131755659, 1)) == null)) {
                quantityString = "";
            }
            String curUserId = ((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIIJ().getCurUserId();
            if (C10IT.LJI(videoItemParams.getAweme())) {
                User author = videoItemParams.getAweme().getAuthor();
                if (author != null) {
                    uid = author.getUid();
                } else {
                    uid = null;
                }
                if (Intrinsics.LJFF(uid, curUserId)) {
                    if (!C735280Sso.LIZ(videoItemParams.getAweme()) && !C10IS.LJI(videoItemParams)) {
                        C844470XAv c844470XAv = C844470XAv.LIZ;
                        c844470XAv.getClass();
                        String string3 = C844470XAv.LIZ().getString(2131829774);
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append(string3);
                        sbLIZ.append(' ');
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(C2188811AlT.LIZIZ(sbLIZ));
                        c844470XAv.getClass();
                        SpannableString spannableString = new SpannableString(C844470XAv.LIZ().getString(2131829773));
                        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1r, C844470XAv.LIZ());
                        if (numLIZJ != null) {
                            C786410Ut5.p2(spannableString, new ForegroundColorSpan(numLIZJ.intValue()), 0, spannableString.length(), 33);
                        }
                        quantityString = spannableStringBuilder.append((CharSequence) spannableString);
                        if (C1453970nwJ.LIZJ() > 0) {
                            Context contextLIZ = C844470XAv.LIZ();
                            quantityString = new SpannableStringBuilder(contextLIZ.getString(2131857886)).append(vQ2(contextLIZ.getString(2131857887)));
                        }
                    } else {
                        C844470XAv.LIZ.getClass();
                        quantityString = C844470XAv.LIZ().getString(2131829774);
                    }
                }
            }
            if (C10IT.LJI(videoItemParams.getAweme())) {
                User author2 = videoItemParams.getAweme().getAuthor();
                if (author2 != null) {
                    uid2 = author2.getUid();
                }
                if (!Intrinsics.LJFF(uid2, curUserId)) {
                    C844470XAv.LIZ.getClass();
                    quantityString = C844470XAv.LIZ().getString(2131829774);
                }
            }
            if (C1865950yen.LIZ()) {
                i3 = R.attr.il;
            } else if (!C1865950yen.LIZIZ()) {
                i3 = R.attr.e4;
            }
            Aweme aweme4 = videoItemParams.getAweme();
            if (aweme4 != null && (statusSafety = AwemeExtKt.getStatusSafety(aweme4)) != null && (videoMuteInfo = statusSafety.getVideoMuteInfo()) != null && (muteDetailUrl = videoMuteInfo.getMuteDetailUrl()) != null) {
                str = muteDetailUrl;
            }
            return C10IU.LIZ(c10iu, 2, i3, R.raw.icon_speaker_x_mark_fill_ltr, quantityString, str, new AwS585S0100000_6(this, 20), new C19336710kv(this, 0), null, null, null, null, 1920);
        }
        if (!C10IS.LJ(videoItemParams)) {
            return c10iu;
        }
        return wQ2(c10iu, videoItemParams);
    }

    public final C10IU wQ2(C10IU c10iu, VideoItemParams videoItemParams) {
        AwemeStatus.MappedMuteStripStatus mappedMuteStripStatus;
        AwemeStatus.MappedMuteStripStatus mappedMuteStripStatus2;
        AwemeStatus.MappedMuteStripStatus mappedMuteStripStatus3;
        int i;
        Aweme aweme;
        Aweme aweme2;
        CharSequence charSequenceAppend;
        Aweme aweme3;
        Aweme aweme4;
        int i2;
        AwemeStatus.VideoMuteInfo videoMuteInfo;
        String muteDetailUrl;
        Aweme aweme5;
        AwemeStatus statusSafety = AwemeExtKt.getStatusSafety(videoItemParams.getAweme());
        if (statusSafety == null || (mappedMuteStripStatus = statusSafety.getMappedMuteStripStatus()) == null || mappedMuteStripStatus == (mappedMuteStripStatus2 = AwemeStatus.MappedMuteStripStatus.MUTE_STRIP_STATUS_UNKNOWN) || mappedMuteStripStatus == (mappedMuteStripStatus3 = AwemeStatus.MappedMuteStripStatus.MUTE_STRIP_STATUS_DISABLE)) {
            return c10iu;
        }
        if (!xQ2(videoItemParams.getAweme()) && !yQ2(videoItemParams.getAweme())) {
            return c10iu;
        }
        int i3 = this.LLILLJJLI + 1;
        this.LLILLJJLI = i3;
        if (i3 > 1) {
            this.LL = true;
        }
        if (C280420Ayu.LIZ()) {
            if (mappedMuteStripStatus != AwemeStatus.MappedMuteStripStatus.MUTE_STRIP_STATUS_FAILED && mappedMuteStripStatus != AwemeStatus.MappedMuteStripStatus.MUTE_STRIP_STATUS_SONGS_ADDED && mappedMuteStripStatus != AwemeStatus.MappedMuteStripStatus.MUTE_STRIP_STATUS_DIRECTLY_POSTED && mappedMuteStripStatus != mappedMuteStripStatus3 && mappedMuteStripStatus != mappedMuteStripStatus2) {
                this.LLILZIL = new WeakReference<>(videoItemParams);
                this.LLILZLL = new WeakReference<>(videoItemParams.getAweme());
                ((IReplaceMusicDownloadService) ServiceManager.get().getService(IReplaceMusicDownloadService.class)).LIZJ(this.LLIZ);
            } else {
                ((IReplaceMusicDownloadService) ServiceManager.get().getService(IReplaceMusicDownloadService.class)).LJ(this.LLIZ);
            }
        }
        if (yQ2(videoItemParams.getAweme())) {
            i = 4;
        } else {
            i = 3;
        }
        C844470XAv.LIZ.getClass();
        Context contextLIZ = C844470XAv.LIZ();
        VideoItemParams item = getItem();
        Animation animationLoadAnimation = null;
        if (item != null) {
            aweme = item.getAweme();
        } else {
            aweme = null;
        }
        String str = "";
        if (yQ2(aweme)) {
            charSequenceAppend = contextLIZ.getString(2131848631);
        } else {
            VideoItemParams item2 = getItem();
            if (item2 != null) {
                aweme2 = item2.getAweme();
            } else {
                aweme2 = null;
            }
            if (!xQ2(aweme2)) {
                charSequenceAppend = "";
            } else {
                charSequenceAppend = new SpannableStringBuilder(contextLIZ.getString(2131857886)).append(vQ2(contextLIZ.getString(2131857887)));
            }
        }
        VideoItemParams item3 = getItem();
        if (item3 != null) {
            aweme3 = item3.getAweme();
        } else {
            aweme3 = null;
        }
        if (yQ2(aweme3)) {
            i2 = R.raw.icon_spinner_normal;
        } else {
            VideoItemParams item4 = getItem();
            if (item4 != null) {
                aweme4 = item4.getAweme();
            } else {
                aweme4 = null;
            }
            if (xQ2(aweme4)) {
                i2 = R.raw.icon_speaker_x_mark_fill_ltr;
            } else {
                i2 = -1;
            }
        }
        try {
            VideoItemParams item5 = getItem();
            if (item5 != null) {
                aweme5 = item5.getAweme();
            } else {
                aweme5 = null;
            }
            if (yQ2(aweme5)) {
                animationLoadAnimation = AnimationUtils.loadAnimation(C844470XAv.LIZ(), R.anim.f481io);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C2344809Gs.LJI(e);
        }
        AwemeStatus statusSafety2 = AwemeExtKt.getStatusSafety(videoItemParams.getAweme());
        if (statusSafety2 != null && (videoMuteInfo = statusSafety2.getVideoMuteInfo()) != null && (muteDetailUrl = videoMuteInfo.getMuteDetailUrl()) != null) {
            str = muteDetailUrl;
        }
        return C10IU.LIZ(c10iu, i, R.attr.zg, i2, charSequenceAppend, str, null, null, animationLoadAnimation, new AwS463S0200000_28(this, videoItemParams, 3), new AwS394S0200000_28(this, videoItemParams, 19), new AwS463S0200000_28(this, videoItemParams, 4), 96);
    }
}
