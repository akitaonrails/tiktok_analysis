package com.bytedance.android.livesdk.gift.publicinterface.model;

import X.C215700sN;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class DebugToolAssetsModel {
    public static final int DOWNLOAD_TYPE_UNKONW = 0;
    public final String bytevc1Md5;
    public final String describe;
    public final int downloadType;
    public final long effectId;
    public final int effectResourceType;
    public final String h264Md5;
    public final List<String> h264ResourceUrlList;
    public final String name;
    public final List<String> resourceByteVC1UrlList;
    public final long size;
    public final List<VideoResource> videoResourceList;
    public static final C215700sN Companion = new Object() { // from class: X.00sN
    };
    public static final int RESOURCE_TYPE_WEBP = 1;
    public static final int RESOURCE_TYPE_LOTTIE = 2;
    public static final int RESOURCE_TYPE_MP4 = 4;
    public static final int RESOURCE_TYPE_STICKER = 5;
    public static final int RESOURCE_TYPE_EFFECT_LOKI = 6;
    public static final int RESOURCE_TYPE_LYNX = 8;
    public static final int RESOURCE_TYPE_ENTER_WEBP = 9;
    public static final int DOWNLOAD_TYPE_YES = 1;
    public static final int DOWNLOAD_TYPE_NO = 2;

    public DebugToolAssetsModel() {
        this(0L, "", "", "", 0, null, null, null, 0L, 0, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0056 A[RETURN] */
    @X.InterfaceC1294060jmO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String getResourceFormat() {
        /*
            r6 = this;
            java.util.List<com.bytedance.android.livesdk.gift.publicinterface.model.VideoResource> r0 = r6.videoResourceList
            r5 = 1
            if (r0 == 0) goto L37
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L37
            r0 = 0
        Lc:
            java.lang.String r4 = "h264"
            java.lang.String r3 = "bytevc1"
            if (r0 != 0) goto L45
            java.util.List<com.bytedance.android.livesdk.gift.publicinterface.model.VideoResource> r1 = r6.videoResourceList
            if (r1 == 0) goto L39
            java.util.ArrayList r2 = new java.util.ArrayList
            r0 = 10
            int r0 = X.C15438062q.LJIJJ(r1, r0)
            r2.<init>(r0)
            java.util.Iterator r1 = r1.iterator()
        L25:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L3a
            java.lang.Object r0 = r1.next()
            com.bytedance.android.livesdk.gift.publicinterface.model.VideoResource r0 = (com.bytedance.android.livesdk.gift.publicinterface.model.VideoResource) r0
            java.lang.String r0 = r0.videoTypeName
            r2.add(r0)
            goto L25
        L37:
            r0 = 1
            goto Lc
        L39:
            r2 = 0
        L3a:
            java.lang.String r1 = "bytevc1opt"
            if (r2 == 0) goto L4f
            boolean r0 = r2.contains(r1)
            if (r0 != r5) goto L50
            return r1
        L45:
            java.lang.String r0 = r6.bytevc1Md5
            if (r0 == 0) goto L4f
            int r0 = r0.length()
            if (r0 != 0) goto L56
        L4f:
            return r4
        L50:
            boolean r0 = r2.contains(r3)
            if (r0 != r5) goto L4f
        L56:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.gift.publicinterface.model.DebugToolAssetsModel.getResourceFormat():java.lang.String");
    }

    public final String getResourceFormat(String str) {
        VideoResource next;
        String str2;
        if (str != null) {
            List<VideoResource> list = this.videoResourceList;
            if (list != null) {
                Iterator<VideoResource> it2 = list.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        next = it2.next();
                        if (Intrinsics.LJFF(next.videoMd5, str)) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                VideoResource videoResource = next;
                if (videoResource != null && (str2 = videoResource.videoTypeName) != null) {
                    return str2;
                }
            }
            if (Intrinsics.LJFF(str, this.bytevc1Md5)) {
                return "bytevc1";
            }
            if (Intrinsics.LJFF(str, this.h264Md5)) {
                return "h264";
            }
        }
        return null;
    }

    public DebugToolAssetsModel(long j, String str, String str2, String str3, int i, List<String> list, List<String> list2, String str4, long j2, int i2, List<VideoResource> list3) {
        this.effectId = j;
        this.name = str;
        this.describe = str2;
        this.h264Md5 = str3;
        this.effectResourceType = i;
        this.h264ResourceUrlList = list;
        this.resourceByteVC1UrlList = list2;
        this.bytevc1Md5 = str4;
        this.size = j2;
        this.downloadType = i2;
        this.videoResourceList = list3;
    }
}
