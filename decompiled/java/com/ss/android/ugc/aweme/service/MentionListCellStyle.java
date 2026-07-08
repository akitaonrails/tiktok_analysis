package com.ss.android.ugc.aweme.service;

import X.C20585715gt;
import X.C2097608Jq;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes32.dex */
public final class MentionListCellStyle {
    public final Integer avatarSize;
    public final Integer cellHeight;
    public final Integer cellWidth;
    public final Integer marginRight;
    public final Integer nameFontSize;
    public static final C20585715gt Companion = new Object() { // from class: X.15gt
    };
    public static final MentionListCellStyle DEFAULT = new MentionListCellStyle(null, null, null, null, null);
    public static final MentionListCellStyle COMPACT = new MentionListCellStyle(48, 66, 36, 10, 8);

    public MentionListCellStyle() {
        this(null, null, null, null, null);
    }

    public final Map<String, String> toExtraParams() {
        Pair[] pairArr = new Pair[5];
        Integer num = this.cellWidth;
        pairArr[0] = new Pair("cell_width", num != null ? num.toString() : null);
        Integer num2 = this.cellHeight;
        pairArr[1] = new Pair("cell_height", num2 != null ? num2.toString() : null);
        Integer num3 = this.avatarSize;
        pairArr[2] = new Pair("avatar_size", num3 != null ? num3.toString() : null);
        Integer num4 = this.nameFontSize;
        pairArr[3] = new Pair("name_size", num4 != null ? num4.toString() : null);
        Integer num5 = this.marginRight;
        pairArr[4] = new Pair("margin_right", num5 != null ? num5.toString() : null);
        return C2097608Jq.LJIIIIZZ(pairArr);
    }

    public MentionListCellStyle(Integer num, Integer num2, Integer num3, Integer num4, Integer num5) {
        this.cellWidth = num;
        this.cellHeight = num2;
        this.avatarSize = num3;
        this.nameFontSize = num4;
        this.marginRight = num5;
    }
}
