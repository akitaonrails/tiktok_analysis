package com.ss.android.ugc.aweme.sticker.data;

import X.C09CT;
import X.C13BV;
import X.C691302mt;
import X.EnumC2249711D3p;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.share.ShareInfo;
import com.ss.android.ugc.aweme.question.InviteInfo;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class QaStruct implements Serializable {
    public static final C691302mt Companion = new Object() { // from class: X.02mt
    };

    @C09CT("user_avatar")
    public UrlModel avatarUrl;

    @C09CT("category_meta")
    public String category_meta;

    @C09CT("collection_category")
    public Integer collectionCategory;

    @C09CT("extra")
    public String extra;

    @C09CT("extra_event_params")
    public HashMap<String, HashMap<String, String>> extraEventParams;

    @C09CT("invite_info")
    public InviteInfo inviteInfo;

    @C09CT("invite_share_info")
    public ShareInfo inviteShareInfo;

    @C09CT("invited_users")
    public List<Long> inviteUserList;

    @C09CT("item_id")
    public long itemId;

    @C09CT("content")
    public String questionContent;

    @C09CT("question_id")
    public long questionId;

    @C09CT("sec_uid")
    public String secId;

    @C09CT("source")
    public EnumC2249711D3p source;

    @C09CT("user_id")
    public long userId;

    @C09CT("username")
    public String userName;

    @C09CT("user_selected_categories")
    public String userSelectedCategory;

    @C09CT("videos_count")
    public int videosCount;

    public QaStruct() {
        this(0L, 0L, 0L, null, null, null, null, null, null, null, null, null, null, null, 0, null, null, 131071, null);
    }

    public QaStruct(long j) {
        this(j, 0L, 0L, null, null, null, null, null, null, null, null, null, null, null, 0, null, null, 131070, null);
    }

    public QaStruct(long j, long j2) {
        this(j, j2, 0L, null, null, null, null, null, null, null, null, null, null, null, 0, null, null, 131068, null);
    }

    public QaStruct(long j, long j2, long j3) {
        this(j, j2, j3, null, null, null, null, null, null, null, null, null, null, null, 0, null, null, 131064, null);
    }

    public QaStruct(long j, long j2, long j3, UrlModel urlModel) {
        this(j, j2, j3, urlModel, null, null, null, null, null, null, null, null, null, null, 0, null, null, 131056, null);
    }

    public QaStruct(long j, long j2, long j3, UrlModel urlModel, String str) {
        this(j, j2, j3, urlModel, str, null, null, null, null, null, null, null, null, null, 0, null, null, 131040, null);
    }

    public QaStruct(long j, long j2, long j3, UrlModel urlModel, String str, String str2) {
        this(j, j2, j3, urlModel, str, str2, null, null, null, null, null, null, null, null, 0, null, null, 131008, null);
    }

    public QaStruct(long j, long j2, long j3, UrlModel urlModel, String str, String str2, String str3) {
        this(j, j2, j3, urlModel, str, str2, str3, null, null, null, null, null, null, null, 0, null, null, 130944, null);
    }

    public QaStruct(long j, long j2, long j3, UrlModel urlModel, String str, String str2, String str3, List<Long> list) {
        this(j, j2, j3, urlModel, str, str2, str3, list, null, null, null, null, null, null, 0, null, null, 130816, null);
    }

    public QaStruct(long j, long j2, long j3, UrlModel urlModel, String str, String str2, String str3, List<Long> list, EnumC2249711D3p enumC2249711D3p) {
        this(j, j2, j3, urlModel, str, str2, str3, list, enumC2249711D3p, null, null, null, null, null, 0, null, null, 130560, null);
    }

    public QaStruct(long j, long j2, long j3, UrlModel urlModel, String str, String str2, String str3, List<Long> list, EnumC2249711D3p enumC2249711D3p, ShareInfo shareInfo) {
        this(j, j2, j3, urlModel, str, str2, str3, list, enumC2249711D3p, shareInfo, null, null, null, null, 0, null, null, 130048, null);
    }

    public QaStruct(long j, long j2, long j3, UrlModel urlModel, String str, String str2, String str3, List<Long> list, EnumC2249711D3p enumC2249711D3p, ShareInfo shareInfo, String str4) {
        this(j, j2, j3, urlModel, str, str2, str3, list, enumC2249711D3p, shareInfo, str4, null, null, null, 0, null, null, 129024, null);
    }

    public QaStruct(long j, long j2, long j3, UrlModel urlModel, String str, String str2, String str3, List<Long> list, EnumC2249711D3p enumC2249711D3p, ShareInfo shareInfo, String str4, HashMap<String, HashMap<String, String>> map) {
        this(j, j2, j3, urlModel, str, str2, str3, list, enumC2249711D3p, shareInfo, str4, map, null, null, 0, null, null, 126976, null);
    }

    public QaStruct(long j, long j2, long j3, UrlModel urlModel, String str, String str2, String str3, List<Long> list, EnumC2249711D3p enumC2249711D3p, ShareInfo shareInfo, String str4, HashMap<String, HashMap<String, String>> map, String str5) {
        this(j, j2, j3, urlModel, str, str2, str3, list, enumC2249711D3p, shareInfo, str4, map, str5, null, 0, null, null, 122880, null);
    }

    public QaStruct(long j, long j2, long j3, UrlModel urlModel, String str, String str2, String str3, List<Long> list, EnumC2249711D3p enumC2249711D3p, ShareInfo shareInfo, String str4, HashMap<String, HashMap<String, String>> map, String str5, String str6) {
        this(j, j2, j3, urlModel, str, str2, str3, list, enumC2249711D3p, shareInfo, str4, map, str5, str6, 0, null, null, 114688, null);
    }

    public QaStruct(long j, long j2, long j3, UrlModel urlModel, String str, String str2, String str3, List<Long> list, EnumC2249711D3p enumC2249711D3p, ShareInfo shareInfo, String str4, HashMap<String, HashMap<String, String>> map, String str5, String str6, int i) {
        this(j, j2, j3, urlModel, str, str2, str3, list, enumC2249711D3p, shareInfo, str4, map, str5, str6, i, null, null, 98304, null);
    }

    public QaStruct(long j, long j2, long j3, UrlModel urlModel, String str, String str2, String str3, List<Long> list, EnumC2249711D3p enumC2249711D3p, ShareInfo shareInfo, String str4, HashMap<String, HashMap<String, String>> map, String str5, String str6, int i, InviteInfo inviteInfo) {
        this(j, j2, j3, urlModel, str, str2, str3, list, enumC2249711D3p, shareInfo, str4, map, str5, str6, i, inviteInfo, null, 65536, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof QaStruct)) {
            return false;
        }
        QaStruct qaStruct = (QaStruct) obj;
        return this.questionId == qaStruct.questionId && this.userId == qaStruct.userId && this.itemId == qaStruct.itemId && Intrinsics.LJFF(this.avatarUrl, qaStruct.avatarUrl) && Intrinsics.LJFF(this.userName, qaStruct.userName) && Intrinsics.LJFF(this.questionContent, qaStruct.questionContent) && Intrinsics.LJFF(this.secId, qaStruct.secId) && Intrinsics.LJFF(this.inviteUserList, qaStruct.inviteUserList) && this.source == qaStruct.source && Intrinsics.LJFF(this.inviteShareInfo, qaStruct.inviteShareInfo) && Intrinsics.LJFF(this.extra, qaStruct.extra) && Intrinsics.LJFF(this.extraEventParams, qaStruct.extraEventParams) && Intrinsics.LJFF(this.category_meta, qaStruct.category_meta) && Intrinsics.LJFF(this.userSelectedCategory, qaStruct.userSelectedCategory) && this.videosCount == qaStruct.videosCount && Intrinsics.LJFF(this.inviteInfo, qaStruct.inviteInfo) && Intrinsics.LJFF(this.collectionCategory, qaStruct.collectionCategory);
    }

    public final void setExtra(String str) {
        this.extra = str;
    }

    public final void setSource(EnumC2249711D3p enumC2249711D3p) {
        this.source = enumC2249711D3p;
    }

    public QaStruct(long j, long j2, long j3, UrlModel urlModel, String str, String str2, String str3, List<Long> list, EnumC2249711D3p enumC2249711D3p, ShareInfo shareInfo, String str4, HashMap<String, HashMap<String, String>> map, String str5, String str6, int i, InviteInfo inviteInfo, Integer num) {
        this.questionId = j;
        this.userId = j2;
        this.itemId = j3;
        this.avatarUrl = urlModel;
        this.userName = str;
        this.questionContent = str2;
        this.secId = str3;
        this.inviteUserList = list;
        this.source = enumC2249711D3p;
        this.inviteShareInfo = shareInfo;
        this.extra = str4;
        this.extraEventParams = map;
        this.category_meta = str5;
        this.userSelectedCategory = str6;
        this.videosCount = i;
        this.inviteInfo = inviteInfo;
        this.collectionCategory = num;
    }

    public QaStruct(long j, long j2, long j3, UrlModel urlModel, String str, String str2, String str3, List list, EnumC2249711D3p enumC2249711D3p, ShareInfo shareInfo, String str4, HashMap map, String str5, String str6, int i, InviteInfo inviteInfo, Integer num, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0L : j, (i2 & 2) != 0 ? 0L : j2, (i2 & 4) == 0 ? j3 : 0L, (i2 & 8) != 0 ? null : urlModel, (i2 & 16) != 0 ? null : str, (i2 & 32) != 0 ? null : str2, (i2 & 64) != 0 ? null : str3, (i2 & 128) != 0 ? C13BV.INSTANCE : list, (i2 & 256) != 0 ? EnumC2249711D3p.Default : enumC2249711D3p, (i2 & 512) != 0 ? null : shareInfo, (i2 & 1024) != 0 ? null : str4, (i2 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? new HashMap() : map, (i2 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? "" : str5, (i2 & 8192) == 0 ? str6 : "", (i2 & 16384) != 0 ? 0 : i, (32768 & i2) != 0 ? null : inviteInfo, (i2 & 65536) != 0 ? null : num);
    }
}
