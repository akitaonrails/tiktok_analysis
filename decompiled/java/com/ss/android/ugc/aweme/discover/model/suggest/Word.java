package com.ss.android.ugc.aweme.discover.model.suggest;

import X.C08F2;
import X.C09C2;
import X.C09CT;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.io.Serializable;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class Word implements Serializable {

    @C09CT("active_timestamp")
    public String activeTimestamp;
    public String attachProductId;
    public HashMap<String, String> curPlaceHolderInfoMap;

    @C09CT("current_placeholder_info")
    public String currentPlaceholderInfo;

    @C09CT("group_id")
    public String groupId;

    @C09CT("hot_level")
    public String hotLevel;
    public transient String id;
    public String implId;
    public boolean isFromRefresh;
    public boolean isShowed;

    @C09CT("params")
    public Params params;

    @C09CT("qrec_json_info")
    public String qrecJsonInfo;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public String realId;

    @C09CT("show_position")
    public String showPosition;

    @C09CT("show_word")
    public String showWord;

    @C09CT("textnet_id")
    public String textnetId;

    @C09CT("type_image")
    public UrlModel typeImage;

    @C09CT(alternate = {"words_content"}, value = "word")
    public String word;

    @C09CT("words_position")
    public int wordPosition;

    @C09CT("word_record")
    public WordRecord wordRecord;

    @C09CT("words_type")
    public String wordType;

    @C09CT("words_label")
    public String wordsLabel;

    @C09CT("words_lang")
    public String wordsLang;

    @C09CT("words_source")
    public String wordSource = "sug";

    @C09CT("is_personalized")
    public Boolean isPersonalized = Boolean.FALSE;

    private final String generateId() {
        if (TextUtils.isEmpty(this.groupId)) {
            this.groupId = String.valueOf(C08F2.LIZ(this.word));
        }
        return this.groupId;
    }

    public final boolean checkAndResetIsFromRefresh() {
        if (!this.isFromRefresh) {
            return false;
        }
        this.isFromRefresh = false;
        return true;
    }

    public final HashMap<String, String> getCurrentPlaceholderInfoMap() {
        HashMap<String, String> map;
        HashMap<String, String> map2 = this.curPlaceHolderInfoMap;
        if (!(map2 == null || map2.isEmpty())) {
            HashMap<String, String> map3 = this.curPlaceHolderInfoMap;
            return map3 == null ? new HashMap<>() : map3;
        }
        String str = this.currentPlaceholderInfo;
        if (str == null || str.length() == 0) {
            return new HashMap<>();
        }
        String str2 = this.currentPlaceholderInfo;
        if (str2 == null) {
            return new HashMap<>();
        }
        try {
            map = (HashMap) C09C2.LIZ().LJIIIIZZ(str2, new TypeToken<HashMap<String, String>>() { // from class: com.ss.android.ugc.aweme.discover.model.suggest.Word.getCurrentPlaceholderInfoMap.1
            }.getType());
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            map = new HashMap<>();
        }
        this.curPlaceHolderInfoMap = map;
        return map == null ? new HashMap<>() : map;
    }

    public int hashCode() {
        String str = this.word;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public Word() {
    }

    public final String getId() {
        return generateId();
    }

    public final String getActiveTimestamp() {
        return this.activeTimestamp;
    }

    public final String getAttachProductId() {
        return this.attachProductId;
    }

    public final HashMap<String, String> getCurPlaceHolderInfoMap() {
        return this.curPlaceHolderInfoMap;
    }

    public final String getCurrentPlaceholderInfo() {
        return this.currentPlaceholderInfo;
    }

    public final String getGroupId() {
        return this.groupId;
    }

    public final String getHotLevel() {
        return this.hotLevel;
    }

    public final String getImplId() {
        return this.implId;
    }

    public final Params getParams() {
        return this.params;
    }

    public final String getQrecJsonInfo() {
        return this.qrecJsonInfo;
    }

    public final String getRealId() {
        return this.realId;
    }

    public final String getShowPosition() {
        return this.showPosition;
    }

    public final String getShowWord() {
        return this.showWord;
    }

    public final String getTextnetId() {
        return this.textnetId;
    }

    public final UrlModel getTypeImage() {
        return this.typeImage;
    }

    public final String getWord() {
        return this.word;
    }

    public final int getWordPosition() {
        return this.wordPosition;
    }

    public final WordRecord getWordRecord() {
        return this.wordRecord;
    }

    public final String getWordSource() {
        return this.wordSource;
    }

    public final String getWordType() {
        return this.wordType;
    }

    public final String getWordsLabel() {
        return this.wordsLabel;
    }

    public final String getWordsLang() {
        return this.wordsLang;
    }

    public final boolean isFromRefresh() {
        return this.isFromRefresh;
    }

    public final Boolean isPersonalized() {
        return this.isPersonalized;
    }

    public final boolean isShowed() {
        return this.isShowed;
    }

    public boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (Intrinsics.LJFF(Word.class, cls) && Intrinsics.LJFF(this.word, ((Word) obj).word)) {
            return true;
        }
        return false;
    }

    public final void setActiveTimestamp(String str) {
        this.activeTimestamp = str;
    }

    public final void setAttachProductId(String str) {
        this.attachProductId = str;
    }

    public final void setCurPlaceHolderInfoMap(HashMap<String, String> map) {
        this.curPlaceHolderInfoMap = map;
    }

    public final void setCurrentPlaceholderInfo(String str) {
        this.currentPlaceholderInfo = str;
    }

    public final void setFromRefresh(boolean z) {
        this.isFromRefresh = z;
    }

    public final void setGroupId(String str) {
        this.groupId = str;
    }

    public final void setHotLevel(String str) {
        this.hotLevel = str;
    }

    public final void setId(String str) {
        this.id = str;
    }

    public final void setImplId(String str) {
        this.implId = str;
    }

    public final void setParams(Params params) {
        this.params = params;
    }

    public final void setPersonalized(Boolean bool) {
        this.isPersonalized = bool;
    }

    public final void setQrecJsonInfo(String str) {
        this.qrecJsonInfo = str;
    }

    public final void setRealId(String str) {
        this.realId = str;
    }

    public final void setShowPosition(String str) {
        this.showPosition = str;
    }

    public final void setShowWord(String str) {
        this.showWord = str;
    }

    public final void setShowed(boolean z) {
        this.isShowed = z;
    }

    public final void setTextnetId(String str) {
        this.textnetId = str;
    }

    public final void setTypeImage(UrlModel urlModel) {
        this.typeImage = urlModel;
    }

    public final void setWord(String str) {
        this.word = str;
    }

    public final void setWordPosition(int i) {
        this.wordPosition = i;
    }

    public final void setWordRecord(WordRecord wordRecord) {
        this.wordRecord = wordRecord;
    }

    public final void setWordSource(String str) {
        this.wordSource = str;
    }

    public final void setWordType(String str) {
        this.wordType = str;
    }

    public final void setWordsLabel(String str) {
        this.wordsLabel = str;
    }

    public final void setWordsLang(String str) {
        this.wordsLang = str;
    }

    public Word(String str, String str2) {
        this.groupId = str;
        this.word = str2;
    }
}
