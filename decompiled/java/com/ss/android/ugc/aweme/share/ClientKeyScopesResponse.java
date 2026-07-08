package com.ss.android.ugc.aweme.share;

import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;

/* JADX INFO: loaded from: classes35.dex */
public final class ClientKeyScopesResponse extends BaseResponse {
    public static final int $stable = 8;
    public DataBean data;

    public static final class DataBean {
        public static final int $stable = 8;
        public String appName;
        public String app_icon;
        public List<ScopesBean> scopes;

        public static final class ScopesBean {
            public static final int $stable = 8;
            public String desc;
            public String name;

            public final String getDesc() {
                return this.desc;
            }

            public final String getName() {
                return this.name;
            }

            public final void setDesc(String str) {
                this.desc = str;
            }

            public final void setName(String str) {
                this.name = str;
            }
        }

        public final String getAppName() {
            return this.appName;
        }

        public final String getApp_icon() {
            return this.app_icon;
        }

        public final List<ScopesBean> getScopes() {
            return this.scopes;
        }

        public final void setAppName(String str) {
            this.appName = str;
        }

        public final void setApp_icon(String str) {
            this.app_icon = str;
        }

        public final void setScopes(List<ScopesBean> list) {
            this.scopes = list;
        }
    }

    public final DataBean getData() {
        return this.data;
    }

    public final void setData(DataBean dataBean) {
        this.data = dataBean;
    }
}
