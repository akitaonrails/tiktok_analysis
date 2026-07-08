package tikcast.api.anchor;

import X.C09CT;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class GetGoLIVEPlaybookRes {

    @C09CT("data")
    public Data data;

    public static final class Data {

        @C09CT("play_book_data")
        public byte[] playBookData;

        @C09CT("play_book_id")
        public long playBookId;

        @C09CT("play_book_title")
        public String playBookTitle = "";

        @C09CT("jump_golive_button_text")
        public String jumpGoliveButtonText = "";

        @C09CT("jump_view_playbooks_button_text")
        public String jumpViewPlaybooksButtonText = "";

        @C09CT("function_name_to_params_map")
        public Map<String, String> functionNameToParamsMap = new LinkedHashMap();
    }
}
