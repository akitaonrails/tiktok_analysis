package com.ss.android.ugc.aweme.story.inbox;

import X.AbstractC848400XPy;
import X.C09CT;
import X.C0XQ7;
import X.C13BV;
import com.ss.android.ugc.aweme.AccountUserService;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes12.dex */
public final class StoryInsertCard implements Serializable {
    public static final int $stable = 8;

    @C09CT("card_type")
    public final int cardType;

    @C09CT("cover_urls")
    public final List<UrlModel> coverUrls;
    public String enterFrom;

    @C09CT("insert_index")
    public final int insertIndex;

    @C09CT("user_has_publish_story")
    public final Integer userHasPublishStory;

    public StoryInsertCard() {
        this(0, 0, null, null, null, 31, null);
    }

    public final boolean insertLast() {
        return this.insertIndex == -1;
    }

    public final int cardStyle() {
        AccountUserService accountUserServiceLJIIJ;
        IAccountService iAccountService = (IAccountService) ServiceManager.get().getService(IAccountService.class);
        if (iAccountService != null && (accountUserServiceLJIIJ = iAccountService.LJIIJ()) != null) {
            accountUserServiceLJIIJ.getCurUser().getAvatarLarger();
        }
        List<String> list = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser().boldFields;
        boolean z = list != null && list.contains("photo");
        if (this.coverUrls.isEmpty()) {
            return z ? 3 : 1;
        }
        if (this.coverUrls.size() == 1 || this.coverUrls.size() == 2) {
            return 2;
        }
        return this.coverUrls.size() >= 3 ? 4 : 0;
    }

    public final void setEnterFrom(String str) {
        this.enterFrom = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public StoryInsertCard(int i, int i2, List<? extends UrlModel> list, Integer num, String str) {
        this.cardType = i;
        this.insertIndex = i2;
        this.coverUrls = list;
        this.userHasPublishStory = num;
        this.enterFrom = str;
    }

    public StoryInsertCard(int i, int i2, List list, Integer num, String str, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? -1 : i2, (i3 & 4) != 0 ? C13BV.INSTANCE : list, (i3 & 8) != 0 ? null : num, (i3 & 16) == 0 ? str : null);
    }
}
