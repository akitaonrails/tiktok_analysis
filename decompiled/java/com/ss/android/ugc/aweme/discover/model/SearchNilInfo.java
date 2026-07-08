package com.ss.android.ugc.aweme.discover.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchNilInfo implements Serializable {

    @C09CT("search_nil_item")
    public String nilItem;

    @C09CT("text_type")
    public Integer textType;
    public static final Companion Companion = new Companion();
    public static final String HIT_LIMIT = "hit_limit";
    public static final String HIT_HEAT_SPEECH = "hate_speech";
    public static final int HIT_TYPE_SENSITIVE = 12;
    public static final String HIT_CORE_TABLE = "hit_core_table";
    public static final String FEDERATION_EMPTY = "federation_empty";
    public static final String PACK_NIL = "pack_nil";

    public final boolean isHate() {
        return HIT_HEAT_SPEECH.equals(this.nilItem);
    }

    public final boolean isHitCoreTable() {
        return HIT_CORE_TABLE.equals(this.nilItem);
    }

    public final boolean isHitLimit() {
        return HIT_LIMIT.equals(this.nilItem);
    }

    public final boolean isSensitive() {
        return Integer.valueOf(HIT_TYPE_SENSITIVE).equals(this.textType);
    }

    public static final class Companion {
        public final String getFEDERATION_EMPTY() {
            return SearchNilInfo.FEDERATION_EMPTY;
        }

        public final String getHIT_CORE_TABLE() {
            return SearchNilInfo.HIT_CORE_TABLE;
        }

        public final String getHIT_HEAT_SPEECH() {
            return SearchNilInfo.HIT_HEAT_SPEECH;
        }

        public final String getHIT_LIMIT() {
            return SearchNilInfo.HIT_LIMIT;
        }

        public final int getHIT_TYPE_SENSITIVE() {
            return SearchNilInfo.HIT_TYPE_SENSITIVE;
        }

        public final String getPACK_NIL() {
            return SearchNilInfo.PACK_NIL;
        }
    }

    public final String getNilItem() {
        return this.nilItem;
    }

    public final Integer getTextType() {
        return this.textType;
    }

    public final void setNilItem(String str) {
        this.nilItem = str;
    }

    public final void setTextType(Integer num) {
        this.textType = num;
    }
}
