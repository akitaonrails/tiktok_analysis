package com.ss.android.ugc.aweme.profile.model;

import X.C08FF;
import X.C09CT;
import X.C2188811AlT;
import X.C2254308sP;
import X.InterfaceC2044707zh;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import java.io.Serializable;
import java.util.HashMap;
import java.util.NoSuchElementException;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: loaded from: classes.dex */
public final class UserPermissionData {

    public static final class UserPermissionInfo implements Serializable {

        @C09CT("age_gate_region")
        public String ageGateRegion = "";

        @C09CT("permissions")
        public String permissions = "";

        public final HashMap<String, Boolean> permissionsMap() {
            return (HashMap) GsonProtectorUtils.fromJson(new Gson(), this.permissions, (Class) new HashMap().getClass());
        }

        public String toString() {
            String strLIZIZ;
            if (!a0.LJJJIL(this.ageGateRegion)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("age_gate_region=");
                sbLIZ.append(this.ageGateRegion);
                sbLIZ.append(',');
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            } else {
                strLIZIZ = "";
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append('{');
            sbLIZ2.append(strLIZIZ);
            sbLIZ2.append("permissions=\"");
            String str = this.permissions;
            sbLIZ2.append(str != null ? u.LJJIFFI(str, "\"", "", false) : null);
            sbLIZ2.append("\"}");
            return C2188811AlT.LIZIZ(sbLIZ2);
        }

        public final String getAgeGateRegion() {
            return this.ageGateRegion;
        }

        public final String getPermissions() {
            return this.permissions;
        }

        public final void setAgeGateRegion(String str) {
            this.ageGateRegion = str;
        }

        public final void setPermissions(String str) {
            this.permissions = str;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: classes36.dex */
    public static final class UserPermissionRequestType {
        public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
        public static final /* synthetic */ UserPermissionRequestType[] $VALUES;
        public static final Companion Companion;
        public int type;
        public static final UserPermissionRequestType DEFAULT_TYPE = new DEFAULT_TYPE("DEFAULT_TYPE", 0);
        public static final UserPermissionRequestType COLLECTION_POPUP = new COLLECTION_POPUP("COLLECTION_POPUP", 1);
        public static final UserPermissionRequestType CONFIRM_PROMPT = new CONFIRM_PROMPT("CONFIRM_PROMPT", 2);
        public static final UserPermissionRequestType COLLECTION_CHECKBOX = new COLLECTION_CHECKBOX("COLLECTION_CHECKBOX", 3);

        public static final /* synthetic */ UserPermissionRequestType[] $values() {
            return new UserPermissionRequestType[]{DEFAULT_TYPE, COLLECTION_POPUP, CONFIRM_PROMPT, COLLECTION_CHECKBOX};
        }

        public static InterfaceC2044707zh<UserPermissionRequestType> getEntries() {
            return $ENTRIES;
        }

        static {
            UserPermissionRequestType[] userPermissionRequestTypeArr$values = $values();
            $VALUES = userPermissionRequestTypeArr$values;
            $ENTRIES = new C2254308sP(userPermissionRequestTypeArr$values);
            Companion = new Companion();
        }

        public static UserPermissionRequestType[] values() {
            return (UserPermissionRequestType[]) $VALUES.clone();
        }

        public final int getType() {
            return this.type;
        }

        public static final class Companion {
            public final UserPermissionRequestType fromInt(int i) {
                for (UserPermissionRequestType userPermissionRequestType : UserPermissionRequestType.values()) {
                    if (userPermissionRequestType.getType() == i) {
                        return userPermissionRequestType;
                    }
                }
                throw new NoSuchElementException("Array contains no element matching the predicate.");
            }
        }

        public static UserPermissionRequestType valueOf(String str) {
            return (UserPermissionRequestType) C08FF.LIZ(UserPermissionRequestType.class, str);
        }

        public final void setType(int i) {
            this.type = i;
        }

        public static final class COLLECTION_CHECKBOX extends UserPermissionRequestType {
            @Override // java.lang.Enum
            public String toString() {
                return "passport_pii_collection_checkbox";
            }

            public COLLECTION_CHECKBOX(String str, int i) {
                super(str, i, 3);
            }
        }

        public static final class COLLECTION_POPUP extends UserPermissionRequestType {
            @Override // java.lang.Enum
            public String toString() {
                return "passport_pii_collection_popup";
            }

            public COLLECTION_POPUP(String str, int i) {
                super(str, i, 1);
            }
        }

        public static final class CONFIRM_PROMPT extends UserPermissionRequestType {
            @Override // java.lang.Enum
            public String toString() {
                return "passport_pii_confirm_prompt";
            }

            public CONFIRM_PROMPT(String str, int i) {
                super(str, i, 2);
            }
        }

        public static final class DEFAULT_TYPE extends UserPermissionRequestType {
            @Override // java.lang.Enum
            public String toString() {
                return "DEFAULT_TYPE";
            }

            public DEFAULT_TYPE(String str, int i) {
                super(str, i, 0);
            }
        }

        public UserPermissionRequestType(String str, int i, int i2) {
            this.type = i2;
        }
    }
}
