package com.ss.android.ugc.aweme.services.external;

import androidx.fragment.app.DialogFragment;
import com.ss.android.ugc.aweme.base.model.UrlModel;

/* JADX INFO: loaded from: classes20.dex */
public interface IDonationService {

    public interface OnDonationOrgChangeListener {
        void onDismiss();

        void onOrgSelected(OrganizationModel organizationModel);
    }

    DialogFragment getSelectDonationDialog(OnDonationOrgChangeListener onDonationOrgChangeListener);

    public static final class OrganizationModel {
        public String addTime;
        public final String desc;
        public final String detailUrl;
        public final String donateLink;
        public final String fundraiserId;
        public final UrlModel icon;
        public final String name;
        public final Integer ngoId;
        public final String orgId;
        public final String orgType;

        public final void setAddTime(String str) {
            this.addTime = str;
        }

        public OrganizationModel(String str, String str2, UrlModel urlModel, String str3, String str4, String str5, String str6, Integer num, String str7) {
            this.name = str;
            this.desc = str2;
            this.icon = urlModel;
            this.detailUrl = str3;
            this.donateLink = str4;
            this.orgId = str5;
            this.orgType = str6;
            this.ngoId = num;
            this.fundraiserId = str7;
        }
    }
}
