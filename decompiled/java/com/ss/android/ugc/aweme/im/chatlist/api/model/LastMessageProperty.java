package com.ss.android.ugc.aweme.im.chatlist.api.model;

import X.C09CT;
import X.C0YUA;
import X.C869590Y9l;
import java.io.Serializable;

/* JADX INFO: loaded from: classes15.dex */
public final class LastMessageProperty implements Serializable {
    public static final C0YUA Companion = new Object() { // from class: X.0YUA
    };

    @C09CT("create_at")
    public final Long create_at_in_seconds;

    @C09CT("idempotent_id")
    public final String idempotent_id;

    @C09CT("key")
    public final String key;

    @C09CT("mark_read")
    public Integer mark_read;

    @C09CT("message")
    public final C869590Y9l message;

    @C09CT("message_id")
    public final String message_id;

    @C09CT("sender_sec_uid")
    public final String sender_sec_uid;

    @C09CT("sender_uid")
    public final String sender_uid;

    @C09CT("value")
    public final String value;

    public LastMessageProperty() {
        this(null, null, null, null, null, null, null, null, null);
    }

    public final Long getCreate_at_in_seconds() {
        return this.create_at_in_seconds;
    }

    public final String getIdempotent_id() {
        return this.idempotent_id;
    }

    public final String getKey() {
        return this.key;
    }

    public final Integer getMark_read() {
        return this.mark_read;
    }

    public final C869590Y9l getMessage() {
        return this.message;
    }

    public final String getMessage_id() {
        return this.message_id;
    }

    public final String getSender_sec_uid() {
        return this.sender_sec_uid;
    }

    public final String getSender_uid() {
        return this.sender_uid;
    }

    public final String getValue() {
        return this.value;
    }

    public final void setMark_read(Integer num) {
        this.mark_read = num;
    }

    public LastMessageProperty(String str, String str2, Long l, String str3, String str4, String str5, String str6, C869590Y9l c869590Y9l, Integer num) {
        this.key = str;
        this.idempotent_id = str2;
        this.create_at_in_seconds = l;
        this.value = str3;
        this.sender_uid = str4;
        this.sender_sec_uid = str5;
        this.message_id = str6;
        this.message = c869590Y9l;
        this.mark_read = num;
    }
}
