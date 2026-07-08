package com.ss.android.ugc.effectmanager.link.model.host;

import X.C2188811AlT;
import android.text.TextUtils;
import java.net.URI;

/* JADX INFO: loaded from: classes24.dex */
public class Host {
    public String host;
    public String path;
    public int port;
    public String schema;
    public long sortTime;
    public long weightTime;

    public long getSortTime() {
        return this.sortTime + this.weightTime;
    }

    public String getItemName() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.schema);
        sbLIZ.append("://");
        sbLIZ.append(this.host);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        if (this.port != -1) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(strLIZIZ);
            sbLIZ2.append(":");
            sbLIZ2.append(this.port);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
        }
        if (TextUtils.isEmpty(this.path)) {
            return strLIZIZ;
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append(strLIZIZ);
        sbLIZ3.append(this.path);
        return C2188811AlT.LIZIZ(sbLIZ3);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Host{weightTime=");
        sbLIZ.append(this.weightTime);
        sbLIZ.append(", schema='");
        sbLIZ.append(this.schema);
        sbLIZ.append('\'');
        sbLIZ.append(", host='");
        sbLIZ.append(this.host);
        sbLIZ.append('\'');
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public String getHost() {
        return this.host;
    }

    public int getPort() {
        return this.port;
    }

    public String getSchema() {
        return this.schema;
    }

    public long getWeightTime() {
        return this.weightTime;
    }

    public Host(String str) {
        this.port = -1;
        URI uriCreate = URI.create(str);
        this.host = uriCreate.getHost();
        this.schema = uriCreate.getScheme();
        this.port = uriCreate.getPort();
        this.path = uriCreate.getPath();
    }

    public boolean hostEquals(Host host) {
        if (host == null || !host.host.equals(this.host) || !host.schema.equals(this.schema)) {
            return false;
        }
        return true;
    }

    public void setHost(String str) {
        this.host = str;
    }

    public void setPort(int i) {
        this.port = i;
    }

    public void setSchema(String str) {
        this.schema = str;
    }

    public void setSortTime(long j) {
        this.sortTime = j;
    }

    public void setWeightTime(long j) {
        this.weightTime = j;
    }

    public Host(URI uri) {
        this.port = -1;
        this.host = uri.getHost();
        this.schema = uri.getScheme();
        this.path = uri.getPath();
    }

    public Host(String str, String str2) {
        this.port = -1;
        this.host = str;
        this.schema = str2;
    }

    public Host(String str, String str2, long j) {
        this.port = -1;
        this.host = str;
        this.schema = str2;
        this.weightTime = j;
    }
}
