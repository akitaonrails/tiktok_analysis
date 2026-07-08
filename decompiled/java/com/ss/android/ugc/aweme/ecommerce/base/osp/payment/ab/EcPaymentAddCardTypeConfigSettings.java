package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ab;

import X.C09CT;
import com.bytedance.ies.abmock.SettingsManager;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class EcPaymentAddCardTypeConfigSettings {
    public static final AddCardTypeModel LIZ = new AddCardTypeModel(null, Boolean.FALSE);

    public static final AddCardTypeModel LIZ() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        AddCardTypeModel addCardTypeModel = LIZ;
        AddCardTypeModel addCardTypeModel2 = (AddCardTypeModel) settingsManagerLIZLLL.LJIIIIZZ("ec_payment_add_card_type_config", AddCardTypeModel.class, addCardTypeModel);
        return addCardTypeModel2 != null ? addCardTypeModel2 : addCardTypeModel;
    }

    public static final class AddCardTypeModel {

        @C09CT("filter_unsupported_installment_cards")
        public final Boolean filterUnSupportedInstallmentCards;

        @C09CT("support_card_type")
        public final List<Integer> supportCardType;

        public AddCardTypeModel() {
            this(null, Boolean.FALSE);
        }

        public AddCardTypeModel(List<Integer> list, Boolean bool) {
            this.supportCardType = list;
            this.filterUnSupportedInstallmentCards = bool;
        }
    }
}
