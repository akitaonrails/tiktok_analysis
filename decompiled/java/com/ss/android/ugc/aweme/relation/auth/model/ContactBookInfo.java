package com.ss.android.ugc.aweme.relation.auth.model;

import X.C09CT;
import X.C09DE;

/* JADX INFO: loaded from: classes31.dex */
public final class ContactBookInfo {

    @C09CT("custom_ringtone")
    @C09DE
    public final Boolean customRingtone;

    @C09CT("has_addr")
    @C09DE
    public final Boolean hasAddr;

    @C09CT("has_avatar")
    @C09DE
    public final Boolean hasAvatar;

    @C09CT("has_birthday")
    @C09DE
    public final Boolean hasBirthday;

    @C09CT("contacted")
    @C09DE
    public final Boolean hasContacted;

    @C09CT("has_email")
    @C09DE
    public final Boolean hasEmail;

    @C09CT("has_event")
    @C09DE
    public final Boolean hasEvent;

    @C09CT("has_group")
    @C09DE
    public final Boolean hasGroup;

    @C09CT("has_im")
    @C09DE
    public final Boolean hasIM;

    @C09CT("has_nickname")
    @C09DE
    public final Boolean hasNickname;

    @C09CT("has_note")
    @C09DE
    public final Boolean hasNote;

    @C09CT("has_org")
    @C09DE
    public final Boolean hasOrg;

    @C09CT("has_relation")
    @C09DE
    public final Boolean hasRelation;

    @C09CT("has_website")
    @C09DE
    public final Boolean hasWebsite;

    @C09CT("starred")
    @C09DE
    public final Boolean starred;

    @C09CT("to_voicemail")
    @C09DE
    public final Boolean toVoicemail;

    public ContactBookInfo() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
    }

    public ContactBookInfo(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, Boolean bool9, Boolean bool10, Boolean bool11, Boolean bool12, Boolean bool13, Boolean bool14, Boolean bool15, Boolean bool16) {
        this.hasBirthday = bool;
        this.hasNote = bool2;
        this.hasEvent = bool3;
        this.hasAvatar = bool4;
        this.hasOrg = bool5;
        this.hasEmail = bool6;
        this.hasIM = bool7;
        this.hasRelation = bool8;
        this.hasAddr = bool9;
        this.hasWebsite = bool10;
        this.starred = bool11;
        this.hasNickname = bool12;
        this.hasContacted = bool13;
        this.hasGroup = bool14;
        this.customRingtone = bool15;
        this.toVoicemail = bool16;
    }
}
