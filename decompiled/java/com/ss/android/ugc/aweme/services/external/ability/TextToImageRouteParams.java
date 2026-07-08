package com.ss.android.ugc.aweme.services.external.ability;

import android.os.Bundle;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes9.dex */
public final class TextToImageRouteParams {
    public final Bundle backBundle;
    public final Boolean backByClearTop;
    public final String backUrl;
    public final String cmtToPostInitialContentSource;
    public final String commentText;
    public final String creationId;
    public final String curPathPage;
    public final String curPathPageType;
    public final boolean directToChoose;
    public final boolean enableGuide;
    public final boolean enableStory;
    public final String entrance;
    public final Bundle etParams;
    public Bundle extraParams;
    public final String fromAid;
    public final String fromCid;
    public final String fromUid;
    public final String fromUserName;
    public final String insertIds;
    public final boolean isCommentSeekingHelp;
    public final Boolean landingBack;
    public final String prevPathPage;
    public final String searchExtra;
    public final String searchQuery;
    public final String shootEnterMethod;
    public final String shootWay;
    public final Boolean showEnterAnim;
    public final String textByAi;
    public final String textToImageEditTitle;
    public final int textTransPicStatus;
    public final boolean transTextToDesc;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public TextToImageRouteParams() {
        Object[] objArr = 0 == true ? 1 : 0;
        Object[] objArr2 = 0 == true ? 1 : 0;
        Object[] objArr3 = 0 == true ? 1 : 0;
        Object[] objArr4 = 0 == true ? 1 : 0;
        Object[] objArr5 = 0 == true ? 1 : 0;
        Object[] objArr6 = 0 == true ? 1 : 0;
        Object[] objArr7 = 0 == true ? 1 : 0;
        Object[] objArr8 = 0 == true ? 1 : 0;
        Object[] objArr9 = 0 == true ? 1 : 0;
        Object[] objArr10 = 0 == true ? 1 : 0;
        Object[] objArr11 = 0 == true ? 1 : 0;
        Object[] objArr12 = 0 == true ? 1 : 0;
        Object[] objArr13 = 0 == true ? 1 : 0;
        Object[] objArr14 = 0 == true ? 1 : 0;
        Object[] objArr15 = 0 == true ? 1 : 0;
        Object[] objArr16 = 0 == true ? 1 : 0;
        Object[] objArr17 = 0 == true ? 1 : 0;
        Object[] objArr18 = 0 == true ? 1 : 0;
        Object[] objArr19 = 0 == true ? 1 : 0;
        Object[] objArr20 = 0 == true ? 1 : 0;
        Object[] objArr21 = 0 == true ? 1 : 0;
        Object[] objArr22 = 0 == true ? 1 : 0;
        Object[] objArr23 = 0 == true ? 1 : 0;
        Object[] objArr24 = 0 == true ? 1 : 0;
        Object[] objArr25 = 0 == true ? 1 : 0;
        this(null, objArr, objArr2, objArr3, objArr4, objArr5, objArr6, objArr7, objArr8, false, 0 == true ? 1 : 0, objArr9, 0 == true ? 1 : 0, 0 == true ? 1 : 0, objArr10, objArr11, objArr12, objArr13, objArr14, objArr15, objArr16, objArr17, 0 == true ? 1 : 0, objArr18, objArr19, objArr20, objArr21, objArr22, objArr23, 0 == true ? 1 : 0, objArr24, Integer.MAX_VALUE, objArr25);
    }

    public static /* synthetic */ TextToImageRouteParams copy$default(TextToImageRouteParams textToImageRouteParams, String str, String str2, String str3, Boolean bool, Boolean bool2, Bundle bundle, String str4, Bundle bundle2, Bundle bundle3, boolean z, boolean z2, String str5, boolean z3, boolean z4, String str6, String str7, String str8, String str9, String str10, String str11, Boolean bool3, String str12, int i, String str13, String str14, String str15, String str16, String str17, String str18, boolean z5, String str19, int i2, Object obj) {
        boolean z6 = z4;
        boolean z7 = z3;
        String str20 = str5;
        boolean z8 = z2;
        boolean z9 = z;
        Bundle bundle4 = bundle3;
        Bundle bundle5 = bundle2;
        String str21 = str4;
        Bundle bundle6 = bundle;
        Boolean bool4 = bool2;
        Boolean bool5 = bool;
        String str22 = str3;
        String str23 = str2;
        String str24 = str;
        String str25 = str18;
        String str26 = str17;
        String str27 = str16;
        String str28 = str15;
        String str29 = str14;
        String str30 = str19;
        String str31 = str13;
        int i3 = i;
        String str32 = str12;
        Boolean bool6 = bool3;
        String str33 = str11;
        String str34 = str10;
        boolean z10 = z5;
        String str35 = str9;
        String str36 = str8;
        String str37 = str7;
        String str38 = str6;
        if ((i2 & 1) != 0) {
            str24 = textToImageRouteParams.creationId;
        }
        if ((i2 & 2) != 0) {
            str23 = textToImageRouteParams.searchQuery;
        }
        if ((i2 & 4) != 0) {
            str22 = textToImageRouteParams.shootWay;
        }
        if ((i2 & 8) != 0) {
            bool5 = textToImageRouteParams.landingBack;
        }
        if ((i2 & 16) != 0) {
            bool4 = textToImageRouteParams.backByClearTop;
        }
        if ((i2 & 32) != 0) {
            bundle6 = textToImageRouteParams.backBundle;
        }
        if ((i2 & 64) != 0) {
            str21 = textToImageRouteParams.backUrl;
        }
        if ((i2 & 128) != 0) {
            bundle5 = textToImageRouteParams.etParams;
        }
        if ((i2 & 256) != 0) {
            bundle4 = textToImageRouteParams.extraParams;
        }
        if ((i2 & 512) != 0) {
            z9 = textToImageRouteParams.enableStory;
        }
        if ((i2 & 1024) != 0) {
            z8 = textToImageRouteParams.transTextToDesc;
        }
        if ((i2 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            str20 = textToImageRouteParams.textToImageEditTitle;
        }
        if ((i2 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            z7 = textToImageRouteParams.enableGuide;
        }
        if ((i2 & 8192) != 0) {
            z6 = textToImageRouteParams.directToChoose;
        }
        if ((i2 & 16384) != 0) {
            str38 = textToImageRouteParams.entrance;
        }
        if ((32768 & i2) != 0) {
            str37 = textToImageRouteParams.fromCid;
        }
        if ((65536 & i2) != 0) {
            str36 = textToImageRouteParams.fromAid;
        }
        if ((131072 & i2) != 0) {
            str35 = textToImageRouteParams.fromUid;
        }
        if ((262144 & i2) != 0) {
            str34 = textToImageRouteParams.fromUserName;
        }
        if ((524288 & i2) != 0) {
            str33 = textToImageRouteParams.commentText;
        }
        if ((1048576 & i2) != 0) {
            bool6 = textToImageRouteParams.showEnterAnim;
        }
        if ((2097152 & i2) != 0) {
            str32 = textToImageRouteParams.insertIds;
        }
        if ((4194304 & i2) != 0) {
            i3 = textToImageRouteParams.textTransPicStatus;
        }
        if ((8388608 & i2) != 0) {
            str31 = textToImageRouteParams.prevPathPage;
        }
        if ((16777216 & i2) != 0) {
            str29 = textToImageRouteParams.curPathPage;
        }
        if ((33554432 & i2) != 0) {
            str28 = textToImageRouteParams.curPathPageType;
        }
        if ((67108864 & i2) != 0) {
            str27 = textToImageRouteParams.searchExtra;
        }
        if ((134217728 & i2) != 0) {
            str26 = textToImageRouteParams.shootEnterMethod;
        }
        if ((268435456 & i2) != 0) {
            str25 = textToImageRouteParams.cmtToPostInitialContentSource;
        }
        if ((536870912 & i2) != 0) {
            z10 = textToImageRouteParams.isCommentSeekingHelp;
        }
        if ((i2 & 1073741824) != 0) {
            str30 = textToImageRouteParams.textByAi;
        }
        return textToImageRouteParams.copy(str24, str23, str22, bool5, bool4, bundle6, str21, bundle5, bundle4, z9, z8, str20, z7, z6, str38, str37, str36, str35, str34, str33, bool6, str32, i3, str31, str29, str28, str27, str26, str25, z10, str30);
    }

    public final TextToImageRouteParams copy(String str, String str2, String str3, Boolean bool, Boolean bool2, Bundle bundle, String str4, Bundle bundle2, Bundle bundle3, boolean z, boolean z2, String str5, boolean z3, boolean z4, String str6, String str7, String str8, String str9, String str10, String str11, Boolean bool3, String str12, int i, String str13, String str14, String str15, String str16, String str17, String str18, boolean z5, String str19) {
        return new TextToImageRouteParams(str, str2, str3, bool, bool2, bundle, str4, bundle2, bundle3, z, z2, str5, z3, z4, str6, str7, str8, str9, str10, str11, bool3, str12, i, str13, str14, str15, str16, str17, str18, z5, str19);
    }

    public final boolean isCommentSeekingHelp() {
        return this.isCommentSeekingHelp;
    }

    public final void setExtraParams(Bundle bundle) {
        this.extraParams = bundle;
    }

    public TextToImageRouteParams(String str, String str2, String str3, Boolean bool, Boolean bool2, Bundle bundle, String str4, Bundle bundle2, Bundle bundle3, boolean z, boolean z2, String str5, boolean z3, boolean z4, String str6, String str7, String str8, String str9, String str10, String str11, Boolean bool3, String str12, int i, String str13, String str14, String str15, String str16, String str17, String str18, boolean z5, String str19) {
        this.creationId = str;
        this.searchQuery = str2;
        this.shootWay = str3;
        this.landingBack = bool;
        this.backByClearTop = bool2;
        this.backBundle = bundle;
        this.backUrl = str4;
        this.etParams = bundle2;
        this.extraParams = bundle3;
        this.enableStory = z;
        this.transTextToDesc = z2;
        this.textToImageEditTitle = str5;
        this.enableGuide = z3;
        this.directToChoose = z4;
        this.entrance = str6;
        this.fromCid = str7;
        this.fromAid = str8;
        this.fromUid = str9;
        this.fromUserName = str10;
        this.commentText = str11;
        this.showEnterAnim = bool3;
        this.insertIds = str12;
        this.textTransPicStatus = i;
        this.prevPathPage = str13;
        this.curPathPage = str14;
        this.curPathPageType = str15;
        this.searchExtra = str16;
        this.shootEnterMethod = str17;
        this.cmtToPostInitialContentSource = str18;
        this.isCommentSeekingHelp = z5;
        this.textByAi = str19;
    }

    public /* synthetic */ TextToImageRouteParams(String str, String str2, String str3, Boolean bool, Boolean bool2, Bundle bundle, String str4, Bundle bundle2, Bundle bundle3, boolean z, boolean z2, String str5, boolean z3, boolean z4, String str6, String str7, String str8, String str9, String str10, String str11, Boolean bool3, String str12, int i, String str13, String str14, String str15, String str16, String str17, String str18, boolean z5, String str19, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? null : str2, (i2 & 4) != 0 ? null : str3, (i2 & 8) != 0 ? null : bool, (i2 & 16) != 0 ? null : bool2, (i2 & 32) != 0 ? null : bundle, (i2 & 64) != 0 ? null : str4, (i2 & 128) != 0 ? null : bundle2, (i2 & 256) != 0 ? null : bundle3, (i2 & 512) != 0 ? true : z, (i2 & 1024) != 0 ? false : z2, (i2 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? "" : str5, (i2 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) == 0 ? z3 : true, (i2 & 8192) != 0 ? false : z4, (i2 & 16384) != 0 ? "" : str6, (32768 & i2) != 0 ? "" : str7, (65536 & i2) != 0 ? "" : str8, (131072 & i2) != 0 ? "" : str9, (262144 & i2) != 0 ? "" : str10, (524288 & i2) == 0 ? str11 : "", (1048576 & i2) != 0 ? null : bool3, (2097152 & i2) != 0 ? null : str12, (4194304 & i2) != 0 ? -1 : i, (8388608 & i2) != 0 ? null : str13, (16777216 & i2) != 0 ? null : str14, (33554432 & i2) != 0 ? null : str15, (67108864 & i2) != 0 ? null : str16, (134217728 & i2) != 0 ? null : str17, (268435456 & i2) != 0 ? null : str18, (536870912 & i2) != 0 ? false : z5, (i2 & 1073741824) != 0 ? null : str19);
    }
}
