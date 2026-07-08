package com.ss.android.ugc.aweme.music.model;

import X.C09CT;

/* JADX INFO: loaded from: classes11.dex */
public class MusicSearchHistory {

    @C09CT("keyword")
    public String keyword;

    @C09CT("timestamp")
    public long timestamp;

    @C09CT("int")
    public int type;

    public int hashCode() {
        String str = this.keyword;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public MusicSearchHistory() {
    }

    public String getKeyword() {
        return this.keyword;
    }

    public long getTimestamp() {
        return this.timestamp;
    }

    public int getType() {
        return this.type;
    }

    public MusicSearchHistory(String str) {
        this.keyword = str;
        this.type = 1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        String str = this.keyword;
        String str2 = ((MusicSearchHistory) obj).keyword;
        if (str != null) {
            return str.equals(str2);
        }
        if (str2 == null) {
            return true;
        }
        return false;
    }

    public void setKeyword(String str) {
        this.keyword = str;
    }

    public void setTimestamp(long j) {
        this.timestamp = j;
    }

    public void setType(int i) {
        this.type = i;
    }

    public MusicSearchHistory(String str, int i) {
        this.keyword = str;
        this.type = i;
    }
}
