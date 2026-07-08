package com.ss.android.ugc.aweme.search.model;

import X.C07IU;
import X.C07IV;
import X.C09CT;
import X.C668120QIo;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Objects;

/* JADX INFO: loaded from: classes11.dex */
public class SearchHistory {
    public int LIZ;
    public transient HashMap<Integer, Boolean> LIZIZ;
    public transient HashMap<Integer, RichHisInfo> LIZJ;

    @C09CT("author_name")
    public String authorName;

    @C09CT("cover_image_url")
    public String coverImageUrl;

    @C09CT("enter_method")
    public String enterMethod;

    @C09CT("history_intent")
    public Integer historySearchIntentType;

    @C09CT("is_original_music")
    public boolean isOriginalMusic;

    @C09CT("is_valid_music")
    public boolean isValidMusic;

    @C09CT("keyword")
    public String keyword;

    @C09CT("music_id")
    public String musicId;

    @C09CT("search_extra_params")
    public HashMap<String, String> searchExtraParams;

    @C09CT("timestamp")
    public long timestamp;

    @C09CT("int")
    public int type;

    @C09CT("uid")
    public String uid;

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.keyword, this.uid, this.musicId});
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LIZIZ() {
        /*
            r3 = this;
            boolean r0 = r3.isValidMusic
            r2 = 0
            r1 = 1
            if (r0 == 0) goto L17
            X.0QKB r0 = X.C0QKB.LIZ
            r0.getClass()
            X.01GW r0 = X.C0QKB.LIZJ
            java.lang.Object r0 = r0.getValue()
            com.ss.android.ugc.aweme.config.SearchMusicHistoryOptConfig r0 = (com.ss.android.ugc.aweme.config.SearchMusicHistoryOptConfig) r0
            int r0 = r0.isAllMusicInvalid
            if (r0 != r1) goto L1d
        L17:
            boolean r0 = X.C0QPQ.LIZIZ()
            if (r0 != 0) goto L1e
        L1d:
            r2 = 1
        L1e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.model.SearchHistory.LIZIZ():boolean");
    }

    public SearchHistory() {
        this.LIZ = -1;
        this.LIZIZ = new HashMap<>();
        this.LIZJ = new HashMap<>();
    }

    public final String toString() {
        return this.keyword;
    }

    public SearchHistory(String str) {
        this.LIZ = -1;
        this.LIZIZ = new HashMap<>();
        this.LIZJ = new HashMap<>();
        this.keyword = str;
        this.type = 1;
    }

    public final Integer LIZ(Integer num) {
        HashMap<Integer, Boolean> map;
        String str;
        if (C07IV.LIZ && (map = this.LIZIZ) != null && this.LIZJ != null) {
            Boolean bool = map.get(num);
            if (bool != null && bool.booleanValue()) {
                return null;
            }
            RichHisInfo richHisInfo = this.LIZJ.get(num);
            if (richHisInfo != null) {
                if (C07IU.LIZIZ && C668120QIo.LIZ(this.keyword) && (str = richHisInfo.subTitle) != null && !str.isEmpty()) {
                    return null;
                }
                return richHisInfo.iconType;
            }
        }
        return this.historySearchIntentType;
    }

    public final String LIZJ(Integer num) {
        RichHisInfo richHisInfo = this.LIZJ.get(num);
        if (richHisInfo != null && C668120QIo.LIZ(this.keyword)) {
            return richHisInfo.subTitleLabel;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        String str;
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            try {
                SearchHistory searchHistory = (SearchHistory) obj;
                String str2 = this.musicId;
                if (str2 != null && !str2.isEmpty() && (str = searchHistory.musicId) != null && !str.isEmpty()) {
                    z = true;
                } else {
                    z = false;
                }
                if (!Objects.equals(this.musicId, searchHistory.musicId) && (!z || Objects.equals(this.musicId, searchHistory.musicId) || !Objects.equals(this.keyword, searchHistory.keyword))) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (Objects.equals(this.keyword, searchHistory.keyword)) {
                    if (Objects.equals(this.uid, searchHistory.uid) && z2) {
                        return true;
                    }
                    return false;
                }
                return false;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return false;
    }

    public SearchHistory(String str, int i) {
        this.LIZ = -1;
        this.LIZIZ = new HashMap<>();
        this.LIZJ = new HashMap<>();
        this.keyword = str;
        this.type = i;
    }

    public final void LIZLLL(int i, boolean z) {
        if (this.LIZIZ == null) {
            this.LIZIZ = new HashMap<>();
        }
        this.LIZIZ.put(Integer.valueOf(i), Boolean.valueOf(z));
    }

    public final void LJ(RichHisInfo richHisInfo, int i) {
        if (this.LIZJ == null) {
            this.LIZJ = new HashMap<>();
        }
        this.LIZJ.put(Integer.valueOf(i), richHisInfo);
    }

    public SearchHistory(String str, int i, String str2) {
        this.LIZ = -1;
        this.LIZIZ = new HashMap<>();
        this.LIZJ = new HashMap<>();
        this.keyword = str;
        this.type = i;
        this.uid = str2;
    }
}
