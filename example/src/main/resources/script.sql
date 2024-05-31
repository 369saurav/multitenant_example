    CREATE TABLE IF NOT EXISTS "department_config_tbl" (
      "tenant_id" UUID,
      "depConfigId" integer PRIMARY KEY,
      "status" CHAR(1),
      "field_config" JSONB
    );

    CREATE TABLE IF NOT EXISTS "department_mstr_tbl" (
      "tenant_id" UUID,
      "dep_id" integer PRIMARY KEY,
      "department_name" VARCHAR(100),
      "custom_fields" JSONB
    );
