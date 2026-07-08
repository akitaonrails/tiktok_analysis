package com.bytedance.ies.cutsame.cut_android;

import X.AnonymousClass0963;
import X.AnonymousClass0965;
import X.C08FF;
import X.C098200Yq;
import X.C189200o6;
import X.C2169008ee;
import X.C2188811AlT;
import X.C2254308sP;
import X.C559870LxZ;
import X.InterfaceC2044707zh;
import X.InterfaceC559900Lxc;
import com.bytedance.ies.cutsame.downloaderv2.IWuZhuiDownloader;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;
import java.util.Map;
import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public final class SmartMovieAdapter {
    public static final AnonymousClass0963 Companion = new Object() { // from class: X.0963
    };
    public long nativeAdapter;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class SmartMovieCKErrorCode {
        public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
        public static final /* synthetic */ SmartMovieCKErrorCode[] $VALUES;
        public static final AnonymousClass0965 Companion;
        public final int code;
        public static final SmartMovieCKErrorCode ZIP_EMPTY = new SmartMovieCKErrorCode("ZIP_EMPTY", 0, 1);
        public static final SmartMovieCKErrorCode UPLOAD_TOS_FAILURE = new SmartMovieCKErrorCode("UPLOAD_TOS_FAILURE", 1, 2);
        public static final SmartMovieCKErrorCode MUSIC_REQUEST_FAILURE = new SmartMovieCKErrorCode("MUSIC_REQUEST_FAILURE", 2, 3);
        public static final SmartMovieCKErrorCode COMPRESS_FAILURE = new SmartMovieCKErrorCode("COMPRESS_FAILURE", 3, 4);
        public static final SmartMovieCKErrorCode CONFIG_REQUEST_FAILURE = new SmartMovieCKErrorCode("CONFIG_REQUEST_FAILURE", 4, 5);
        public static final SmartMovieCKErrorCode FETCH_NLEMODEL_FAILURE = new SmartMovieCKErrorCode("FETCH_NLEMODEL_FAILURE", 5, 6);
        public static final SmartMovieCKErrorCode INPUT_RESOURCE_EXCEPTION = new SmartMovieCKErrorCode("INPUT_RESOURCE_EXCEPTION", 6, 7);
        public static final SmartMovieCKErrorCode HANDLE_TEMPLATE_FAILURE = new SmartMovieCKErrorCode("HANDLE_TEMPLATE_FAILURE", 7, 8);

        public static final /* synthetic */ SmartMovieCKErrorCode[] $values() {
            return new SmartMovieCKErrorCode[]{ZIP_EMPTY, UPLOAD_TOS_FAILURE, MUSIC_REQUEST_FAILURE, COMPRESS_FAILURE, CONFIG_REQUEST_FAILURE, FETCH_NLEMODEL_FAILURE, INPUT_RESOURCE_EXCEPTION, HANDLE_TEMPLATE_FAILURE};
        }

        public static InterfaceC2044707zh<SmartMovieCKErrorCode> getEntries() {
            return $ENTRIES;
        }

        /* JADX WARN: Type inference failed for: r0v9, types: [X.0965] */
        static {
            SmartMovieCKErrorCode[] smartMovieCKErrorCodeArr$values = $values();
            $VALUES = smartMovieCKErrorCodeArr$values;
            $ENTRIES = new C2254308sP(smartMovieCKErrorCodeArr$values);
            Companion = new Object() { // from class: X.0965
            };
        }

        public static SmartMovieCKErrorCode[] values() {
            return (SmartMovieCKErrorCode[]) $VALUES.clone();
        }

        public final int getCode() {
            return this.code;
        }

        public static final SmartMovieCKErrorCode fromInt(int i) {
            Companion.getClass();
            for (SmartMovieCKErrorCode smartMovieCKErrorCode : values()) {
                if (smartMovieCKErrorCode.getCode() == i) {
                    return smartMovieCKErrorCode;
                }
            }
            return FETCH_NLEMODEL_FAILURE;
        }

        public static SmartMovieCKErrorCode valueOf(String str) {
            return (SmartMovieCKErrorCode) C08FF.LIZ(SmartMovieCKErrorCode.class, str);
        }

        public SmartMovieCKErrorCode(String str, int i, int i2) {
            this.code = i2;
        }
    }

    public interface SmartMovieDownloadCallback {
        void onFailure(String str, SmartMovieCKErrorCode smartMovieCKErrorCode, String str2, Map<String, String> map);

        void onNeedFetch(List<String> list);

        void onProgress(float f);

        void onSuccess(NLEModel nLEModel);
    }

    public interface SmartMovieEffectDownCallback {
        void onFailure(String str, int i, String str2);

        void onProgress(float f);

        void onSuccess(String str, String str2, boolean z);
    }

    private final native long nativeCreate(DavinciResConfig davinciResConfig);

    private final native String nativeFetchEffectByUrs(long j, String str, SmartMovieEffectDownCallback smartMovieEffectDownCallback);

    private final native String nativeFetchModelEffects(long j, long j2, int i, boolean z, boolean z2, SmartMovieDownloadCallback smartMovieDownloadCallback);

    private final native void nativeFetchModelsByName(long j, String str, SmartMovieEffectDownCallback smartMovieEffectDownCallback);

    private final native void nativeRelease(long j);

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0963] */
    static {
        C2169008ee.LIZ.LIZ();
    }

    private final boolean isNativeNotValid() {
        return this.nativeAdapter == 0;
    }

    public final void finalize() {
        try {
            if (this.nativeAdapter != 0) {
                InterfaceC559900Lxc interfaceC559900Lxc = C559870LxZ.LIZ;
                C559870LxZ.LJFF("SmartMovieAdapter", "You forget to release SmartMovieAdapter !!");
                releaseObject();
            }
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    public final void releaseObject() {
        InterfaceC559900Lxc interfaceC559900Lxc = C559870LxZ.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("releaseObject : ");
        sbLIZ.append(this.nativeAdapter);
        C559870LxZ.LIZJ("SmartMovieAdapter", C2188811AlT.LIZIZ(sbLIZ));
        long j = this.nativeAdapter;
        if (j != 0) {
            nativeRelease(j);
            this.nativeAdapter = 0L;
        }
    }

    public SmartMovieAdapter() {
    }

    public SmartMovieAdapter(DavinciResConfig davinciResConfig) {
        this();
        this.nativeAdapter = nativeCreate(davinciResConfig);
    }

    public final String fetchEffectByUrs(String str, SmartMovieEffectDownCallback smartMovieEffectDownCallback) {
        InterfaceC559900Lxc interfaceC559900Lxc = C559870LxZ.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("fetchEffectByUrs: ");
        sbLIZ.append(str);
        C559870LxZ.LIZ("SmartMovieAdapter", C2188811AlT.LIZIZ(sbLIZ));
        if (isNativeNotValid()) {
            return "";
        }
        return nativeFetchEffectByUrs(this.nativeAdapter, str, smartMovieEffectDownCallback);
    }

    public final void fetchModelsByName(String str, SmartMovieEffectDownCallback smartMovieEffectDownCallback) {
        InterfaceC559900Lxc interfaceC559900Lxc = C559870LxZ.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("fetchModelsByName: ");
        sbLIZ.append(str);
        C559870LxZ.LIZ("SmartMovieAdapter", C2188811AlT.LIZIZ(sbLIZ));
        if (isNativeNotValid()) {
            return;
        }
        nativeFetchModelsByName(this.nativeAdapter, str, smartMovieEffectDownCallback);
    }

    public final String fetchModelEffects(NLEModel nLEModel, int i, boolean z, boolean z2, SmartMovieDownloadCallback smartMovieDownloadCallback) {
        InterfaceC559900Lxc interfaceC559900Lxc = C559870LxZ.LIZ;
        C559870LxZ.LIZ("SmartMovieAdapter", "fetchModelEffects");
        if (isNativeNotValid()) {
            return "";
        }
        return nativeFetchModelEffects(this.nativeAdapter, NLEModel.getCPtr(nLEModel), i, z, z2, smartMovieDownloadCallback);
    }

    public static final class DavinciResConfig {
        public final String accessKey;
        public final String appId;
        public final String appVersion;
        public final String deviceId;
        public final String deviceType;
        public final String effectSdkVersion;
        public final String language;
        public final String modelApiHost;
        public final String modelCacheDir;
        public final String platform;
        public final String platformSdkVersion;
        public final String region;
        public final String resourceCacheDir;
        public final IWuZhuiDownloader wuZhuiDownloader;

        public DavinciResConfig(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, IWuZhuiDownloader iWuZhuiDownloader) {
            this.appId = str;
            this.appVersion = str2;
            this.effectSdkVersion = str3;
            this.accessKey = str4;
            this.platform = str5;
            this.deviceId = str6;
            this.deviceType = str7;
            this.region = str8;
            this.language = str9;
            this.resourceCacheDir = str10;
            this.modelApiHost = str11;
            this.modelCacheDir = str12;
            this.platformSdkVersion = str13;
            this.wuZhuiDownloader = iWuZhuiDownloader;
        }
    }
}
