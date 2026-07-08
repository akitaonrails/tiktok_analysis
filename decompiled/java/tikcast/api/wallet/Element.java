package tikcast.api.wallet;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class Element {

    @C09CT("display")
    public boolean display;

    @C09CT("display_order")
    public int displayOrder;

    @C09CT("need_encrypted")
    public boolean needEncrypted;

    @C09CT("page_no")
    public long pageNo;

    @C09CT("element")
    public String element = "";

    @C09CT("param_name")
    public String paramName = "";

    @C09CT("param_value_type")
    public String paramValueType = "";

    @C09CT("icon_url")
    public String iconUrl = "";

    @C09CT("dark_mode_icon_url")
    public String darkModeIconUrl = "";

    @C09CT("starling_key")
    public String starlingKey = "";

    @C09CT("style_type")
    public String styleType = "";

    @C09CT("configuration")
    public String configuration = "";

    @C09CT("frontend_rule_list")
    public List<ElementCheckRule> frontendRuleList = new ArrayList();

    @C09CT("frontend_rule")
    public String frontendRule = "";

    @C09CT("display_tag")
    public String displayTag = "";

    @C09CT("cashier_option_list")
    public List<OptionElement> cashierOptionList = new ArrayList();

    @C09CT("option_list")
    public List<OptionElement> optionList = new ArrayList();

    @C09CT("placeholder")
    public String placeholder = "";

    @C09CT("extra")
    public String extra = "";

    @C09CT("info_key")
    public String infoKey = "";

    @C09CT("sub_element_list")
    public List<Element> subElementList = new ArrayList();
}
