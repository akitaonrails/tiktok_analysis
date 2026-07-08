package com.ss.android.ugc.aweme.global.config.settings.pojo;

import X.C09CT;
import X.C316660CbA;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class ProAccountEnableDetailInfo {

    @C09CT("can_set_pro_g")
    public Boolean canSetProaccountGender;

    @C09CT("category_page_text")
    public CategoryPageTextStruct categoryPageText;

    @C09CT("is_proaccount_display")
    public Integer isProaccountDisplay;

    @C09CT("siwa_skip_bind")
    public Boolean siwaSkipBind;

    @C09CT("welcome_page_list")
    public List<WelcomePageTextStruct> welcomePageList = new ArrayList();

    @C09CT("category_list")
    public List<CategoryStruct> categoryList = new ArrayList();

    public Boolean getCanSetProaccountGender() throws C316660CbA {
        Boolean bool = this.canSetProaccountGender;
        if (bool != null) {
            return bool;
        }
        throw new C316660CbA();
    }

    public CategoryPageTextStruct getCategoryPageText() throws C316660CbA {
        CategoryPageTextStruct categoryPageTextStruct = this.categoryPageText;
        if (categoryPageTextStruct != null) {
            return categoryPageTextStruct;
        }
        throw new C316660CbA();
    }

    public Integer getIsProaccountDisplay() throws C316660CbA {
        Integer num = this.isProaccountDisplay;
        if (num != null) {
            return num;
        }
        throw new C316660CbA();
    }

    public Boolean getSiwaSkipBind() throws C316660CbA {
        Boolean bool = this.siwaSkipBind;
        if (bool != null) {
            return bool;
        }
        throw new C316660CbA();
    }

    public List<CategoryStruct> getCategoryList() {
        return this.categoryList;
    }

    public List<WelcomePageTextStruct> getWelcomePageList() {
        return this.welcomePageList;
    }
}
