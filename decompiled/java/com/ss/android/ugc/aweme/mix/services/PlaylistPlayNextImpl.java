package com.ss.android.ugc.aweme.mix.services;

import X.C099R;
import X.C13LP;
import X.C1612570s47;
import X.InterfaceC1364105Vn;
import android.util.LruCache;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.PlayListInfo;
import com.ss.android.ugc.aweme.mix.api.response.MixVideosResponse;
import com.ss.android.ugc.aweme.service.IPlaylistPlayNextService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class PlaylistPlayNextImpl implements IPlaylistPlayNextService {
    public static final /* synthetic */ int LIZIZ = 0;
    public final LruCache<String, Pair<List<Aweme>, MixVideosResponse>> LIZ = new LruCache<>(1);

    @Override // com.ss.android.ugc.aweme.service.IPlaylistPlayNextService
    public final void LIZ(String str) {
        this.LIZ.remove(str);
    }

    @Override // com.ss.android.ugc.aweme.service.IPlaylistPlayNextService
    public final Object LIZIZ(Aweme aweme, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        String mixId;
        List<Aweme> arrayList;
        MixVideosResponse second;
        C1612570s47 c1612570s47;
        String str;
        String str2;
        String aid = aweme.getAid();
        if (aid == null) {
            return Unit.LIZ;
        }
        PlayListInfo playListInfo = aweme.playlist_info;
        if (playListInfo != null && (mixId = playListInfo.getMixId()) != null) {
            Pair<List<Aweme>, MixVideosResponse> pair = this.LIZ.get(mixId);
            if (pair == null || (arrayList = pair.getFirst()) == null) {
                arrayList = new ArrayList<>();
            }
            String str3 = null;
            if (pair != null) {
                second = pair.getSecond();
            } else {
                second = null;
            }
            Iterator<Aweme> it2 = arrayList.iterator();
            int i = 0;
            while (true) {
                if (it2.hasNext()) {
                    if (Intrinsics.LJFF(it2.next().getAid(), aid)) {
                        break;
                    }
                    i++;
                } else {
                    i = -1;
                    break;
                }
            }
            if (arrayList.size() > i + 1) {
                return Unit.LIZ;
            }
            if ((second != null && second.hasMore) || pair == null) {
                if (AwemeExtKt.getAuthorUid(aweme) == null) {
                    return Unit.LIZ;
                }
                if (AwemeExtKt.getSecAuthorUid(aweme) == null) {
                    return Unit.LIZ;
                }
                String authorUid = AwemeExtKt.getAuthorUid(aweme);
                String secAuthorUid = AwemeExtKt.getSecAuthorUid(aweme);
                HashMap<String, String> mobParams = aweme.getMobParams();
                if (mobParams != null && mobParams.containsKey("source_video_id")) {
                    HashMap<String, String> mobParams2 = aweme.getMobParams();
                    if (mobParams2 != null) {
                        str = mobParams2.get("source_video_id");
                    } else {
                        str = null;
                    }
                    HashMap<String, String> mobParams3 = aweme.getMobParams();
                    if (mobParams3 != null) {
                        str2 = mobParams3.get("source_group_id");
                    } else {
                        str2 = null;
                    }
                    HashMap<String, String> mobParams4 = aweme.getMobParams();
                    if (mobParams4 != null) {
                        str3 = mobParams4.get("source_author_id");
                    }
                    c1612570s47 = new C1612570s47(str, str2, str3, null, null, "", "", "", "");
                } else {
                    c1612570s47 = new C1612570s47(aweme.getAid(), aweme.getGroupId(), AwemeExtKt.getAuthorUid(aweme), null, null, "", "", "", "");
                }
                Object objLJ = LJ(mixId, authorUid, secAuthorUid, aweme, arrayList, c1612570s47, interfaceC1364105Vn);
                if (objLJ == C099R.LJFF()) {
                    return objLJ;
                }
                return Unit.LIZ;
            }
            return Unit.LIZ;
        }
        return Unit.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.service.IPlaylistPlayNextService
    public final Aweme LIZJ(String str, String str2) {
        List<Aweme> first;
        Pair<List<Aweme>, MixVideosResponse> pair = this.LIZ.get(str2);
        if (pair != null && (first = pair.getFirst()) != null) {
            Iterator<Aweme> it2 = first.iterator();
            int i = 0;
            while (true) {
                if (it2.hasNext()) {
                    if (Intrinsics.LJFF(it2.next().getAid(), str)) {
                        break;
                    }
                    i++;
                } else {
                    i = -1;
                    break;
                }
            }
            return (Aweme) C13LP.LJJJLZIJ(i + 1, first);
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.service.IPlaylistPlayNextService
    public final void LIZLLL(Aweme aweme, String str) {
        List<Aweme> arrayList;
        String aid;
        Pair<List<Aweme>, MixVideosResponse> pair = this.LIZ.get(str);
        if (pair == null || (arrayList = pair.getFirst()) == null) {
            arrayList = new ArrayList<>();
        }
        if (!arrayList.isEmpty()) {
            Iterator<Aweme> it2 = arrayList.iterator();
            while (it2.hasNext()) {
                String aid2 = it2.next().getAid();
                if (aweme != null) {
                    aid = aweme.getAid();
                } else {
                    aid = null;
                }
                if (Intrinsics.LJFF(aid2, aid)) {
                    return;
                }
            }
        }
        this.LIZ.remove(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0032  */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJ(java.lang.String r22, java.lang.String r23, java.lang.String r24, com.ss.android.ugc.aweme.feed.model.Aweme r25, java.util.List<com.ss.android.ugc.aweme.feed.model.Aweme> r26, X.C1612570s47 r27, X.InterfaceC1364105Vn<? super kotlin.Unit> r28) {
        /*
            Method dump skipped, instruction units count: 299
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.mix.services.PlaylistPlayNextImpl.LJ(java.lang.String, java.lang.String, java.lang.String, com.ss.android.ugc.aweme.feed.model.Aweme, java.util.List, X.0s47, X.05Vn):java.lang.Object");
    }
}
