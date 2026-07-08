package com.bytedance.android.sdk.ticketguard;

import X.C09CT;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes14.dex */
public final class ServerData {

    @C09CT("tickets")
    public final ArrayList<ServerDataItem> itemArray;

    public ServerData(ArrayList<ServerDataItem> arrayList) {
        this.itemArray = arrayList;
    }

    public static final class ServerDataItem {

        @C09CT("ticket")
        public final String ticket;

        @C09CT("ts_sign")
        public final String tsSign;

        public ServerDataItem(String str, String str2) {
            this.ticket = str;
            this.tsSign = str2;
        }
    }
}
