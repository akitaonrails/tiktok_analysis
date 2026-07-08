package com.ss.android.ugc.aweme.search.model;

import X.C09CT;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.discover.model.Position;
import com.ss.android.ugc.aweme.discover.model.suggest.Word;
import com.ss.android.ugc.aweme.feed.model.search.PromotionInfo;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class SearchSugEntity {
    public transient int LIZ;
    public boolean LIZLLL;
    public Map<String, String> LJ;
    public transient boolean LJFF;
    public transient String LJI;

    @C09CT("content")
    public String content;

    @C09CT("highlight_pos")
    public List<Position> highLightPositions;

    @C09CT("word_record")
    public Word mWord;

    @C09CT("pos")
    public List<Position> position;

    @C09CT("promotion_info")
    public PromotionInfo promoteInfo;

    @C09CT("rich_sug_info")
    public RichSugInfo richSugInfo;

    @C09CT("rich_sug_sec_pos")
    public List<Position> richSugSecPositions;

    @C09CT("extra_info")
    public SugExtraInfo sugExtraInfo;

    @C09CT("word_rich_expression")
    public EComWordRichExpression wordRichExpression;

    @C09CT("sug_type")
    public String sugType = "";

    @C09CT("language")
    public String language = "";
    public int LIZIZ = -1;
    public final transient int LIZJ = -1;

    public final List<Position> LIZ() {
        String str;
        List<Position> list;
        String str2 = this.LJI;
        return (str2 == null || (str = this.content) == null || !str.startsWith(str2) || (list = this.highLightPositions) == null || list.size() != 1) ? this.highLightPositions : Collections.singletonList(new Position(this.LJI.length(), this.content.length() - 1));
    }

    public final boolean LIZIZ() {
        SugExtraInfo sugExtraInfo = this.sugExtraInfo;
        if (sugExtraInfo == null) {
            return false;
        }
        return "11".equals(sugExtraInfo.getWordsType());
    }

    public final boolean LIZJ() {
        return TextUtils.equals(this.sugType, "history");
    }

    public final boolean LIZLLL() {
        SugExtraInfo sugExtraInfo = this.sugExtraInfo;
        if (sugExtraInfo == null) {
            return false;
        }
        return "2".equals(sugExtraInfo.getWordsType());
    }

    public final boolean LJ() {
        SugExtraInfo sugExtraInfo = this.sugExtraInfo;
        if (sugExtraInfo == null) {
            return false;
        }
        return "12".equals(sugExtraInfo.getWordsType());
    }
}
