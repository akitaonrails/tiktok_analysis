package com.ugc.android.clientai.lang.message;

import X.C08FF;
import X.C09CT;
import X.C0Z11;
import X.C0Z9M;
import X.C2254308sP;
import X.InterfaceC2044707zh;

/* JADX INFO: loaded from: classes15.dex */
public final class Message {
    public static final C0Z11 Companion = new Object() { // from class: X.0Z11
    };

    @C09CT("content")
    public final String content;

    @C09CT("imageContent")
    public final ImageContent imageContent;

    @C09CT("role")
    public final Role role;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Role {
        public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
        public static final /* synthetic */ Role[] $VALUES;
        public static final C0Z9M Companion;
        public final String value;

        @C09CT("assistant")
        public static final Role ASSISTANT = new Role("ASSISTANT", 0, "assistant");

        @C09CT("system")
        public static final Role SYSTEM = new Role("SYSTEM", 1, "system");

        @C09CT("user")
        public static final Role USER = new Role("USER", 2, "user");

        public static final /* synthetic */ Role[] $values() {
            return new Role[]{ASSISTANT, SYSTEM, USER};
        }

        public static InterfaceC2044707zh<Role> getEntries() {
            return $ENTRIES;
        }

        /* JADX WARN: Type inference failed for: r0v4, types: [X.0Z9M] */
        static {
            Role[] roleArr$values = $values();
            $VALUES = roleArr$values;
            $ENTRIES = new C2254308sP(roleArr$values);
            Companion = new Object() { // from class: X.0Z9M
            };
        }

        public static Role[] values() {
            return (Role[]) $VALUES.clone();
        }

        public final String getValue() {
            return this.value;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.value;
        }

        public static Role valueOf(String str) {
            return (Role) C08FF.LIZ(Role.class, str);
        }

        public Role(String str, int i, String str2) {
            this.value = str2;
        }
    }

    public Message() {
        this(Role.SYSTEM, null, null);
    }

    public Message(Role role, String str, ImageContent imageContent) {
        this.role = role;
        this.content = str;
        this.imageContent = imageContent;
    }
}
