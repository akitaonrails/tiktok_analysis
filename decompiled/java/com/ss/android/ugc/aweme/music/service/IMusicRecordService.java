package com.ss.android.ugc.aweme.music.service;

import X.C15L7;
import android.app.Activity;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.feed.model.TtsVoiceInfo;
import com.ss.android.ugc.aweme.music.model.MusicStickerStruct;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.shortvideo.model.ShootExtraData;

/* JADX INFO: loaded from: classes10.dex */
public interface IMusicRecordService {
    void startRecord(LifecycleOwner lifecycleOwner, Activity activity, MusicModel musicModel, MusicStickerStruct musicStickerStruct, String str, String str2, C15L7 c15l7, int i, boolean z, String str3, int i2, String str4, String str5, String str6, Boolean bool, String str7, Boolean bool2, Boolean bool3, String str8, String str9, ShootExtraData shootExtraData, boolean z2, Boolean bool4, TtsVoiceInfo ttsVoiceInfo, String str10);

    void startRecord(LifecycleOwner lifecycleOwner, Activity activity, MusicModel musicModel, MusicStickerStruct musicStickerStruct, String str, String str2, C15L7 c15l7, int i, boolean z, String str3, int i2, String str4, String str5, String str6, Boolean bool, String str7, Boolean bool2, Boolean bool3, String str8, String str9, ShootExtraData shootExtraData, boolean z2, Boolean bool4, TtsVoiceInfo ttsVoiceInfo, boolean z3, String str10, String str11, String str12);

    void startRecord(LifecycleOwner lifecycleOwner, Activity activity, MusicModel musicModel, String str, String str2, C15L7 c15l7, int i, boolean z, String str3, int i2, String str4, String str5, String str6, Boolean bool, String str7, Boolean bool2, Boolean bool3, String str8, String str9, ShootExtraData shootExtraData, String str10);

    void startRecord(LifecycleOwner lifecycleOwner, Activity activity, MusicModel musicModel, String str, String str2, C15L7 c15l7, int i, boolean z, String str3, int i2, String str4, String str5, String str6, Boolean bool, String str7, Boolean bool2, Boolean bool3, String str8, String str9, ShootExtraData shootExtraData, boolean z2, Boolean bool4, String str10);

    void startRecord(LifecycleOwner lifecycleOwner, Activity activity, MusicModel musicModel, String str, String str2, C15L7 c15l7, int i, boolean z, String str3, int i2, String str4, String str5, String str6, Boolean bool, String str7, Boolean bool2, Boolean bool3, String str8, String str9, ShootExtraData shootExtraData, boolean z2, String str10);
}
