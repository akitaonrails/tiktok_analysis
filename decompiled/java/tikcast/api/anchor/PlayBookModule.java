package tikcast.api.anchor;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class PlayBookModule {

    @C09CT("title")
    public String title = "";

    @C09CT("sub_title")
    public String subTitle = "";

    @C09CT("play_books")
    public List<PlayBookStruct> playBooks = new ArrayList();

    public static final class PlayBookStruct {

        @C09CT("title")
        public String title = "";

        @C09CT("image")
        public String image = "";

        @C09CT("book_id")
        public String bookId = "";

        @C09CT("content_id")
        public String contentId = "";

        @C09CT("description")
        public String description = "";
    }
}
