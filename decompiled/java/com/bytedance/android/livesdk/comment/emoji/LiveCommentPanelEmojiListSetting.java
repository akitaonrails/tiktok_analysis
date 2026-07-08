package com.bytedance.android.livesdk.comment.emoji;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes7.dex */
@SettingsKey(preciseExperiment = false, value = "live_comment_panel_emoji_list")
public final class LiveCommentPanelEmojiListSetting {
    public static final LiveCommentPanelEmojiListSetting INSTANCE = new LiveCommentPanelEmojiListSetting();
    public static final String[] DEFAULT = {"[wow]", "[laugh]", "[thanks]", "[laughcry]", "[thumb]", "[hi]", "[heart]", "[congrat]", "[rockyserious]", "[rockyloveit]", "[rockyproud]", "[rockycool]", "[rosiedislike]", "[rosiekisskiss]", "[rosieawkward]", "[rosiecute]", "[jolliekissingface]", "[jolliewow]", "[jolliesatisfied]", "[jolliespeechless]", "[sagethink]", "[sagefulfilled]", "[sageclever]", "[sagemoney]", "😃", "😄", "😁", "😆", "😅", "😂", "🤣", "☺️", "😊", "😇", "🙂", "🙃", "😉", "😌", "🥰", "😋", "😛", "😝", "😜", "🤪", "🤨", "🧐", "🤓", "😎", "🤩", "🥳", "😏", "😒", "😞", "😔", "😟", "😕", "🙁", "☹️", "😣", "😖", "😫", "😩", "🥺", "😢", "😭", "😤", "😠", "😡", "🤯", "😳", "🥵", "🥶", "😱", "😨", "😰", "😥", "😓", "🤗", "🤔", "🤭", "🤫", "🤥", "😶", "😐", "😑", "😬", "🙄", "😯", "😦", "😧", "😮", "😲", "😴", "😪", "😵", "🤐", "🥴", "🤧", "😷", "🤒", "🤕", "🤑", "🤠", "😈", "👿", "👹", "👺", "🤡", "👻", "💀", "☠️", "👽", "👾", "🤖", "🎃", "😺", "😸", "😹", "😻", "😼", "😽", "🙀", "😿", "😾"};

    public final String[] getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        String[] strArr = DEFAULT;
        String[] stringArrayValue = settingsManager.getStringArrayValue("live_comment_panel_emoji_list", strArr);
        return stringArrayValue != null ? stringArrayValue : strArr;
    }
}
