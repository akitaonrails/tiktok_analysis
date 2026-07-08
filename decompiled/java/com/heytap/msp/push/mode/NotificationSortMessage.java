package com.heytap.msp.push.mode;

/* JADX INFO: loaded from: classes14.dex */
public class NotificationSortMessage implements Comparable<NotificationSortMessage> {
    public int autoDelete;
    public String group;
    public int importantLevel;
    public boolean isMcs;
    public String messageId;
    public int notifyId;
    public long postTime;
    public String statisticData;

    public NotificationSortMessage(String str, int i, int i2, boolean z, long j, int i3, String str2) {
        this(str, i, i2, z, j, str2);
        this.notifyId = i3;
    }

    public NotificationSortMessage(String str, int i, int i2, boolean z, long j, String str2) {
        this.messageId = str;
        this.importantLevel = i;
        this.autoDelete = i2;
        this.isMcs = z;
        this.postTime = j;
        this.statisticData = str2;
    }

    @Override // java.lang.Comparable
    public int compareTo(NotificationSortMessage notificationSortMessage) {
        if (notificationSortMessage.getPostTime() < this.postTime) {
            return 1;
        }
        return notificationSortMessage.getPostTime() == this.postTime ? 0 : -1;
    }

    public int getAutoDelete() {
        return this.autoDelete;
    }

    public String getGroup() {
        return this.group;
    }

    public int getImportantLevel() {
        return this.importantLevel;
    }

    public String getMessageId() {
        return this.messageId;
    }

    public int getNotifyId() {
        return this.notifyId;
    }

    public long getPostTime() {
        return this.postTime;
    }

    public String getStatisticData() {
        return this.statisticData;
    }

    public boolean isMcs() {
        return this.isMcs;
    }

    public void setGroup(String str) {
        this.group = str;
    }
}
